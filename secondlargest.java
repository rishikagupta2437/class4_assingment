import java.util.Scanner;

public class secondlargest {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]= new int[10];
		int largest=arr[0];
		int secondlargest=arr[0];
		System.out.println("the given array is:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
				else if (arr[i]>secondlargest) {
					secondlargest=arr[i];
					}
				}
		System.out.println("\nsecond largest no. is:"+ secondlargest);
		}
}


