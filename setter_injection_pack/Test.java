package setter_injection_pack;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("setter_injection_pack/beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		// Scanner sc = new Scanner(System.in);
		

		Employee bean1 = (Employee) factory.getBean("obj");

		System.out.println(bean1);

	}
}