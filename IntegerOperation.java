package Lab1;
import java.util.Scanner;

public class IntegerOperation {
private int a;
private int b;
	
	//constructor
	public IntegerOperation(int x, int y) {
		a = x;
		b = y;
	}
	
	//set
	public void setNumbers(int x, int y) {
		this.a = x;
		this.b = y;
	}
	
	//get
	public int[] getNumbers() {
		int[] s = new int[2];
		s[0] = this.a;
		s[1] = this.b;
		return s;
	}
		
	//add
	public int add() {
		int result;
		result = this.a + this.b;
		return result;
	}
	
	//substract
	public int substract() {
		int result;
		result = this.a - this.b;
		return result;
	}
	
	//multiply
	public int multiply() {
		int result;
		result = this.a * this.b;
		return result;
	}
	
	//division
	public double division() {
		double result;
		result = (double)this.a / (double)this.b;
		return result;
	}
	
	//divisionInt
	public int divisionInt() {
		int result;
		result = getNumbers()[0] / getNumbers()[1];
		return result;
	}
	
	//remainder
	public int remainder() {
		int result;
		result = getNumbers()[0]-getNumbers()[1]*divisionInt();
		return result;
	}
	
	//main
	public static void main(String[] args) {
		System.out.println("please enter the first integer A:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("please enter the first integer B:");
		int y = sc.nextInt();
		IntegerOperation i = new IntegerOperation(x,y);
		int sum = i.add();
		int difference = i.substract();
		int product = i.multiply();
		double quotient = i.division();
		int quotientInt = i.divisionInt();
		int remainder = i.remainder();
		sc.close();
		
		System.out.println(x + "+" + y + "=" + sum + ";");
		System.out.println(x + "-" + y + "=" + difference + ";");
		System.out.println(x + "x" + y + "=" + product + ";");
		System.out.println(x + "/" + y + "=" + quotient + ";");
		System.out.println(x + "//" + y + "=" + quotientInt + ";");
		System.out.println(x + "%" + y + "=" + remainder + ";");
		System.out.println("Finished!");
	}
	
}
