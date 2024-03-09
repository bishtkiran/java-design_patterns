package designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ScienceStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Physics");
        subs.add("Chemistry");
        subs.add("Biology");
        this.subjects = subs;
        return this;
    }
}
