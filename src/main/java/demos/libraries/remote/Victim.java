package demos.libraries.remote;

public class Victim {

    // To run on Java 11 EA: set `-Dnet.bytebuddy.experimental=true`

    public static void main(String... args) throws Exception {

        System.out.println("Current PID: " + ProcessHandle.current().pid());

        while (true) {
            System.out.println(System.currentTimeMillis());
            Thread.sleep(1000);
        }
    }
}
