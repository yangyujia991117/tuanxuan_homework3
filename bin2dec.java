import java.util.Scanner;

public class bin2dec{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
	int[] b=new int[50];
	int c=0,d,i,x;
	String s=new String("");
	char[] a=new char[50];
	
	System.out.println("input the binary:");
	s=scan.next();
	
	for (i=0;i<s.length();i++){
    a[i]=s.charAt(i);
	}
	
	i=0;
    while(a[i]!='\0'){
	  b[i]=Integer.valueOf(a[i])-48;
	  i++;
	  }
	  
	int n=i;
	
     for(i=(n-1);i>=0;i--){
	  d=b[i];
	  if(i==(n-1)){
		  d=d;
	  }
	  else{
	  for(x=1;x<=(n-i-1);x++){
	    d=d*2;
		}
	  }
	  c=c+d;
	 }
	 
	System.out.println(c);
  }
}
	  
	
	
	
	
	  
	
	  
	
	