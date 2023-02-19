import com.shaoxuan.Main;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Administrator
 * 2023/2/13
 */
class TestMain {
    //创建Logger对象
    private final Logger logger = LoggerFactory.getLogger(TestMain.class);
    @Test
    void testMain() {
        LoggerFactory.getLogger(TestMain.class);
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context-bean.xml");
        //获取对象
        Main main = (Main) context.getBean("main");
        //使用对象调用方法进行测试
        main.print();
        logger.info("方法执行成功!");
    }
}
