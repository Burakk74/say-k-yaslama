package buyukucuk;
import java.util.Scanner;

 

public class buyukucuk {
	
	public static void main(String[] args) {
	 
			try {
				Scanner input = new Scanner(System.in);
				 System.out.print("A değeri : ");
				 double a = input.nextDouble();
				 System.out.print("B değeri : ");
				 
				 double b = input.nextDouble();
			 
				 System.out.print("C değeri : ");
				 double c = input.nextDouble();
				 
				 
				 if(a > b && a > c ) {
					 if(b > c) {
						 System.out.println("A > B > C");
					 }
					 else if (c > b) {
						 System.out.println("A > C > B");
					 }
					 else {
						 System.out.println("A > B = C");
					 }
				 }
				 else if(b > a && b > c) {
					 if(a > c) {
						 System.out.println("B > A > C");
					 }
					 else if(c > a) {
						 System.out.println("B > C > A");
					 }
					 else {
						 System.out.println("B > A = C");
					 }
				 }
				 else if (c > a && c > b) {
					 if(b > a) {
						 System.out.println("C > B > A");
					 }
					 else if(a > b) {
						 System.out.println("C > A > B");
					 }
					 else {
						 System.out.println("C > A = B");
					 }
				 }
				 else {
					 if(a == b && a > c) {
						 System.out.println("A = B > C");
					 }
					 else if(b == c && b > a) {
						 System.out.println("B = C > A");
					 }
					 else if( a == c && a > b) {
						 System.out.println("C = A > B ");
					 }
					 else {
						 System.out.println("A = B = C");
					 }
				 }
			}
			catch (Exception ex){
				System.out.println("Sayı değeri girdiğinizden emin olun !");
				
			}
		  
	}

}
