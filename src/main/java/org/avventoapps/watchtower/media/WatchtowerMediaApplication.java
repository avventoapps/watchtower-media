package org.avventoapps.watchtower.media;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WatchtowerMediaApplication {

  public static void main(String[] args) {
    SpringApplication.run(WatchtowerMediaApplication.class, args);
  }

}
