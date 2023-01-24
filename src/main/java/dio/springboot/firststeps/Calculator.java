package dio.springboot.firststeps;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int somar(int numero1, int numero2) {
		
		return numero1 + numero2;
		
	}
}
