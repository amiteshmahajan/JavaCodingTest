package FishTank;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class FishTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Species goldFish = new Species("goldfish");
		Species s2 = new Species("s2");
		Species s3 = new Species("s3");
		Species s4 = new Species("s4");
		Species s5 = new Species("s5");
		Species s6 = new Species("s6");
		Species s7 = new Species("s7");
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
		food.feed(f1, goldFish, 10, t.evening);
		food.feed(f2, goldFish, 10, t.evening);
		food.feed(f3, goldFish, 10, t.evening);
		food.feed(f4, goldFish, 10, t.evening);

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
			float avg =(float) Food.foodQuantity / Fish.totalFish;
			System.out.println("Average food eaten by indivudual fish:" + avg + "gms");break;

		}
		case 2: {
			System.out.println("Enter specie name");
			String sName = sc.next();
			Species s = Species.hmap.get(sName);
			System.out.println(s.SpecieName);	
			if (Species.hmap.containsKey(sName)) 
			{
				System.out.println("specie found!");
//				Species s = Species.hmap.get(sName);
				System.out.println(s.SpecieName);
				float avgSpecies = s.Food / s.fishCount;
				System.out.println("Avg food eaten by fishes of " + sName + " is =" + avgSpecies);
			} 
			else 
			{
				System.out.println("specie not found in the tank");
			}break;
		}
//		case '3': {
//
//		}
//		case '4': {
//
//		}
		default: {
			System.out.println("invalid input");
		}
		}

	}

}
