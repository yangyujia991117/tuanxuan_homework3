import java.util.Scanner;
  
public class circleComputation{
  public static void main(String args[]){
    double s;
	double c;
	int r;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("input radius:");
	r=scan.nextInt();
	
	c=2*r*Math.PI;
	s=Math.PI*r*r;
	
	System.out.println("The ara is"+s+",the perimeter is"+c);
  }
}
	