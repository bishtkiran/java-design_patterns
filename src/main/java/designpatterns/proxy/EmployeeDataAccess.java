package designpatterns.proxy;

public class EmployeeDataAccess implements DataAccess{

    private String name;
    private Role role;

    public EmployeeDataAccess(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void grantAccess() {
        System.out.println("Read Access granted to " + name + " with role " + role);
    }
}
