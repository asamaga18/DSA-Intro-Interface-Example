interface Employee {
  public void PrintData(); 
}

class HourlyEmployee implements Employee {
  private String sName;
  private int iSSN;
  private double dRate;
  private double dHrs;

  public HourlyEmployee(String sWho, int iNum, double dPay, double dTime) {
    sName = sWho;
    iSSN = iNum;
    dRate = dPay;
    dHrs = dTime;
  }
   
  public void PrintData() { 
    System.out.println("Name: " + sName);
    System.out.println("SSN: " + iSSN);
    System.out.println(dHrs + " hours at $" + dRate);
  }

  public void setRate(double r) {
    dRate = r;
  }

  public void setHours(double h) {
    dHrs = h;
  }

  public double getWage() {
    return dRate * dHrs;
  }
}

class SalariedEmployee implements Employee {
  private double dSalary;
  private String sName;
  private int iSSN;

  public SalariedEmployee(String sWho, int iNum, double dPay) {
    sName = sWho;
    iSSN = iNum;
    dSalary = dPay;
  }

  public void PrintData() { 
    System.out.println("Name: " + sName);
    System.out.println("SSN: " + iSSN); System.out.println("Salary: $" + dSalary);
  }

  public void setSalary(double s) {
    dSalary = s;
  }

  public double getSalary() {
    return dSalary;
  }
}
