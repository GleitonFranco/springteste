package springteste.ch5.profile.highschool;

import java.util.ArrayList;
import java.util.List;

import springteste.ch5.profile.Food;
import springteste.ch5.profile.FoodProviderService;


public class FoodProviderServiceImpl implements FoodProviderService {

	public List<Food> provideLunchSet() {
		List<Food> lunchSet = new ArrayList<Food>();
		lunchSet.add(new Food("Coca-cola"));
		lunchSet.add(new Food("Batata Frita"));
		return lunchSet;
	}

}
