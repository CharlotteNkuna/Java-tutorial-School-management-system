import java.util.Scanner;

public class Learners {
    String name;
    String surname;
    int grade;
    String course;

    public void setCourse() {
        System.out.println("Name: " + name + " " + surname + " is studying " + course + " and doing " + grade );

    }

    public static void main(String[] args) {

//  Scanner object
        Scanner input = new Scanner(System.in);

//  Learner object
        Learners learners = new Learners();

        System.out.println("Enter learner name");
        learners.name = input.nextLine();

        System.out.println("Enter learner surname");
        learners.surname = input.nextLine();

        System.out.println("Enter learner grade");
        learners.grade = input.nextInt();

        input.nextLine(); //clears line

        System.out.println("Enter learner course");
        learners.course = input.nextLine();

        learners.setCourse();

    }
}
