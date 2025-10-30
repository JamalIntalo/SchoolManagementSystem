package school.management;

public class Main {
    public static void main(String[] args) {
        SchoolManagement sm = new SchoolManagement(
            "Islamic University School", 
            "Madinah, Saudi Arabia", 
            "0123456789", 
            "English"
        );

        sm.schoolDetails();
        sm.isOpen();
    }
}
