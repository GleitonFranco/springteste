package springteste.ch5.context;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageSourceDemo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("file:///home/gleiton/workspace-sts/springteste/src/main/resources/messageSource.xml");
		ctx.refresh();
		Locale english = Locale.ENGLISH;
		Locale czech = new Locale("cs", "CZ");
		System.out.println(ctx.getMessage("msg", null, english));
		System.out.println(ctx.getMessage("msg", null, czech));
		System.out.println(ctx.getMessage("nameMsg", new Object[] { "Clarence",	"Ho" }, english));
	}

}
