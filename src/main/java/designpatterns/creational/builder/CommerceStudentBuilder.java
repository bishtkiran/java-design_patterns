package designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class CommerceStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Economics");
        subs.add("Accounts");
        subs.add("Mathematics");
        this.subjects = subs;
        return this;
    }
}
