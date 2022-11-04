package ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		BeanFactory beanFactory = applicationContext;
		
		Medico medico1 = (Medico)beanFactory.getBean("operarConJeringa");
		
		medico1.operar();
		
		Medico medico2 = (Medico)beanFactory.getBean("operarConBisturi");
		
		medico2.operar();
	}

}
