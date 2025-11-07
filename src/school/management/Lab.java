package school.management;

public class Lab {
    private int labId;
    private int inChargeId;
    private String labName;
    private int equipmentId;
    private boolean occupied;
//GETTERS FOR VARIABLES
public int getLabId(){return labId;}
public int getInChargeId(){return inChargeId;}
public String getLabName(){return labName;}
public int getequipmentId(){return equipmentId;}
public boolean getOccupied(){return occupied;}
//SETTERS FOR VARIABLES 
public void setLabId(int labId){this.labId=labId;}
public void setInChargeId(int inChargeId){this.inChargeId=inChargeId;}
public void setLabName(String labName){this.labName=labName;}
public void setequipmentId(int equipmentId){this.equipmentId=equipmentId;}
public void setOccupied(boolean occupied){this.occupied=occupied;}
// CONSTRUCTOR
Lab(int lId,int inId,String lName,int equiId){
    this.labId=lId;
    this.inChargeId=inId;
    this.labName=lName;
    this.equipmentId=equiId;
    this.occupied=false;
}
//LABDETAILS METHOD
void displayLabDetails(){
    System.out.println("LAB ID: "+getLabId());
    System.out.println("PERSON IN CHARGE OF LAB ID: "+getInChargeId());
    System.out.println("LAB NAME: "+getLabName());
    System.out.println("LAB EQUIPMENT ID: "+getequipmentId());
}
//IS OCCUPIED METHOD
void isOccupied(){
    if(occupied){
        System.out.println("LAB IS OCCUPIED");
    }else System.out.println("LAB IS AVAILABLE");
}
}
