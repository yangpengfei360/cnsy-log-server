/**
 * Description:一些注释<br/>
 * CreateTime:2019-02-28<br/>
 * Creater: yangpengfei360@126.com <br/>
 * @author yangpengfei
 */
package cn.cnsy123.log.registerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:一些注释<br/>
 * CreateTime:2019-02-28<br/>
 * Creater: yangpengfei360@126.com <br/>
 * @author yangpengfei
 */
@EnableEurekaServer
@SpringBootApplication
public class CnsyLogRegisterServer {

    /**
     * Description:一些注释<br/>
     * CreateTime:2019-02-28<br/>
     * Creater: yangpengfei360@126.com <br/>
     * @author yangpengfei
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CnsyLogRegisterServer.class, args);

    }

}
