package springteste.ch5.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceDemo {

	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:events.xml");
		Resource res1 = ctx.getResource("file:///home/gleiton/Documentos/test.txt");
		displayInfo(res1);
		Resource res2 = ctx.getResource("classpath:test.txt");
		displayInfo(res2);
		Resource res3 = ctx.getResource("http://www.google.com.br");
		displayInfo(res3);
	}
	
	private static void displayInfo(Resource res) throws Exception{
		System.out.println(res.getClass());
		System.out.println(res.getURL().getContent());
		System.out.println("");
	}

}
