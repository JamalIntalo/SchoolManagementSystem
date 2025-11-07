// Implemantation by Jamal Intalo
// This is the classroom class

package school.management;

public class Classroom {
    private int classId;
    private String className;
    private int teacherId;
    private int studentCount;
    private int equipmentId;
    
//GETTERS FOR VARIABLES
    public int getClassId(){
        return classId;
    }
    public String getClassName(){
        return className;
    }
    public int getTeacherId(){
        return teacherId;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public int getequipmentId(){
        return equipmentId;
    }
//SETTERS FOR VARIABLES
    public void setClassId(int classId){
        this.classId=classId;
    }
    public void setClassName(String className){
        this.className=className;
    }
    public void setTeacherId(int teacherId){
        this.teacherId=teacherId;
    }
    public void setStudentCount(int studentCount){
        this.studentCount=studentCount;
    }
    public void setequipmentId(int equipmentId){
        this.equipmentId=equipmentId;
    }
//METHOD FOR CLASSROOM CLASS
  //ClassDetails Method
    void displayClassDetails(){
        System.out.println("Class ID: "+getClassId());
        System.out.println("Class Name: "+ getClassName());
        System.out.println("Teacher ID: "+ getTeacherId());
        System.out.println("Student Count: "+ getStudentCount());
        System.out.println("Classroom Equipment Count: "+ getequipmentId());
    }
//CONSTRUCTOR FOR CLASSROOM
public Classroom(int cId,String cName,int tId,int stuCount,int equiId){
    classId=cId;
    className=cName;
    teacherId=tId;
    studentCount=stuCount;
    equipmentId=equiId;
}
}
