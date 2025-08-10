public class Overloading{
 int roll;
 String name;
int mobile;
int marks;
public Overloading()
{
  roll=04;
  name="Krushna";
   marks=50;
   mobile=93;
System.out.println("roll no: "+roll+"name: "+name+"Marks: "+marks);
}
  public Overloading(int r){
  roll=r;
System.out.println("roll: "+roll);
} 
public Overloading(int r, String n){
  roll=r;
  name=n;
System.out.println("roll:"+roll +"name: "+name);
}
public static void main(String[] args){
 Overloading s1=new Overloading();
 Overloading s2=new Overloading(04);
 Overloading s3=new Overloading(04,"Krushna");
}
}





  
   
   