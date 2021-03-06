package com.yao;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class SampleFilterByPassWord extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(SampleFilterByPassWord.class);

    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * pre：可以在请求被路由之前调用
     * route：在路由请求时候被调用
     * post：在route和error过滤器之后被调用
     * error：处理请求时发生错误时被调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";// 前置过滤器
    }

    /**
     * filterOrder：通过int值来定义过滤器的执行顺序
     * 优先级为0，数字越大，优先级越低
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * shouldFilter：返回一个boolean类型来判断该过滤器是否要执行
     * 是否执行该过滤器，此处为true，说明需要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        /**
         * 如果前一个过滤器的结果为true，则说明上一个过滤器成功了，
         * 需要进入当前的过滤，如果前一个过滤器的结果为false，
         * 则说明上一个过滤器没有成功，
         * 则无需进行下面的过滤动作了，
         * 直接跳过后面的所有过滤器并返回结果
         */
        return (boolean) ctx.get("isSuccess");
    }

    /**
     * run：过滤器的具体逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

        HttpServletRequest request = ctx.getRequest();

        /**
         * 解决中文乱码
         */
        HttpServletResponse response = ctx.getResponse();
        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        logger.info("请求方法为{},请求的地址为{}",request.getMethod(), request.getRequestURL().toString());

        String passWord = request.getParameter("passWord");// 获取请求的参数
        if(null != passWord && passWord.equals("123")) {// 如果请求的参数不为空，且值为123时，则通过
            ctx.setSendZuulResponse(true);// 对该请求进行路由
            ctx.setResponseStatusCode(200);
            ctx.set("isSuccess", true);// 设值，让下一个Filter看到上一个Filter的状态
            return null;
        }else{
            ctx.setSendZuulResponse(false);// 过滤该请求，不对其进行路由
            ctx.setResponseStatusCode(401);// 返回错误码
            ctx.setResponseBody("{\"result\":\"输入的密码错误!\"}");// 返回错误内容
            ctx.set("isSuccess", false);
            return null;
        }
    }
}
