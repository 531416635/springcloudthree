package com.yao.dao2;

import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface InterfaceMapper {
	/**
	 * 1.获取大小科室信息
	 * @param map
	 * @return
	 */
	public Map getDeptInfos(Map map);

	/**
	 * 2、获取医生排班信息
	 * @param map
	 */
	public void getDeptScheduals(Map map);


	/**
	 * 3.实时获取挂号号源
	 * @param map
	 */
	public void getClinicInfos(Map map);

	/**
	 * 4.预约挂号锁号和销号
	 * @param map
	 */
	public  void getLockRecidInfos(Map map);

	/**
	 * 5.挂号确认支付并取号
	 * @param map
	 */
	public void getRecidInfos(Map map);

	/**
	 * 6、确认退号
	 * @param map
	 */
	public void getBackidInfos(Map map);

	/**
	 * 7、就诊卡查询
	 * @param map
	 */
	public void getCardInfos(Map map);

	/**
	 * 8、电子就诊卡建档
	 * @param map
	 */
	public void getCreateCardInfos(Map map);
	/**
	 * 9、查询患者存在的诊间待缴费信息
	 * @param map
	 */
	public void getOutpOrdersCostInfos(Map map);
	/**
	 * 10、HIS确认诊间支付信息
	 * @param map
	 */
	public void getClinicPaymentInfos(Map map);
	/**
	 * 11、患者住院信息查询
	 * @param map
	 */
	public void getInppatientInfos(Map map);

	/**
	 * 12、住院预缴接口
	 * @param map
	 */
	public void getInprechargeInfos(Map map);
	/**
	 * 13、检验报告查询
	 * @param map
	 */
	public void getLabResultInfos(Map map);

	/**
	 * 14、检查报告查询
	 * @param map
	 */
	public void getExamResultInfos(Map map);
	/**
	 * 15 病理报告查询
	 * @param map
	 */
	public void getPathologyResultInfos(Map map);
}
