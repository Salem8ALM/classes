package University;

public class Course {
    private String course;
    private String instructor;
    private int numStudents;

    Course(String course, String instructor, int numStudents){
this.course = course;
this.instructor = instructor;
this.numStudents = numStudents;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course='" + course + '\'' +
                ", instructor='" + instructor + '\'' +
                ", number of enrolled students=" + numStudents +
                '}';
    }
}
