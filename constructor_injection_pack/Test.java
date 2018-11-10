package constructor_injection_pack;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("constructor_injection_pack/beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		// Scanner sc = new Scanner(System.in);
		Employee bean1, bean2;

		bean1 = (Employee) factory.getBean("e");
		bean2 = (Employee) factory.getBean("twoparam");
		System.out.println(bean1);
		System.out.println(bean2);
		bean1.show();
		bean2.show();

		// for (int i = 0; i < 5; i++) {
		// bean = (Employee) factory.getBean("e");
		// System.out.println(bean);
		// bean.show();
		// System.out.println("Enter any key ");
		// String next = sc.next();
		// }

		// Employee e = new Employee(10, "Kiran");

		// for (int i = 0; i < 5; i++) {
		// e = new Employee(10, "Kiran");
		//
		// System.out.println(e);
		// System.out.println("enter any key ");
		// String next = sc.next();
		// }

	}
}