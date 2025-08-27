package sec02.exam01;

public class CompareOperator {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;			// -100 * +1 이기 때문에 -100이 나온다.
		int result2 = -x;			// -100 * -1 이기 때문에 +100이 나온다.
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		//byte result3 = -b;		// 부호 연산을 하면 int가 되므로 오류
		int result3 = -b;
		System.out.println("result3 = " + result3);
	}
}
