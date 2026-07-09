public class Parameters {
    //method
    void writeExam(String subject){ //parameter: subject
        System.out.println("Student is writing " +subject);
    }
    public static void main(String[] args) {
// object
        Parameters student = new Parameters();

        //calling method
        student.writeExam("Mathematics");

    }
}
