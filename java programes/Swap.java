import java.util.*;

public class Swap{
 public static void main(String args[]){
   int temp;
  
   System.out.println("enter the numbers");
    Scanner s=new Scanner(System.in);
    System.out.println("enter the firts number");
    int a=s.nextInt();
    System.out.println("enetr second number");
     int b=s.nextInt();
      temp=a;
      a=b;
      b=temp;
     System.out.println("the value of a is"+a);
     System.out.println("the vlaue of b is"+b);

}
}


  
  