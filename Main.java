class Main {
  public static void main(String[] args) {
    //Employee Garfield = new Employee("Garfield Cat", 111111111);
    HourlyEmployee Jon = new HourlyEmployee("Jon Arbuckle", 222222222, 3, 4);
    SalariedEmployee Odie = new SalariedEmployee("Odie Dog", 333333333, 5);

    Jon.setRate(1.2);
    Jon.setHours(0.5);
    System.out.println(Jon.getWage()); 

    Odie.setSalary(2.3);
    System.out.println(Odie.getSalary()); 

    //Garfield.PrintData();
    Jon.PrintData();
    Odie.PrintData();

    Employee[] emp = new Employee[5];
    emp[2] = new HourlyEmployee ("Bob", 444444444, 6.00, 7);
    emp[3] = new SalariedEmployee ("Fred", 555555555, 5.00);
    emp[2].PrintData();
    emp[3].PrintData();
    emp[2] = new SalariedEmployee ("Harry", 666666666, 15.00);
    emp[2].PrintData();
    
  }
}
