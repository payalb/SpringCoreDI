package inheritance_bean;

import java.applet.AppletContext;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("inheritance_bean/beans.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		// ac is a DI container
		// AppletContext ac = (AppletContext) new
		// ClassPathResource("inheritance_bean/beans.xml");
		// TomcatServer tc = new TomcatServer("web.xml");
		// tc is a servlet container
		Scanner s = new Scanner(System.in);
		System.out.println("Enter key ");

		// Scanner sc = new Scanner(System.in);

		{

			Employee bean1 = (Employee) factory.getBean("e2");

		}

		System.out.println();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(bean1);

	}
}