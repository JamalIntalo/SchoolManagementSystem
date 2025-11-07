//IMPLEMENTATION BY JAMAL
//PRIMARYSTUDENT CLASS

package school.management;

public class PrimaryStudent extends Student{

    public PrimaryStudent (int stuId,String stuName,int cId,int sec,int bId){
        super(stuId, stuName, cId, sec, bId);

        if (cId>10){
            System.out.println("PRIMARY STUDENT CANNOT BE ABOVE GRADE 10!");
        }
}
}
