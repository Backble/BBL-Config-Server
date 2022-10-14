package kr.co.bblconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BblConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BblConfigServerApplication.class, args);
    }

}
