package demos.libraries.remote;

public class Victim {
    public static void main(String... args) throws Exception {

        System.out.println("Current PID: " + ProcessHandle.current().pid());

        while (true) {
            System.out.println(System.currentTimeMillis());
            Thread.sleep(1000);
        }
    }
}
