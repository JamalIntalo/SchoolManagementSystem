//IMPLEMENTATION BY JAMAL
//HIGHERSECONDARYSTUDENT CLASS

package school.management;

public class HigherSecondaryStudent extends Student{
    public HigherSecondaryStudent(int stuId,String stuName,int cId,int sec,int bId){
        super(stuId, stuName, cId, sec, bId);
        if(cId<11){System.out.println("SECONDARY STUDENT CANNOT BE BELOW GRADE 11!");}
    }
    
}
