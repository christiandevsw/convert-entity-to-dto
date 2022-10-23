package com.dojo.springbootdtotutorial;

import com.dojo.springbootdtotutorial.model.Location;
import com.dojo.springbootdtotutorial.model.User;
import com.dojo.springbootdtotutorial.repository.LocationRepository;
import com.dojo.springbootdtotutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoTutorialApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Location location=new Location();
		location.setPlace("Pune");
		location.setDescription("Pune is great place to live");
		location.setLongitude(40.5);
		location.setLatitude(30.6);
		locationRepository.save(location);

		User user1=new User();
		user1.setFirstName("Ramesh");
		user1.setLastName("Fadatare");
		user1.setEmail("ramesh@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2=new User();
		user2.setFirstName("Jon");
		user2.setLastName("Cena");
		user2.setEmail("joncena@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	}
}
