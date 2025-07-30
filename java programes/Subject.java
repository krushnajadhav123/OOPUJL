import java.util.*;
public class Subject{
public static void main(String args[]){
 System.out.println("welcome to persentage calculater");
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the marks of math");
   float a=sc.nextFloat();
      System.out.println("enter the marks of physics");
    float b=sc.nextFloat();
     System.out.println("enter the marks of bio");
       float c=sc.nextFloat();
       System.out.println("inter the marks of chemistry");
         float d=sc.nextFloat();
     float e=(a+b+c+d)*100/4;
       System.out.println("the persentage of given student data is"+e);
}
}
        
  