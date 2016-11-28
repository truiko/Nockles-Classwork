package sortingAlgorithm;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	
	public Pokemon(String name, int level){
		hp = 100;
		this.name = name;
		this.level = 0;
		this.poisoned = false;
	}
	
	public void iChooseYou(String name){
		System.out.println(name + "," + name + "!");
	}
	
	public int getHP(){
		return hp;
	}
	
	public String getName(){
		return name;
	}
	
	public void setHP(int newHP){
		hp = newHP;
	}
	
	public void setPoisoned(boolean b){
		poisoned = b;
	}
	
	public void lapse(){
		if(poisoned){
			hp -= 15;
		}
	}
}
