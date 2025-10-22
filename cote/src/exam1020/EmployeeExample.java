package exam1020;

public class EmployeeExample {
	public static void main(String [] args) {
		Employee[] emps = new Employee[2];
		emps[0] = new FullTimeEmployee("김자바", "123456", 400000000);
		emps[1] = new PartTimeEmployee("이자바", "456789", 200000, 160);
		
		for(int i = 0; i < emps.length; i ++) {
			System.out.print(emps[i].getName() + " , ");
			System.out.println(emps[i].calculatePay());
		}
	}
}
