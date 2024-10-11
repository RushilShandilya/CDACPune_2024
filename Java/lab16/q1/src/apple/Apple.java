package src.apple;

public class Apple{
	private Integer weight;
	private String color;
	private String taste;

	public Apple(){}
	public Apple(int weight , String color , String taste){
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}
	public int getWeight(){
		return weight;
	}
	public String getColor(){
		return color;
	}
	public String getTaste(){
		return taste;
	}
	@Override
	public String toString(){
		return "Apple:[Weight=" + getWeight()
			+" Color=" + getColor()
			+" Taste=" + getTaste()
			+" ]";
	}
}
