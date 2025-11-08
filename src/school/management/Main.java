// Implementation by Jamal Intalo
//This is the main method

package school.management;
 class Main{
    public static void main(String[] args){
        SchoolManagement mySchool= new SchoolManagement("Islamic Uni","40441 Abubakr as Siddiq rd.","0595318390","English/Arabic");
        mySchool.displaySchoolDetails();
        mySchool.setOpen(false);
        mySchool.isOpen();

        System.out.println( );

        Classroom class5=new Classroom(1,"West",32,40,40);
        class5.displayClassDetails();

        System.out.println( );

        Student s1=new Student(100,"Ali", 1, 200, 300);
        s1.displayStudentDetails();

        System.out.println( );

        Lab l1=new Lab(400,300,"CHEM LAB",501);
        l1.setOccupied(true);
        l1.isOccupied();
        System.out.println( );

        Employee E1=new Employee(1,"Faycal", 20000,23);
        E1.setCheckIn(true);
        E1.checkIn();

        System.out.println( );
        Noticeboard N1=new Noticeboard("MR. IBRAHIM");
        N1.addContent("SECTION 3302 WILL NOT BE AVAILABLE THIS SEMESTER!");
        N1.displayNoticeBoard();
    }
 }