package br.com.biondo.enviosms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.biondo.enviosms")
public class EnviosmsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EnviosmsApplication.class, args);
	}
	


}
