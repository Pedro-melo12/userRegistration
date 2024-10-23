package userRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class UserRegistrationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Oi Peu");
	}

}
