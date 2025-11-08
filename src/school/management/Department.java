//IMPLEMENTATION BY JAMAL
//DEPARTMENT CLASS

package school.management;
public class Department {
    private int departmentId;
    private String departmentName;
    private String inChargeName;
    private String[] membersList;

//GETTERS FOR VARIABLE
public int getDepartmentId(){return departmentId;}
public String getDepartmentName(){return departmentName;}
public String getInChargeName(){return inChargeName;}
public String[] getMembersList(){return membersList;}

//SETTERS FOR VARIABLE
public void setDepartmentId(int departmentId){this.departmentId=departmentId;}
public void setDepartmentName(String departmentName){this.departmentName=departmentName;}
public void setInChargeName(String inChargeName){this.inChargeName=inChargeName;}
public void setMembersList(String[] membersList){this.membersList=membersList;}

//CONSTRUCTORS FOR DEPARTMENT CLASS
public Department(int deptId,String deptName,String inCharge,String[] list){
    this.departmentId=deptId;
    this.departmentName=deptName;
    this.inChargeName=inCharge;
    this.membersList=list;
}
//DEPARTMENT DETAILS METHOD
void displayDepartmentDetails(){
    System.out.println("Department ID_NO: "+ getDepartmentId());
    System.out.println("Department name: "+ getDepartmentName());
    System.out.println("Department in charge person: "+ getInChargeName());
    System.out.println("Department Members: "+ getMembersList());
}
    
}

