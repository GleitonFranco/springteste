package springteste.ch5.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Publisher implements ApplicationContextAware {

	private ApplicationContext ctx;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.ctx = applicationContext;

	}

	public static void main(String[] args) {
//		String classpath System.getProperty("java.class.path");
//		String[] classpathEntries = classpath.split(File.pathSeparator);
		
//	"file:///home/gleiton/workspace-sts/springteste/src/main/resources/events.xml"
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:events.xml"
		);
		Publisher pub = (Publisher) ctx.getBean("publisher");
		pub.publish("Hello World!");
		pub.publish("The quick brown fox jumped over the lazy dog");
	}

	public void publish(String message) {
		ctx.publishEvent(new MessageEvent(this, message));
	}

}
