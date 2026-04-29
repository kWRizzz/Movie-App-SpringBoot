package krishu.dev.movieApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieAppApplication.class, args);
	}

//	gd2Ae4n1Ka9wZCR1 kbhargava120_db_user for future use
	@GetMapping("/")
	public String apiRoot(){
		return "Hello World";
	}
}
