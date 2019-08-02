package component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Basic {
	@Value("123")
	private double basicpay;

	public double getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	
}
