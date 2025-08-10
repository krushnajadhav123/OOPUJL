
public class Parameterize{
int roll_no;
String name;
public Parameterize(int roll_no, String name){
this.roll_no=roll_no;
this.name=name;
}
public static void main(String[] args){
Parameterize s=new Parameterize(04,"Krushna");
System.out.println("student information");
System.out.println("student roll no:"+s.roll_no);
System.out.println("student name:"+s.name);
}
}

