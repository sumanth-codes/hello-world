import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray{
	public static void main(String[] args) {
		int temp = 0;
		Scanner input=new Scanner(System.in);
		System.out.println("give size of the array: ");
		int arraySize = input.nextInt();
		int[] array = new int[arraySize];
		for (int i=0;i<arraySize; i++) {
			array[i]=input.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(array));
		for(int i=0;i<(arraySize/2);i++){
			temp=array[arraySize-i-1];
			array[arraySize-1-i] = array[i];
			array[i]=temp;
		}
		System.out.println("The reversed array is "+Arrays.toString(array));
		
		// searching an element in unsorted array 'array'
		System.out.println("give the Number to be searched in array");
		int num=input.nextInt();
		for(int i=0;i<arraySize;i++){
			if(num==array[i]){
				System.out.println(num+" is in array at "+i+" index");
				break;
			}
		}
	}
}
