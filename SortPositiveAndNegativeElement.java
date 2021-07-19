
public class SortPositiveAndNegativeElement {
	
	public static void sortPositiveAndNegativeElement(int array[]) {
		int start=0;
		int end=array.length-1;
		
		int current=0;
		
		while(current<=end) {
			
//			If the value at current index is neg move to the begining
			if(array[current]<0) {
				int temp=array[start];
				array[start]=array[current];
				array[current]=temp;
				start++;
			}
			current++;
		}
	}
	
	public static void printArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int array[]= {-2,10,-11,-11,-2,0,22,-1};
		sortPositiveAndNegativeElement(array);
		
	    printArray(array);
		
		
		
	}
}
