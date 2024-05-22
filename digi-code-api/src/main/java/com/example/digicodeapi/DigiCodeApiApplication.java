package com.example.digicodeapi;

import com.example.digicodeapi.config.RsaKeyConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyConfigProperties.class)
@SpringBootApplication
public class DigiCodeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigiCodeApiApplication.class, args);
	}

}
