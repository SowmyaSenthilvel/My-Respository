import java.util.*;
public class ArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row1,col1,row2,col2,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows in array1");
		row1=input.nextInt();
		System.out.println("Enter the number of columns in array2");
		col1=input.nextInt();
		int array1[][]=new int[row1][col1];
		System.out.println("Enter the First array elements");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				array1[i][j]=input.nextInt();
			}
			
		}
		System.out.println("Enter the number of rows in array2");
		row2=input.nextInt();
		System.out.println("Enter the number of coloumns in array2");
		col2=input.nextInt();
		int array2[][]=new int[row2][col2];
		
		if(col1!=row2) {
			System.out.println("Matrix mulplication cannot be done");
		}
		else {
			int multiply[][]=new int[row1][col2];
			System.out.println("Enter the Second Array elements ");
			for(int i=0;i<row2;i++) {
				for(int j=0;j<col2;j++) {
					array2[i][j]=input.nextInt();
				}
			}
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<row2;k++) {
						sum=sum+array1[i][k]*array2[k][j];
					}
					multiply[i][j]=sum;
					sum=0;
				}
			}
			System.out.println("Product of the two matrix");
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					if(j==0 && i!=0) {
						System.out.println();
					}
					System.out.print(multiply[i][j]+" ");
					
				}
			}
			
		}
		
	}

}
