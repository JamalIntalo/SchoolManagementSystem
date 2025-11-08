//Implementation by JAMAL
//STUDENT CLASS

package school.management;
import java.util.Scanner;
public class Student {
    private final int PRIMARY_FEE=3000;
    private final int SECONDARY_FEE=6000;
    private int studentId;
    private String studentName;
    private int classId;
    private int section;
    private int busId;
    private double totalFees;
    private double feesPaid;
    private Classroom classroom; //ASSOCIATION REFERENCING TO CLASSROOM
    private Noticeboard noticeboard; //ASSOCIATION REFERENCING TO NOTICEBOARD

//GETTERS FOR VARIABLES
public int getStudentId(){return studentId;}
public String getStudentName(){return studentName;}
public int getClassId(){return classId;}
public int getSection(){return section;}
public int getBusId(){return busId;}
public double getTotalFees(){return totalFees;}
public double getFeesPaid(){return feesPaid;}
public Classroom getClassroom(){return classroom;}
public Noticeboard getNoticeboard(){return noticeboard;}

//SETTERS FOR VARIABLES
public void setStudentId(int studentId){this.studentId=studentId;}
public void setStudentName(String studentName){this.studentName=studentName;}
public void setClassId(int classId){this.classId=classId;}
public void setSection(int section){this.section=section;}
public void setBusId(int busId){this.busId=busId;}
public void setTotalFees(double totalFees){this.totalFees=totalFees;}
public void setFeesPaid(double feesPaid){this.feesPaid=feesPaid;}
public void setClassroom(Classroom classroom){this.classroom=classroom;}
public void setNoticeboard(Noticeboard noticeboard){this.noticeboard=noticeboard;}

// METHOD FOR STUDENT DETAILS
void displayStudentDetails(){
    System.out.println("Student ID: "+getStudentId());
    System.out.println("Student Name: "+ getStudentName());
    System.out.println("Class ID: "+ getClassId());
    System.out.println("Section: "+ getSection());
    System.out.println("Bus Id: "+ getBusId());
}
void payFees(){
    Scanner Scanner=new Scanner(System.in);
    System.out.println("Enter Amount to pay: ");
    int amountToPay=Scanner.nextInt();

    double remaining=totalFees-feesPaid;

    if (amountToPay>remaining){
        System.out.println("YOU CANNOT PAY MORE THAN THE REMAINING FEES!");}

    else if(amountToPay<=0){
            System.out.println("YOU CANNOT PAY NULL OR NEGATIVE AMOUNT!");}

    else{
        feesPaid=feesPaid+amountToPay;
        System.out.println("PAYEMENT SUCCESSFUL!");}

        double newRemaining=totalFees-feesPaid;
    if(newRemaining!=0){
        System.out.println("Updated remaining balance= "+ newRemaining);
        }
    else System.out.println("ALL FEES HAVE BEEN PAID");
}
//METHOD FOR PAYFEES
void displayFeesDetails(){
    System.out.println("TOTAL FEES TO BE PAID: " + totalFees);
    System.out.println("FEES ALREADY PAID: " + feesPaid);
    System.out.println("REMAINING FEES: " +(totalFees-feesPaid));
}
//CONSTRUCTOR FOR STUDENT CLASS
public Student(int stuId,String stuName,int cId,int sec,int bId){
    this.studentId=stuId;
    this.studentName=stuName;
    this.classId=cId;
    this.section=sec;
    this.busId=bId;
    if (classId <=10){
        totalFees=PRIMARY_FEE;
    } else totalFees=SECONDARY_FEE;
    feesPaid=0;
}
}