package FishTank;
import java.util.HashMap;

public class Food {
	public static int foodQuantity;
	
//	public static HashMap<String,Fish> hmap=new HashMap<String,Fish>();
	public enum Time {
		morning, noon, evening
	}

	public void feed(Fish objF,Species s, int quant, Time t) {
		foodQuantity += quant;
		objF.setFoodEaten(quant);
	    s.Food+=quant;
		Time tm = t;

	}
}
