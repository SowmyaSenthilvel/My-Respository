import java.util.*;
import java.lang.Math;
public class SumofWeightage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] array=new int[n];
		int[] arr1=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
		}
		int count=0,temp1,temp2;
		for(int i=0;i<n;i++) {
			if(Math.sqrt (array[i]) * Math.sqrt (array[i])== array[i]) {
				count=count+5;
			}
			if(array[i]%4==0 && array[i]%6==0) {
				count=count+4;
			}
			if(array[i]%2==0) {
				count=count+3;
			}
			arr1[i]=count;
			count=0;
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr1[i]<arr1[j]) {
					temp1=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp1;
					temp2=array[i];
					array[i]=array[j];
					array[j]=temp2;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println("<"+array[i]+","+arr1[i]+">");
		}
		

	}

}
