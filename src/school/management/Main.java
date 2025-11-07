// Implementation by Jamal Intalo
//This is the main method

package school.management;
 class Main{
    public static void main(String[] args){
        SchoolManagement mySchool= new SchoolManagement("Islamic Uni","40441 Abubakr as Siddiq rd.","0595318390","English/Arabic");
        mySchool.displaySchoolDetails();

        System.out.println( );

        Classroom class5=new Classroom(1,"West",32,40,40);
        class5.displayClassDetails();

        System.out.println( );

        Student s1=new Student(100,"Ali", 1, 200, 300);
        s1.displayStudentDetails();


    }
 }