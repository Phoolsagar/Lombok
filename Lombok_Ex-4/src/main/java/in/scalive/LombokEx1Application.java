package in.scalive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.scalive.model.User;

@SpringBootApplication
public class LombokEx1Application {

	public static void main(String[] args) {
		SpringApplication.run(LombokEx1Application.class, args);
		
		User user = new User( 21, "Sagar");
		
		
		System.out.println(user.getAge());
		System.out.println(user.getName());
		
		
		
		
		
	}

}
