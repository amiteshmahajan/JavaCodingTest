package FishTank;

public class Food {
	public static int foodQuantity;

	public enum Time {
		morning, noon, evening
	}

	public void feed(Fish objF, int quant, Time t) {
		foodQuantity += quant;
		objF.setFoodEaten(quant);
		Time tm = t;

	}
}
