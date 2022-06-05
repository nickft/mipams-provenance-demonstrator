package org.mipams.fake_media.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoApplication.class, args);
        logger.info("Provenance Server is up and running");
    }
}
