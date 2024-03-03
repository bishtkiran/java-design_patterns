package designpatterns.proxy;

public class ProxyEmployeeDataAccess implements DataAccess {

    private String name;
    private Role role;
    private EmployeeDataAccess employeeDataAccess;

    public ProxyEmployeeDataAccess(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public void grantAccess() {
        if (Role.ADMIN.equals(getRole(name, role))) {
            employeeDataAccess = new EmployeeDataAccess(name, Role.ADMIN);
            employeeDataAccess.grantAccess();
        } else {
            System.out.println("Delete access can't be granted. Your role is not ADMIN");
        }
    }

    public Role getRole(String empName, Role role) {
        return Role.EMPLOYEE.equals(role) ? Role.EMPLOYEE : Role.ADMIN;
    }
}
