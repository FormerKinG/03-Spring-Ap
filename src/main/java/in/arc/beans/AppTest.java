package in.arc.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/Beans.xml");
		
		PaymentService service = applicationContext.getBean(PaymentService.class);
		
		service.doPayment(1997.21);
	}

}
