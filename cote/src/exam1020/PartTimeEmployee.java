package exam1020;

public class PartTimeEmployee extends Employee{
	private int hourRate;
	private int workhours;
	
	public PartTimeEmployee(String name, String employeeId, int hourRate, int workhours) {
		super(name, employeeId);
		this.hourRate = hourRate;
		this.workhours = workhours;
	}
	
	public int getHourRate() {
		return hourRate;
	}
	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}
	public int getWorkhours() {
		return workhours;
	}
	public void setWorkhours(int workhours) {
		this.workhours = workhours;
	}
	
	@Override
	public int calculatePay() {
		return hourRate * workhours;
	}
}
