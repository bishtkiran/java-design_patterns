package designpatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        StudentFactory firstStudent = new StudentFactory(new ScienceStudentBuilder());
        StudentFactory secondStudent = new StudentFactory(new CommerceStudentBuilder());

        Student engineerStudent = firstStudent.createStudent();
        Student mbaStudent = secondStudent.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }
}
