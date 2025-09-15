package sec04.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasStare = myCar.isLeftGas();
		if(gasStare){
			System.out.println("출발합니다.");
		} 
		
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}
		else {
			System.out.println("gas를 주입하세요");
		}
	}
}
