package springteste.ch5.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSimpleEx2 {
	public static void main(String[] args) {
		// A diferenca esta aqui
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MessageRenderer renderer =
				ctx.getBean("messageRenderer", MessageRenderer.class);
		renderer.render();
	}
}
