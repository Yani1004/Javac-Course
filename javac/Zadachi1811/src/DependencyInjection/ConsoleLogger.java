package DependencyInjection;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.printf("%s",message);
    }
}
