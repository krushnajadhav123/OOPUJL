import java.util.*;

public class Condition{
 public static void main(String args[]){
  int n;
   System.out.println("enter the number");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
   if(n%2==0){
    System.out.println("the number is even");
  }
   else{
    System.out.println("the number is odd");
}
}
}