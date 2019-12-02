package tn.rnu.isetch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Tp2EurekaServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2EurekaServer1Application.class, args);
	}

}
