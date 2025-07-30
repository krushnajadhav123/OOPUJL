import java.util.*;

public class Positive{
 public static void main(String args[]){
  
   System.out.println("enter the numbers");
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int a=s.nextInt();
    if(a>0){
      System.out.println("the number is positive");
    
     }
    else if(a==0){
    System.out.println("the number is 0");
   }
    else{
      System.out.println("the number is negative");
    }

     

}
}

