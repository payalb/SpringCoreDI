package collection_injection_pack;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("collection_injection_pack/beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		// Scanner sc = new Scanner(System.in);
		

		Question bean1 = (Question) factory.getBean("q");

		System.out.println(bean1);

	}
}