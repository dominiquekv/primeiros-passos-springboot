package dio.springboot.firststeps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
	
	@Autowired
	private Calculator calculator;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("O resultado é " + calculator.somar(5, 8));
	}

}
