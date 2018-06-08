import com.yao.rabbitConfig.ConsumerConfig;
import com.yao.rabbitConfig.ProducerConfiguration;

import java.util.concurrent.TimeUnit;

public class RabbitmqApplicationTests {

    public static void main(String[] args) throws InterruptedException, Exception {
        ProducerConfiguration producer = new ProducerConfiguration("e1","q1", "q1");
        ConsumerConfig consumer = new ConsumerConfig("q1", "q1", 5);
        int cout = 0;
        while (true) {
            producer.send("Str: " + cout);
            TimeUnit.SECONDS.sleep(2);
            cout++;

        }
    }

}