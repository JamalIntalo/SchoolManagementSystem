//Implemantation by Jamal Intalo
//This is the schoolManagement class
package school.management;
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
    Department deptObj=null;
    Lab lab=null;
    Classroom class1=null;
    //OBJECTS CREATION THAT ARE ALREADY AVAILABLE
    Noticeboard noticeBoard =new Noticeboard("SCHOOL COORESPONDENT: UMAR ABDI");
    //String[] members={"MR. HAMZA","MR. ABUBAKR","MR. BANDAR","MRS. ZAYNAB"};

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
      System.out.println("7.VIEW DEPARTMENT DETAILS");
      System.out.println("8.ADD CONTENT TO NOTICEBOARD");
      System.out.println("9.DISPLAY NOTICEBOARD");
      System.out.println("10.SET SCHOOL TO OPEN");
      System.out.println("11.SET SCHOOL TO CLOSE");
      System.out.println("12.CHECK IF SCHOOL IS OPEN/CLOSED");
      System.out.println("13.ADD LAB DETAILS");
      System.out.println("14.VIEW LAB DETAILS");
      System.out.println("15.CHECK IF LAB IS OCCUPIED");
      System.out.println("16.ADD CLASSROOM DETAILS");
      System.out.println("17.VIEW CLASSROOM DETAILS");
      System.out.println("18.EXIT PROGRAM");

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
          int stid=Scanner.nextInt();
          Scanner.nextLine();
          System.out.println("ENTER STUDENT NAME: ");
          String stname=Scanner.nextLine();
          System.out.println("ENTER CLASS ID: ");
          int classId=Scanner.nextInt();
          System.out.println("ENTER SECTION NUMBER: ");
          int section=Scanner.nextInt();
          System.out.println("ENTER BUS ID: ");
          int bus=Scanner.nextInt();

          if(type==1){
            student=new PrimaryStudent(stid, stname, classId, section, bus);
          }else if (type==2){
            student=new HigherSecondaryStudent(stid, stname, classId, section, bus);
          }else{
            System.out.println("INVALID CHOICE! GOING TO DEFAULT:PRIMARY");
            student=new PrimaryStudent(stid, stname, classId, section, bus);
          }

          student=new Student(stid,stname,classId,section,bus);
          System.out.println("+++STUDENT ADDED SUCCESSFULLY!+++");
          break;

          case 2:

          student.displayStudentDetails();
          break;

          case 3:
          student.payFees();
          break;

          case 4:
          System.out.println("CHOOSE 1 FOR TEACHER AND 2 FOR SUPPORTSTAFF");
          System.out.println("CHOOSE TYPE OF EMPLOYEE: ");
          int type0=Scanner.nextInt();
          System.out.println("ENTER EMPLOYEE ID: ");
          int empid=Scanner.nextInt();
          Scanner.nextLine();
          System.out.println("ENTER EMPLOYEE NAME: ");
          String empname=Scanner.nextLine();
          System.out.println("ENTER SALARY: ");
          int sal=Scanner.nextInt();
          System.out.println("ENTER DEPARTMENT ID: ");
          int dept=Scanner.nextInt();

          if(type0==1){
            employee= new Teacher(empid, empname, sal, dept);
          }else if(type0==2){
            //employee=new supportstaff;
          }else{
            System.out.println("REVERTING TO DEFAULT: TEACHER");
            employee=new Teacher(empid, empname, sal, dept);
          }
          employee=new Teacher(empid, empname, sal, dept);
          System.out.println("+++EMPLOYEE ADDED SUCCESSFULLY!+++");
          break;

          case 5:
          employee.displayEmployeeDetails();
          break;

          case 6:
          System.out.println("SET DEPARTMENT ID: ");
          int deptId=Scanner.nextInt();
          Scanner.nextLine();
          System.out.println("SET DEPARTMENT NAME: ");
          String deptName=Scanner.nextLine();
          System.out.println("SET WHO IS IN-CHARGE OF DEPARTMENT: ");
          String inChName=Scanner.nextLine();
          System.out.println("LIST OF MEMBERS IN DEPARTMENT(A DEPT CAN ONLY HAVE 4 MEMBERS): ");
          String [] members=new String[4];
          
          System.out.println("ENTER MEMBER 1 NAME: ");
          members[0] = Scanner.nextLine();

          System.out.println("ENTER MEMBER 2 NAME: ");
          members[1] = Scanner.nextLine();

          System.out.println("ENTER MEMBER 3 NAME: ");
          members[2] = Scanner.nextLine();

          System.out.println("ENTER MEMBER 4 NAME: ");
          members[3] = Scanner.nextLine();

          deptObj=new Department(deptId, deptName, inChName, members);
          System.out.println("+++DEPARTMENT ADDED SUCCESFULLY+++");
          break;

          case 7:
          deptObj.displayDepartmentDetails();
          break;

          case 8:
          System.out.println("TYPE WHAT YOU WANT TO ADD TO NOTICEBOARD: ");
          Scanner.nextLine();
          String message=Scanner.nextLine();
          noticeBoard.addContent(message);
          System.out.println("+++CONTENT ADDED SUCCESSFULLY+++");
          break;

          case 9:
          noticeBoard.displayNoticeBoard();
          break;

          case 10:
          this.setOpen(true);
          System.out.println("+++SCHOOL IS NOW OPEN+++");
          break;

          case 11:
          this.setOpen(false);
          System.out.println("+++SCHOOL IS NOW CLOSED+++");
          break;

          case 12:
          this.isOpen();
          break;

          case 13:
            System.out.println("ENTER LAB ID: ");
            int labId=Scanner.nextInt();
            System.out.println("ENTER IN-CHARGE ID: ");
            int inChargeId=Scanner.nextInt();
            Scanner.nextLine();
            System.out.println("ENTER LAB NAME: ");
            String labName=Scanner.nextLine();
            System.out.println("ENTER EQUIPMENT ID: ");
            int equiId=Scanner.nextInt();
            lab=new Lab(labId, inChargeId, labName, equiId);
            System.out.println("+++LAB DETAILS ADDED SUCCESSFULLY+++");
            break;

          case 14:
            lab.displayLabDetails();
            break;

          case 15:
            lab.isOccupied();
            break;

          case 16:
            System.out.println("ENTER CLASS ID: ");
            int class1Id=Scanner.nextInt();
            System.out.println("ENTER CLASS NAME: ");
            String className=Scanner.nextLine();
            Scanner.nextLine();
            System.out.println("ENTER TEACHER ID: ");
            int teacherId=Scanner.nextInt();
            System.out.println("ENTER STUDENT COUNT: ");
            int stuCount=Scanner.nextInt();
            System.out.println("ENTER EQUIPMENT ID: ");
            int equi1Id=Scanner.nextInt();
            class1=new Classroom(class1Id, className, teacherId, stuCount,equi1Id);
            System.out.println("+++CLASS DETAILS ADDED SUCCESSFULLY+++");
            break;

          case 17:
            class1.displayClassDetails();
            break;

          case 18:
            System.out.println("EXITING...");
            return;

          default:
          System.out.println("INVALID CHOICE TRY AGAIN");
        }
    }
}
}
