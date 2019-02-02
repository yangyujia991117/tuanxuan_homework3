import java.util.Scanner;

public class climbStairs{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
	int n,a,b=0,y=0,o=1,p=1,q=1,i;
	
	System.out.println("input the number:");
	n=scan.nextInt();
	
	if(n==1)
	y=1;
	else{
	a=n/2;
	if(n%2==1){
	    b=1;
	}
	if(n%2==0){
		b=0;
	}
	while(b<=n){
	  if((b==0)||(a==0)){
	  y=y+1;
	  }
	  if((b!=0)&&(a!=0)){
	    for(i=1;i<=(a+b);i++){
		  o=o*i;
		  }
		for(i=1;i<=a;i++){
		  p=p*i;
		  }
		for(i=1;i<=b;i++){
		  q=q*i;
		  }
		y=y+o/(p*q);
		o=1;
		p=1;
		q=1;
		 }
	   a--;
	   b=b+2;
	   }
	}
	
	System.out.println(y);
	}
}
	
	
	  
	
	