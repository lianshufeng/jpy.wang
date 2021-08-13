package wang.jpy.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("wang.jpy.web.core")
@SpringBootApplication
public class JpyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpyApplication.class, args);
    }

}
