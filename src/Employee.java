
public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;

	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getWorkHours() {
		return this.workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getHireYear() {
		return this.hireYear;
	}

	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}

	public int bonus() {
		int bonus = 0;
		if (workHours <= 40) {
			return 0;
		} else {
			return (workHours - 40) * 30;
		}
	}

	public double tax() {
		if (salary >= 1000.0) {
			return salary * 0.03;
		} else {
			return 0;
		}
	}

	public double raiseSalary() {
		if (2021 - hireYear < 10 && 2021 - hireYear >= 0) {
			return (this.salary + bonus() - tax()) * 0.05;
		} else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
			return (this.salary + bonus() - tax()) * 0.1;
		} else if (2021 - hireYear > 19) {
			return (this.salary + bonus() - tax()) * 0.15;
		} else {
			return 0.0;
		}
	}

	public double totalSalary() {
		return salary + bonus() + raiseSalary() - tax();
	}

	// Fazladan bir metot yazd�m bu metodun ad� "totalSalary()".
	// Bu metot ile bonus, raise salary ve tax i�leme sokularak
	// ortaya ��kan totalSalary hesaplan�yor.

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear=" + hireYear
				+ "]";
	}
	// Java'da b�t�n class'lar Object s�n�f�ndan miras ald���ndan dolay�,
	// ve biz herhangi bir class'tan extends etmedi�imiz i�in toString metodunu
	// override edebildik.
}