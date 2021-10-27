package Task3;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ivan", "Malynuk", 15467678, "IT-22");
        Subject subject = new Subject("Math");
        Mark mark = new Mark(80);
        System.out.println(student);
        System.out.println("Mark: " + mark.getMark() + "; Subject : " + subject.getSubject());
    }
}
