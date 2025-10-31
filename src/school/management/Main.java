// Implementation by Jamal Intalo
//This is the main method

package school.management;
 class Main{
    public static void main(String[] args){
        SchoolManagement mySchool= new SchoolManagement();
        mySchool.setSchoolName("Islamic Uni");
        mySchool.setAddress("40441 Abubakr as Siddiq road");
        mySchool.setContactNumber("0595318390");
        mySchool.setMediumOfStudy("English/ Arabic");
        mySchool.display();

        System.out.println( );

        Classroom class5=new Classroom();
        class5.setClassId(1);
        class5.setClassName("West");
        class5.setTeacherName("Ali");
        class5.setStudentCount(40);
        class5.setEquipmentCount(40);
        class5.display();


    }
 }