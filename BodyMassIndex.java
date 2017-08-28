package Lab2;
import java.util.Scanner;

public class BodyMassIndex {
private double mass;
private double height;
	
	//constructor
	public BodyMassIndex(double m, double h) {
		this.mass = m;
		this.height = h;
	}
	
	// massGetter
	public double getMass() {
		return this.mass;
	}
	
	// heightGetter
	public double getHeight() {
		return this.height;
	}
	
	// massSetter
	public void setMass(double m) {
		this.mass = m;
	}
	
	// heightGetter
	public void setHeight(double h) {
		this.height = h;
	}
	
	// BMIcalculator
	public double calcBMI() {
		double bmi;
		bmi = getMass()/(getHeight()*getHeight());
		return bmi;
	}
	
	// main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input your mass in kg");
		double m = sc.nextDouble();
		System.out.println("please input your height in meters");
		double h = sc.nextDouble();
		sc.close();
		BodyMassIndex bmi = new BodyMassIndex(m,h);
		double index = bmi.calcBMI();
		System.out.println("your BMI is " + index);
		
	}

}
