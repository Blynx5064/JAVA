package exam1027;

public class PCExample {
	public static void main(String [] args) {
		Usb u1 = new MyStick();
		Usb u2 = new YourStick();
		PC pc = new PC();
		pc.setPort1(u1);
		pc.port1.read();
		System.out.println(pc.port1.read());
		pc.setPort2(u2);
		pc.port2.read();
		System.out.println(pc.port2.read());
	}
}
