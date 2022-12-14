package pl.particle.gwsoft.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"pl.particle.gwsoft.controller", "pl.particle.gwsoft.service"})
@EntityScan("pl.particle.gwsoft.entity")
@EnableJpaRepositories("pl.particle.gwsoft.repository")
public class CarsDealerOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsDealerOnlineApplication.class, args);
	}

}
