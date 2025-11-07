//Implemantation by Jamal Intalo
//This is the schoolManagement class
package school.management;

public class SchoolManagement{
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;
    private boolean open;

  //GETTER METHODS FOR VARIABLES

public String getSchoolName(){return schoolName;}
public String getAddress(){return address;}
public String getMediumOfStudy(){return mediumOfStudy;}
public String getContactNumber(){return contactNumber;}
public boolean getOpen(){return open;}

//SETTER METHODS
public void setSchoolName(String name){this.schoolName=name;}
public void setAddress(String address){this.address=address;}
public void setContactNumber(String contact){this.contactNumber=contact;}
public void setMediumOfStudy(String medium){this.mediumOfStudy=medium;}
public void setOpen(boolean open){this.open=open;}

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
}
//runschool Method
