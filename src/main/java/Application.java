import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
//CustomerService service = (CustomerService) new CustomerServiceImpl();

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService service = appContext.getBean("customerService", CustomerService.class);
	//	System.out.println(service);
		System.out.println(service.findAll().get(0).getFirstName());
		CustomerService service2 = appContext.getBean("customerService", CustomerService.class);
		//System.out.println(service2);

	}

}
