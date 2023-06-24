package br.com.dyonysr.maispao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class MaispaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaispaoApplication.class, args);
	}

}
