public class Thiskey{
 int roll;
 String name;
int marks;
public Thiskey(int roll,String name,int marks){
this.roll=roll;
this.name=name;
this.marks=marks;
}
 public void display(){
System.out.println("roll: "+roll+"name: "+name+"marks: "+marks);
} 
 public static void main(String[] args){
  Thiskey s=new Thiskey(04,"Krushna",99);
  s.display();
}
}



