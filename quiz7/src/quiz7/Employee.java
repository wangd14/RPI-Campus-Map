package quiz7;

class Employee
{
   public Employee(String n, String i, double s) {
      name = n;
      salary = s;
      id = i;
   }
   public String getName() {
      return name;
   }
   public double getSalary() {
      return salary;
   }
   public String getId() {
      return id;
   }
   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
   private String name;
   private double salary;
   // id uniquely identifies any employee, be that Employee, Manager, or any other employee
   private String id;
   
   public static void main(String[] args) {
	   Employee e = new Employee("hi", "a", 1.3);
   }
}

class Manager extends Employee
{
   public Manager(String n, String i, double s) {
      super(n, i, s);
      bonus = 0;
   }
   public double getSalary() {
      double baseSalary = super.getSalary();
      return baseSalary + bonus;
   }
   public void setBonus(double b) {
      bonus = b;
   }
   private double bonus;
   
   public static void main(String[] args) {
	   Manager m = new Manager("fjdks", "b", 1.4);
	   Employee e = new Employee("hi", "a", 1.3);
	   
   }
}