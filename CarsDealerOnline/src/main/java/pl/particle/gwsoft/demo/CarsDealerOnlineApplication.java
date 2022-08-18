package pl.particle.gwsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"pl.particle.gwsoft.controller", "pl.particle.gwsoft.service"})
public class CarsDealerOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsDealerOnlineApplication.class, args);
	}

}
