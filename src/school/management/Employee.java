package school.management;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int salary;
    private int departmentId;
    private boolean checkIn;
//GETTERS
public int getEmployeeId(){return employeeId;}
public String getEmployeeName(){return employeeName;}
public int getSalary(){return salary;}
public int getDepartmentId(){return departmentId;}
public boolean getCheckIn(){return checkIn;}
//SETTERS
public void setEmployeeId(int empId){this.employeeId=empId;}
public void setEmployeeName(String empName){this.employeeName=empName;}
public void setSalary(int salary){this.salary=salary;}
public void setDepartmentId(int deptId){this.departmentId=deptId;}
public void setCheckIn(boolean check){this.checkIn=check;}
//CONSTRUCTOR
Employee(int empId,String empName,int sal,int deptId){
    this.employeeId=empId;
    this.employeeName=empName;
    this.salary=sal;
    this.departmentId=deptId;
    this.checkIn=false;
}
//METHODS
  //EMPLOYEEDETAILS METHOD
  void displayEmployeeDetails(){
    System.out.println("EMPLOYEE ID: "+getEmployeeId());
    System.out.println("EMPLOYEE NAME: "+getEmployeeName());
    System.out.println("EMPLOYEE SALARY: "+getSalary());
    System.out.println("EMPLOYEE'S DEPARTMENT ID: "+getDepartmentId());
  }
  //CHECKIN() METHOD
  void checkIn(){
    if (checkIn==true){
        System.out.println("EMPLOYEE IS CHECKED IN");
    }else System.out.println("EMPLOYEE IS NOT IN SCHOOL!");
  }
}
