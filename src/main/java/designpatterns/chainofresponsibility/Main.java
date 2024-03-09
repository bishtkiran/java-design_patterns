package designpatterns.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(logProcessor.INFO, "This is an Info Log");
        logProcessor.log(logProcessor.DEBUG, "This is a Debug Log");
        logProcessor.log(logProcessor.ERROR, "This is an Error Log");

    }
}
