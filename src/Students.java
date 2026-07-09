public class Students {
    // Declare instance variables inside the class, outside the method
    String name;
    String course;
    int age;

    public static void main(String[] args) {
        Students students1 = new Students(); //object
        Students students2 = new Students();
        Students students3 = new Students();

        //adding data to every object
        students1.name = "Charlotte";
        students1.age = 22;
        students1.course = "Software Engineering";

        students2.name = "Emma";
        students2.age = 30;
        students2.course = "Civil Engineering";

        students3.name = "Mahlori";
        students3.age = 19;
        students3.course = "Matric";

        System.out.println(students1.name + " " + students1.age);
        System.out.println(students2.name);
        System.out.println(students3.name + " " + students3.course );


    }
}
