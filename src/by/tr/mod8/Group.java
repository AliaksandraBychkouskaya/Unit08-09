package by.tr.mod8;

public class Group {
    private Student Student1;
    private Student Student2;
    private Student Student3;
    public Group (Student _Student1,Student _Student2,Student _Student3){
        this.Student1 = _Student1;
        this.Student2 = _Student2;
        this.Student3 = _Student3;
    }
    public void setStudent1(Student student1) {
        Student1 = student1;
    }

    public void setStudent2(Student student2) {
        Student2 = student2;
    }

    public void setStudent3(Student student3) {
        Student3 = student3;
    }

    public Student getStudent1() {
        return Student1;
    }

    public Student getStudent2() {
        return Student2;
    }

    public Student getStudent3() {
        return Student3;
    }
}
