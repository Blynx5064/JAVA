package sec04.exam03;

public class ContinueKeyCodeReadExample {
	public static void main(String [] args) throws Exception{
		int KeyCode;
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode: " + KeyCode);
		}
	}
}