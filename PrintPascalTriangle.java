import java.util.Scanner;

public class PrintPascalTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of row for pascal traingle");
		int row=sc.nextInt();
		
		int matrix[][]=new int[row+1][row+1];
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				
//				for first column of every row or for every diagonal position
				if(j==1||i==j) {
					matrix[i][j]=1;
					System.out.print("1 ");
					continue;
				}
				
				matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}
}
