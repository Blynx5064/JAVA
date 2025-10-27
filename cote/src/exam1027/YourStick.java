package exam1027;

public class YourStick implements Usb{
	public long size = 32 * 1073741824L;	// 8 Gigabytes
	public long currentUsage = 0;
	
	public YourStick() {
		size = 32 * 1073741824L;
	}
	public YourStick(int giga) {
		size = giga * 1073741824L;
	}
	
	public String read() {
		return "총 " + currentUsage + "";
	}
	public void write(long dataSize) {
		long leftSize = size - currentUsage;
		if(dataSize <= leftSize) {
			currentUsage += dataSize;
		}
	}
}
