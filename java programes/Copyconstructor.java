public  class Copyconstructor {
    int emp_id;
    String name;
    int salary;
    public Copyconstructor(int i, String n, int s) {
        emp_id = i;
        name = n;
        salary = s;

        System.out.println("Original Employee:");
        System.out.println("ID: " + emp_id + " Name: " + name + " Salary: " + salary);
    }
    public Copyconstructor(Copyconstructor ori) {
        this.emp_id = ori.emp_id;
        this.name = ori.name;
        this.salary = ori.salary;

        System.out.println("Copied Employee:");
        System.out.println("ID: " + emp_id + " Name: " + name + " Salary: " + salary);
    }

    public static void main(String[] args) {
        Copyconstructor emp1 = new Copyconstructor(101, "Krushna", 50000);
        Copyconstructor emp2 = new Copyconstructor(emp1);
    }
}

