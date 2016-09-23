package FishTank;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class FishTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Species goldFish = new Species();
		Species s2 = new Species();
		Species s3 = new Species();
		Species s4 = new Species();
		Species s5 = new Species();
		Species s6 = new Species();
		Species s7 = new Species();
		goldFish.SetspeciesName("goldfish");
		s2.SetspeciesName("s2");
		s3.SetspeciesName("s3");
		s4.SetspeciesName("s4");
		s5.SetspeciesName("s5");
		Fish f1 = new Fish(s2);
		Fish f2 = new Fish(s2);
		Fish f3 = new Fish(s2);
		Fish f4 = new Fish(s2);
		Fish f5 = new Fish(s2);

		Fish f1s3 = new Fish(s3);
		Fish f2s3 = new Fish(s3);
		Fish f3s3 = new Fish(s3);
		Fish f4s3 = new Fish(s3);
		Fish f5s3 = new Fish(s3);

		Fish f1s4 = new Fish(s4);
		Fish f2s4 = new Fish(s4);
		Fish f3s4 = new Fish(s4);
		Fish f4s4 = new Fish(s4);
		Fish f5s4 = new Fish(s4);

		// System.out.println(s4.fishCount);
		Food food = new Food();
		Food.Time t = null;
		food.feed(f1, 10, t.evening);
		food.feed(f2, 10, t.evening);
		food.feed(f3, 10, t.evening);
		food.feed(f4, 10, t.evening);

		double fedPerDay = 0.0d;
		System.out.println("Enter your choice:");
		System.out.println("\n1.Get avg food eaten by fish.");
		System.out.println("\n2.Get average food eaten by particular specie");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1: {
			System.out.println("total fishes:" + Fish.totalFish + "\ntotal food eaten by all the fishes:"
					+ Food.foodQuantity + "gms");
			float avg = Food.foodQuantity / Fish.totalFish;
			System.out.println("Average food eaten by indivudual fish:" + avg + "gms");

		}
		case '2': {
			System.out.println("Enter specie name");
			String sName = sc.next();
			int foodEatenBySpecie = 0;
			if (Fish.hmap.containsKey(sName)) {
				Iterator it = Fish.hmap.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					Fish t1 = new Fish();
					t1 = (Fish) pair.getValue();
					foodEatenBySpecie += t1.getFoodEaten();
//					System.out.println(pair.getKey() + " = " + pair.getValue());
					it.remove(); // avoids a ConcurrentModificationException
				}

			} else {
				System.out.println("no such specie found in fish tank");
			}
		}
		case '3': {

		}
		case '4': {

		}
		default: {
			System.out.println("invalid input");
		}
		}

	}

}
