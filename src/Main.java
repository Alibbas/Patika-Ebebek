
public class Main {

	public static void main(String[] args) {

		Employee ab = new Employee("Ali Baþ", 13500, 48, 2000);
		System.out.println(ab);
		System.out.println("Tax : " + ab.tax());
		System.out.println("Bonus : " + ab.bonus());
		System.out.println("Raise Salary : " + ab.raiseSalary());

	}

}
