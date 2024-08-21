package oasis.SUPERNOVA;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupernovaApplication {

	public static void main(String[] args) {
		//Dotenv dotenv = Dotenv.load();
		SpringApplication.run(SupernovaApplication.class, args);
	}

}
