package net.com.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import net.com.group.model.User;
import net.com.group.repository.UserRepository;


@SpringBootApplication
public class SpringBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBackendApplication.class, args);
	}

	@Autowired
    private UserRepository userRepository;

    @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Ramesh", "Tilak", "ramesh@gmail.com"));
        this.userRepository.save(new User("Ali", "Baba", "tom@gmail.com"));
        this.userRepository.save(new User("Bruce", "Wayne", "tony@gmail.com"));
    }
}
