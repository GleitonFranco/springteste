package springteste.ch5.profile.kindergarten;

import java.util.ArrayList;
import java.util.List;

import springteste.ch5.profile.Food;
import springteste.ch5.profile.FoodProviderService;


public class FoodProviderServiceImpl implements FoodProviderService {

	public List<Food> provideLunchSet() {
		List<Food> lunchSet = new ArrayList<Food>();
		lunchSet.add(new Food("Milk"));
		lunchSet.add(new Food("Biscuits"));
		return lunchSet;
	}

}
