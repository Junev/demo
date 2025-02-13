package com.example.oauthserver;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;


@SpringBootApplication
@ServletComponentScan
@MapperScan("com.example.oauthserver.mapper")
@MapperScan("com.example.repository.mapper")
@EnableCaching
public class OauthApplication {
    private static final Logger logger
            = LoggerFactory.getLogger(OauthApplication.class);

    public static void main(String[] args) throws UnknownHostException {
//        SpringApplication.run(DemoApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(OauthApplication.class);
        ConfigurableApplicationContext application = builder.bannerMode(Banner.Mode.OFF).run(args);

        Environment env = application.getEnvironment();
        String ip = InetAddress.getLocalHost().getHostAddress();
        String port = env.getProperty("server.port");
        String contextPath = env.getProperty("server.servlet.context-path");
        String path = contextPath != null ? contextPath : "";
//        System.out.println("\n----------------------------------------------------------\n\t" +
//                "Application demo is running! Access URLs:\n\t" +
//                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
//                "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
//                "Swagger-ui: \thttp://" + ip + ":" + port + path + "/swagger-ui/index.html\n\t" +
////                "Doc文档: \thttp://" + ip + ":" + port + path + "/doc.html\n" +
//                "----------------------------------------------------------");
        logger.info("\n----------------------------------------------------------\n\t" +
                "Application demo is running! Access URLs:\n\t" +
                "Local: \t\thttp://localhost:" + port + path + "/\n\t" +
                "External: \thttp://" + ip + ":" + port + path + "/\n\t" +
                "Swagger-ui: \thttp://" + ip + ":" + port + path + "/swagger-ui/index.html\n" +
//                "Doc文档: \thttp://" + ip + ":" + port + path + "/doc.html\n" +
                "----------------------------------------------------------\n");
    }

    @Autowired
    private RestTemplateBuilder builder;

    @Bean
    public RestTemplate restTemplate() {
        return builder.build();
    }

}
