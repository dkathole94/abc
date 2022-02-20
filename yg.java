package practice;
import java.util.Scanner;

public class yg {
	public static void main(String[] args) {
		double b;
		Scanner s= new Scanner(System.in);
		System.out.println("enter electric unis ");
		b=s.nextDouble();
		if(b>0&&b<=50) {
			b=b*0.50;
			System.out.println("charges = "+b);
			
		}//shkbfhjvsf
		if(b>50&&b<=100) {
			b=b-50;
			b=0.5*50+b*0.75;
			System.out.println("charges = "+b);
		}
		if(b>100&&b<=150) {
			b=b-50;
			b=0.5*50+b*0.75;
			System.out.println("charges = "+b);
		}
		if(b>150&&b<=250) {
			b=b-50-100;
			b=0.5*50+100*0.75+1.2*b;
			System.out.println("charges = "+b);
		}	
		if(b>250&&b<=99999999) {
			b=b-50-100;
			b=0.5*50+100*0.75+1.2*250+1.5*b;
			System.out.println("charges = "+b);
		}	
		
}}
