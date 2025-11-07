//Implemantation by Jamal Intalo
//This is the schoolManagement class
package school.management;

public class SchoolManagement{
    private String schoolName;
    private String address;
    private String contactNumber;
    private String mediumOfStudy;
 

  //GETTER METHODS FOR VARIABLES

public String getSchoolName(){
    return schoolName;
}

public String getAddress(){
    return address;
}

public String getMediumOfStudy(){
    return mediumOfStudy;
}

public String getContactNumber(){
    return contactNumber;
}

//SETTER METHODS
public void setSchoolName(String name){
    this.schoolName=name;
}

public void setAddress(String address){
    this.address=address;
}

public void setContactNumber(String contact){
    this.contactNumber=contact;
}

public void setMediumOfStudy(String medium){
    this.mediumOfStudy=medium;
 }


//METHODS FOR SCHOOLMANAGEMENT CLASS
  //Isopen Method
public boolean isOpen(){
    return true;
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
}
}
//runschool Method
