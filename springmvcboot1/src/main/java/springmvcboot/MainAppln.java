package springmvcboot;

import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"springmvcboot"})
public class MainAppln {

	public static void main(String[] args) {
		System.out.println("welcomemain");
		SpringApplication.run(MainAppln.class, args);
	}
}
