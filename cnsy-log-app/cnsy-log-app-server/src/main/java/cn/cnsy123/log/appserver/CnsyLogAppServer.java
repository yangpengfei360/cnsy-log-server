/**
 * Description:一些注释<br/>
 * CreateTime:2019-03-01<br/>
 * Creater: yangpengfei360@126.com <br/>
 * @author yangpengfei
 */
package cn.cnsy123.log.appserver;
/**
 * Description:一些注释<br/>
 * CreateTime:2019-03-01<br/>
 * Creater: yangpengfei360@126.com <br/>
 * @author yangpengfei
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CnsyLogAppServer {
    
    public static void main(String[] args) {
        
        SpringApplication.run(CnsyLogAppServer.class, args);
    }

}
