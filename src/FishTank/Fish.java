package FishTank;
import java.util.HashMap;

public class Fish {
	private int fishCount;
	private String fishName;
	public String fishSpeciesName;
	public int foodEaten=0;
	public static int totalFish=0;
	
	/**
	 * @return the fishCount
	 */
	public int getFishCount() {
		return fishCount;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return fishSpeciesName;
	}
	
	/**
	 * @return the foodEaten
	 */
	public int getFoodEaten() {
		return foodEaten;
	}
	/**
	 * @param foodEaten the foodEaten to set
	 */
	public void setFoodEaten(int foodEaten) {
		this.foodEaten += foodEaten;
	}
	/**
	 * @param fishCount the fishCount to set
	 */
	public void setFishCount(int fishCount) {
		this.fishCount = fishCount;
	}
	/**
	 * @return the fishName
	 */
	public String getFishName() {
		return fishName;
	}
	/**
	 * @param fishName the fishName to set
	 */
	public void setFishName(String fishName) {
		this.fishName = fishName;
	}
		public void speciesName(String speciesName){
			this.fishSpeciesName=speciesName;
	} 
		Fish(){
			totalFish+=1;
			
		}
		Fish(Species s){
			s.fishCount+=1;
			totalFish+=1;
			
//			hmap.put(this.fishSpeciesName, this);
		}
}