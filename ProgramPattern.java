import java.util.*;
public class ProgramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=input.next();
		if(str.length()%2==0) {
			System.out.println("The entered string is even");
		}
		else {
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<str.length();j++) {
					if(j==i || j==(str.length()-1-i)) {
						System.out.print(str.charAt(j));
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		

	}

}
