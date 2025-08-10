
public class Noargument{
int roll_no;
String name;
public Noargument(int roll_no, String name){
this.roll_no=roll_no;
this.name=name;
}
public static void main(String[] args){
Noargument s=new Noargument(04,"Krushna");
System.out.println("student information");
System.out.println("student roll no:"+s.roll_no);
System.out.println("student name:"+s.name);
}
}
