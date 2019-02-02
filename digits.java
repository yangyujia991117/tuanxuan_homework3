import java.util.Scanner;

public class digits{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);

	char[] a=new char[50];
	int i;
	String s=new String("");
	
	System.out.println("input the array:");
	s=scan.next();
	
	for(i=0;i<s.length();i++){
	a[i]=s.charAt(i);
	}
	
	for(i=s.length()-1;i>=0;i--){
	System.out.print(a[i]);
	}
  }
}
	
	