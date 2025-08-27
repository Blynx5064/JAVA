package sec02.exam05;

public class CharOperationExmaple {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;				// 산술 연산을 하면 int 타입이 되기 떄문에 char가 아니고 int로 선언을 해야 한다.
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
	}
}
