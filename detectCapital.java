import java.util.Scanner;

public class detectCapital{
  public static void main(String args[]){
    String s=new String("");
	char[] a=new char[50];
	int i,x=0,j=0,k=0;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("input the string:");
	s=scan.nextLine();
	
	if(s.equals(" "))
	x=1;
	else{
	
	for (i=0;i<s.length();i++){
    a[i] = s.charAt(i);
	}
	
	if(a[0]>='A'&&a[0]<='Z'){
	  for(i=1;i<s.length();i++){
	    if(a[i]>='a'&&a[i]<='z'){
		  j++;
		  }
		if(a[i]>='A'&&a[i]<='Z'){
		  k++;
		  }
		}
	  if(j==s.length()-1||k==s.length()-1){
	    x=1;
		}
	}
	
	if(a[0]>='a'&&a[0]<='z'){
	  for(i=1;i<s.length();i++){
	    if(a[i]>='a'&&a[i]<='z'){
		  j++;
		 }
		}
	  if(j==s.length()-1){
	  x=1;
	  }
	}
	}
	
	if(x==1){
	System.out.println("true");
	}
	else{
	System.out.println("false");
	}
}
}
	
	
	
	
    