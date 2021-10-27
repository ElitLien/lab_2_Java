package Task3;

public class Student {
    private String firstName;
    private String lastName;
    private int studentId;
    private String group;

    public Student(String firstName, String lastName, int studentId, String group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.group = group;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setGroup(String group){
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString(){
        return "First name: " + firstName +
                "; last name: " + lastName +
                "; student id: " + studentId +
                "; group: " + group;
    }
}
