package exam1013;

public class BulgogiPizza extends Pizza{
	public BulgogiPizza() {this("M");};
	public BulgogiPizza(String size) {
		this.name = "불고기";
		this.size = size;
		this.prices = new int[] { 15000, 20000, 25000 };
		this.toppings = "Bulgogi";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings+"을 추가합니다.");
		super.cook();
	}
}
