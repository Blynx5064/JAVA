package sec03.exam04;

public class LongOperationExample {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;		// 사칙연산중 하나라도 long 타입이 있다면 값도 long으로 나온다.
		System.out.println(result);
	}
}