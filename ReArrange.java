import java.io.*;
import java.util.*;
public class ReArrange{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n=input.nextInt();
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=input.nextInt();
		}
		Arrays.sort(arr1);
		int[] arr2=new int[n];
		int count,mid;
		if(n%2!=0) {
			mid=n/2;
		}
		else{
			mid=(n/2)-1;
		}
		count=0;
		for(int i=mid;i>=0;i--) {
			arr2[count]=arr1[i];
			count=count+2;
		}
		count=1;
		for(int i=mid+1;i<n;i++) {
			arr2[count]=arr1[i];
			count=count+2;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}

	}

}
