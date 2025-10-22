package exam1013;

public class PeperoniPizza extends Pizza{
	public PeperoniPizza() {this("M");};
	public PeperoniPizza(String size) {
		this.name = "페퍼로니 피자";
		this.size = size;
		this.prices = new int[] { 12000, 17000, 22000 };
		this.toppings = "Peperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"을 추가합니다.");
		super.cook();
	}
}
