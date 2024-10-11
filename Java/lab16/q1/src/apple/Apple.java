package src.apple;

public class Apple{
	private int weight;
	private String color;
	private String taste;

	public Apple(){}
	public Apple(int weight , String color , String taste){
		this.weight = weight;
		this.color = color;
		this.taste = taste;
	}
	public getWeight(){
		return weight;
	}
	public getColor(){
		return color;
	}
	public getTaste(){
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
