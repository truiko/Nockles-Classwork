package sortingAlgorithm;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level){
		name = "";
		level = 0;
		hp = 100;
		poisoned = false;
	}
	public void iChooseYou(String name){
		System.out.println(name + "\n" + name);
	}
	
	public int getHP(){
		return 0;
	}
	
	public String getName(){
		return null;
	}
	
	public void setHP(int newHP){
		
	}
	
	public void setPoisoned(boolean b){
		
	}
	
	public void lapse(){
		if(poisoned){
			hp -= 15;
		}
	}
}
