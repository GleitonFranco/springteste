package springteste.ch5.profile;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ProfConfMain {
	// o profile poderia tb ser passado com vararg no main()
	// -Dspring.profiles.active="kindergarten"
	public static void main(String[] args) {
//		String profile = "highschool";
		String profile = "kindergarten";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(profile);
		ctx.load("classpath:profile/*-config.xml");
		ctx.refresh();
		FoodProviderService foodProviderService =
				ctx.getBean("foodProviderService", FoodProviderService.class);
		List<Food> lunchSet = foodProviderService.provideLunchSet();
		for (Food food: lunchSet) {
			System.out.println("Food: " + food.getName());
		}
	}

}
