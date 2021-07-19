import java.util.Scanner;

public class PrintPrimeInRange {
	
//	A function for telling whether the number is prime or not
	public static boolean checkPrime(int num) {
		boolean isPrime=true;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter starting range value");
		int n1=sc.nextInt();
		
		System.out.println("Enter ending range value");
		int n2=sc.nextInt();

		System.out.println("Prime number in the range : ("+n1+","+n2+") are :");
		for(int i=n1;i<=n2;i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		sc.close();
		
	}
}
