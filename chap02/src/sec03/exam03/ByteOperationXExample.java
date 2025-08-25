package sec03.exam03;

public class ByteOperationXExample {		// Operator = 연산
	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		//byte result = x + y ;	// 에러, 사칙연산 값은 모두 int값으로 나옴.
		int result2 =  x + y;
		System.out.println(result2);
	}
}