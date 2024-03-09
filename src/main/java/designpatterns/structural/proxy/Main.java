package designpatterns.structural.proxy;

public class Main {

    public static void main(String[] args) {
        ProxyEmployeeDataAccess proxyEmployeeDataAccess = new ProxyEmployeeDataAccess("Kiran Bisht", Role.ADMIN);
        proxyEmployeeDataAccess.grantAccess();
    }
}
