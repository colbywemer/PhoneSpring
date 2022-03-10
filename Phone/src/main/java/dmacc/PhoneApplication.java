package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Phone;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PhoneRepository;

@SpringBootApplication
public class PhoneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PhoneApplication.class, args);
	}
	@Autowired
	PhoneRepository repo;
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Phone p = appContext.getBean("phone", Phone.class);
		p.setStorageSize(512);
		repo.save(p);
		Phone p2 = new Phone(128, 4, "iPhone 13", "2532 x 1170", "A15");
		repo.save(p2);
		List<Phone> allMyPhones = repo.findAll();
		for(Phone phone: allMyPhones) {
			System.out.println(phone.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
