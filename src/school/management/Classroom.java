// Implemantation by Jamal Intalo
// This is the classroom class

package school.management;

public class Classroom {
    private int classId;
    private String className;
    private String teacherName;
    private int studentCount;
    private int equipmentCount;
    
//GETTERS FOR VARIABLES
    public int getClassId(){
        return classId;
    }
    public String getClassName(){
        return className;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public int getEquipmentCount(){
        return equipmentCount;
    }
//SETTERS FOR VARIABLES
    public void setClassId(int classId){
        this.classId=classId;
    }
    public void setClassName(String className){
        this.className=className;
    }
    public void setTeacherName(String teacherName){
        this.teacherName=teacherName;
    }
    public void setStudentCount(int studentCount){
        this.studentCount=studentCount;
    }
    public void setEquipmentCount(int equipmentCount){
        this.equipmentCount=equipmentCount;
    }
//METHOD FOR CLASSROOM CLASS
  //ClassDetails Method
    void display(){
        System.out.println("Class ID: "+getClassId());
        System.out.println("Class Name: "+ getClassName());
        System.out.println("Teacher Name: "+ getTeacherName());
        System.out.println("Student Count: "+ getStudentCount());
        System.out.println("Equipment Count: "+ getEquipmentCount());
    }
}
