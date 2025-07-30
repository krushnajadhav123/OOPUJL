import java.util.*;

public class Fac1{
 public static void main(String args[]){
  int n;
   System.out.println("enter the number");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int fac=1;
    for(int i=n;i>=n;i--){
     fac=fac*i;
    }
    System.out.println("the fact is"+fac);
}
}