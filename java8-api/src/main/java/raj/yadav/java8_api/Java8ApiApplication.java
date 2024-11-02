package raj.yadav.java8_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "raj.yadav.java8_api")
public class Java8ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8ApiApplication.class, args);
	}

}
