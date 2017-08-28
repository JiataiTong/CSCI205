package Lab2;
import java.util.Scanner;

public class Stats5 {
	
	//generate a random double list
	public double[] gernerateRDList(int x) {
		double[] mylist = new double[x];
		int i = 0;
		while(i<x){
			mylist[i] = Math.random();
			i=i+1;
		}
		return mylist;
	}
	
	//print the list
	public void printRDList(double[] x) {
		int l = x.length;
		int i = 0;
		while(i<l) {
			System.out.println(x[i]);
			i = i+1;
		}
	}
	
	//compute average
	public double calcAve(double[] mylist) {
		double sum = 0.0;
		int l = mylist.length;
		int i = 0;
		while(i<l) {
			sum = sum+mylist[i];
			i = i+1;
		}
		return sum/l;
	}
	
	//compute the max
	public double calcMax(double[] mylist) {
		double max = -1.0;
		int l = mylist.length;
		int i = 0;
		while(i<l) {
			if(max==-1.0) {
				max = mylist[i];
			}
			
			else {
				if(max < mylist[i]) {
					max = mylist[i];
				}
			}
			i = i+1;
		}
		return max;
	}
	
	//compute the min
	public double calcMin(double[] mylist) {
		double min = -1.0;
		int l = mylist.length;
		int i = 0;
		while(i<l) {
			if(min==-1.0) {
				min = mylist[i];
			}
			
			else {
				if(min < mylist[i]) {
					min = mylist[i];
				}
			}
			i = i+1;
		}
		return min;
	}
	
	//print the result
	public void printR(double[] mylist) {
		double ave = calcAve(mylist);
		double min = calcMin(mylist);
		double max = calcMax(mylist);
		System.out.println("Average = " + ave);
        System.out.println("Min     = " + min);
        System.out.println("Max     = " + max);
	}
	
	//main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the size of random numbers(An Integer)");
		int n = sc.nextInt();
		sc.close();
		Stats5 s = new Stats5();
		double[] rDList = s.gernerateRDList(n);
		double ave = s.calcAve(rDList);
		double max = s.calcMax(rDList);
		double min = s.calcMin(rDList);
		s.printRDList(rDList);
		System.out.println("Average = " + ave);
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
	}
}
