package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
				String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			if(inputData.equals("q")) {		// String은 클래스 함수이기 때문에 equals로 비교 해야 함.
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}