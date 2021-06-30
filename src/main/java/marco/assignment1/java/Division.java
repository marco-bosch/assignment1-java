package marco.assignment1.java;

public class Division {
	double number1;
	double number2;

	Division(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double result() {
		return number1 / number2;
	}
}