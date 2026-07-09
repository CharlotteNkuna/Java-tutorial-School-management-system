public class StudentMethod {
     // Declare instance variables inside the class, outside the method
        String name;
        String course;

        // step2:  1. ADD THE METHOD HERE (Inside the class, outside of main)
        public void displayInfo() {
            // This method automatically knows which object called it,
            System.out.println("Name: " + name + " is studying " + course);
        }

        public static void main(String[] args) {
            StudentMethod students1 = new StudentMethod(); //object
            StudentMethod students2 = new StudentMethod();

            //adding data to every object
            students1.name = "Charlotte";
            students1.course = "Software Engineering";

            students2.name = "Emma";
            students2.course = "Civil Engineering";

            //Step 2:  2. CALL THE METHOD HERE using your objects
            students1.displayInfo();
            students2.displayInfo();

        }
    }
