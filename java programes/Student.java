import java.util.*;

public class Student{
 public static void main(String args[]){
  int size;
   System.out.println("enter the size of an array");
    Scanner s=new Scanner(System.in);
    size=s.nextInt();
     int a[]=new int[size];
     int i,sum=0;
    System.out.println("enter the numbers");
      for(i=0; i<size;i++){
      a[i]=s.nextInt();
      } 
       for(i=0;i<size;i++){
      sum=sum+a[i];
     }
     System.out.println("the adddition of numbers is:"+sum);
}
}
   
