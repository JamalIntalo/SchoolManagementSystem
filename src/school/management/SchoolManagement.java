//Implemantation by Jamal Intalo
//This is the schoolManagement class
package school.management;
//import java.util.ArrayList;
import java.util.Scanner;
public class SchoolManagement{
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;
    private boolean open;
    private Student[] students; //AGGREGATION REFERENCING TO STUDENTS
    private Department department; //COMPOSISTION IMPLEMENTATION 

  //GETTER METHODS FOR VARIABLES

public String getSchoolName(){return schoolName;}
public String getAddress(){return address;}
public String getMediumOfStudy(){return mediumOfStudy;}
public String getContactNumber(){return contactNumber;}
public boolean getOpen(){return open;}
public Student[] getStudents(){return students;}
public Department getDepartment(){return department;}

//SETTER METHODS
public void setSchoolName(String name){this.schoolName=name;}
public void setAddress(String address){this.address=address;}
public void setContactNumber(String contact){this.contactNumber=contact;}
public void setMediumOfStudy(String medium){this.mediumOfStudy=medium;}
public void setOpen(boolean open){this.open=open;}
public void setStudents(Student[] students){this.students=students;}
public void setDepartment(Department department){this.department=department;}

//METHODS FOR SCHOOLMANAGEMENT CLASS
  //Isopen Method
void isOpen(){
    if(open){
        System.out.println("SCHOOL IS OPEN");
    }else System.out.println("SCHOOL IS CLOSED");
}
 //SchoolDetails method
 void displaySchoolDetails(){
  System.out.println("School Name: " +getSchoolName());
  System.out.println("Address: " +getAddress());
  System.out.println("Contact Number: " +getContactNumber());
  System.out.println("Medium Of Study: "+getMediumOfStudy());
}

//SCHOOLMANAGEMENT CONSTRUCTOR
public SchoolManagement(String sN,String addr,String contact,String medium){
    schoolName=sN;
    address=addr;
    contactNumber=contact;
    mediumOfStudy=medium;
    open=true;
}

//runschool Method
public void runSchool(){
    Scanner Scanner=new Scanner(System.in);
    //OBJECTS CREATION TO BE GOTTEN FROM USER
    Student student=null;
    Employee  employee=null;
    //OBJECTS CREATION THAT ARE ALREADY AVAILABLE
    //Noticeboard noticeBoard =new Noticeboard("SCHOOL COORESPONDENT: UMAR ABDI");
    //String[] members={"MR. HAMZA","MR. ABUBAKR","MR. BANDAR","MRS. ZAYNAB"};
    //Department mDepartment=new Department(500,"MATHS DEPARTMENT","MR. IBRAHIM",members);
    //Lab lab=new Lab(600, 200,"CHEMISTRY LAB",700);

    //MAIN MENU LOOP
    while (true){
      System.out.println("=====SCHOOL MANAGEMENT SYSTEM=====");
      System.out.println("0.VIEW SCHOOL DETAILS");
      System.out.println("1.ADD STUDENT");
      System.out.println("2.VIEW STUDENT DETAILS");
      System.out.println("3.PAY FEES");
      System.out.println("4.ADD EMPLOYEE");
      System.out.println("5.VIEW EMPLOYEE DETAILS");
      System.out.println("6.ADD DEPARTMENT DETAILS");
      System.out.println("7.ADD CONTENT TO NOTICEBOARD");
      System.out.println("8.DISPLAY NOTICEBOARD");
      System.out.println("9.CHECK IF SCHOOL IS OPEN");
      System.out.println("10.VIEW LAB DETAILS");
      System.out.println("11.CHECK IF LAB IS OCCUPIED");
      System.out.println("12.VIEW CLASSROOM DETAILS");
      System.out.println("13.EXIT PROGRAM");

      System.out.println("PLEASE ENTER YOUR CHOICE: ");
      int choice=Scanner.nextInt();

        switch (choice){
          case 0:

          displaySchoolDetails();
          break;

          case 1:

          System.out.println("CHOOSE 1 FOR PRIMARY STUDENT AND 2 FOR HIGHER SECONDARY");
          System.out.println("ENTER TYPE: ");
          int type=Scanner.nextInt();
          System.out.println("ENTER STUDENT ID: ");
          int id=Scanner.nextInt();
          Scanner.nextLine();
          System.out.println("ENTER STUDENT NAME: ");
          String name=Scanner.nextLine();
          System.out.println("ENTER CLASS ID: ");
          int classId=Scanner.nextInt();
          System.out.println("ENTER SECTION NUMBER: ");
          int section=Scanner.nextInt();
          System.out.println("ENTER BUS ID: ");
          int bus=Scanner.nextInt();

          if(type==1){
            student=new PrimaryStudent(id, name, id, section, classId);
          }else if (type==2){
            student=new HigherSecondaryStudent(id, name, id, section, classId);
          }else{
            System.out.println("INVALID CHOICE! GOING TO DEFAULT:PRIMARY");
            student=new PrimaryStudent(id, name, id, section, classId);
          }

          student=new Student(id,name,classId,section,bus);
          System.out.println("STUDENT ADDED SUCCESSFULLY!");
          break;

          case 2:

          student.displayStudentDetails();

          case 3:

          student.payFees();

          case 4:

          System.out.println("CHOOSE 1 FOR TEACHER AND 2 FOR SUPPORTSTAFF");
          System.out.println("CHOOSE TYPE OF EMPLOYEE: ");
          int type0=Scanner.nextInt();
          System.out.println("ENTER EMPLOYEE ID: ");
          int id0=Scanner.nextInt();
          Scanner.nextLine();
          System.out.println("ENTER EMPLOYEE NAME: ");
          String name0=Scanner.nextLine();
          System.out.println("ENTER SALARY: ");
          int sal=Scanner.nextInt();
          System.out.println("ENTER DEPARTMENT ID: ");
          int dept=Scanner.nextInt();

          if(type0==1){
            employee= new Teacher(id0, name0, sal, dept);
          }else if(type0==2){
            //employee=new supportstaff;
          }else{
            System.out.println("REVERTING TO DEFAULT: TEACHER");
            employee=new Teacher(id0, name0, sal, dept);
          }
          employee=new Teacher(id0, name0, sal, dept);
          System.out.println("EMPLOYEE ADDED SUCCESSFULLY!");
          break;

          case 5:
          employee.displayEmployeeDetails();

          case 13:
          System.out.println("EXITING...");
          return;

          default:
          System.out.println("INVALID CHOICE TRY AGAIN");
        }
    }
}
}
