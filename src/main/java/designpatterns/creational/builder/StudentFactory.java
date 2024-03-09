package designpatterns.creational.builder;

public class StudentFactory {

    StudentBuilder studentBuilder;

    StudentFactory(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof ScienceStudentBuilder) {
            return createScienceStudent();
        } else if (studentBuilder instanceof CommerceStudentBuilder) {
            return createCommerceStudent();
        }
        return null;
    }

    private Student createScienceStudent() {
        return studentBuilder.setRollNumber(1).setAge(27).setName("Kiran").setSubjects().build();
    }

    private Student createCommerceStudent() {
        return studentBuilder.setRollNumber(2).setAge(24).setName("Kim").setFatherName("Sam").setMotherName("Ken").setSubjects().build();
    }

}
