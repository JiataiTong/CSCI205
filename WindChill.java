package Lab2;
import java.util.Scanner;

public class WindChill {
	private double t;
	private double v;
	private double w;
	private int keyW;
	
	public WindChill(double x, double y) {
		this.t = x;
		this.v = y;
		this.w = 0;
		this.keyW = 0;
	}
	
	//set t
	public void setT(double x) {
		this.t = x;
	}
	
	//set v
	public void setV(double x) {
		this.v = x;
	}
	
	//set w
	public void setW(double x) {
		this.w = x;
		this.keyW = 1;
	}
	
	//get t
	public double getT() {
		return this.t;
	}
	
	//get v
	public double getV() {
		return this.v;
	}
	
	//get w
	public double getW() {
		if (this.keyW == 0){
			System.out.println("there is no valid wind_chill value");
			return 0.0;
		}
		else {
			return this.w;
		}
	}
	
	//calculate w
	public double calcW() {
		double result = 35.74 + 0.6215*getT() + (0.4275*getT() - 35.75) * Math.pow(getV(), 0.16);
		setW(result);
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the temperature");
		double a = scan.nextDouble();
		System.out.println("please enter the wind speed");
		double b = scan.nextDouble();
		WindChill wc1 = new WindChill(a,b);
        double c = wc1.calcW();
        scan.close();
        System.out.println("Temperature = " + a);
        System.out.println("Wind speed  = " + b);
        System.out.println("Wind chill  = " + c);
    }
}
