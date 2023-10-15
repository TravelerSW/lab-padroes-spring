package one.digitalinnovation.labpadroesspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * 		-Spring data JPA
 * 		-Spring Web
 * 		-H2 Database
 * 		-OpenFeign
 * 
 * 		@author TravelerSW
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesSpringApplication.class, args);
	}

}
