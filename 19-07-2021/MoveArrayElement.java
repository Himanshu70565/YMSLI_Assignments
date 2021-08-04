import java.util.Scanner;

public class MoveArrayElement {
	
	public static int findPosition(int array[],int num) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==num) {
				return i;
			}
		}
		
//		number not found
		return -1;
	}
	
	public static void printArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		
		System.out.println("Enter the element of the array");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		
		System.out.println("Current array is :");
		printArray(array);
		
		System.out.println("Enter the number from where shifting has to take place");
		
		int shiftNumber=sc.nextInt();
		int shiftNumberPosition=findPosition(array, shiftNumber);
		
		System.out.println("Enter the number to be replaced");
		int replacedNumber=sc.nextInt();
		
		if(shiftNumberPosition==-1) {
			System.out.println("No such number present in the matrix");
			return;
		}
		
		int i=size-1;
		
		while(i>shiftNumberPosition) {
			array[i]=array[i-1];
			i--;
		}
		
		array[shiftNumberPosition]=replacedNumber;
		
		
		System.out.println("Array after replacement is :");
		printArray(array);
	}
}
