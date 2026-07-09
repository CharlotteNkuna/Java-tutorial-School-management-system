public class MethodReturn {

    int getMarks(){
        return 85;
    }
    public static void main(String[] args) {

        MethodReturn student = new MethodReturn();

        int marks = student.getMarks();

        System.out.println("Student has " + marks + " marks");

    }
}
