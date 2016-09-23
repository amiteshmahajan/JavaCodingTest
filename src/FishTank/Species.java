package FishTank;

import java.util.HashMap;

public class Species {
	//public int SpeciesCount;
	public int fishCount=0;
	public int Food;
	public static HashMap<String,Species> hmap=new HashMap<String,Species>();

	public String SpecieName;
	void SetspeciesName(String s){
		this.SpecieName=s;
		System.out.println(SpecieName);

		hmap.put(this.toString(), this);
	}
	Species (String s){
		this.SpecieName=s;
		
	}
	Species(){
		
		hmap.put(this.toString(), this);
		SpecieName=this.toString();
		System.out.println(this.toString());
		System.out.println("inside default constructor");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return SpecieName;
	}

}
