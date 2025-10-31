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

        System.out.println("School name: "+mySchool.getSchoolName());
    }
 }