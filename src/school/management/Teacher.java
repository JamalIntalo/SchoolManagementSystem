//IMPLEMENTATION BY JAMAL
//TEACHER CLASS

package school.management;

public class Teacher extends Employee{
    public Teacher(int empId,String empName,int sal,int deptId){
     super(empId,empName,sal,deptId);
}
    private Student students; //AGGREGATION REFERENCING FOR STUDENTS
//GETTER
public Student getStudents(){return students;}
//SETTER
public void setStudents(Student students){this.students=students;}
}