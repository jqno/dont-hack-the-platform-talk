package demos.libraries;

import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.implementation.MethodDelegation;

import java.io.File;
import java.lang.instrument.Instrumentation;
import java.util.Random;

import static net.bytebuddy.implementation.FixedValue.value;
import static net.bytebuddy.matcher.ElementMatchers.named;
import static net.bytebuddy.matcher.ElementMatchers.none;

public class RemoteTimeTraveling {

    public static void main(String... args) {
        File agentJar = new File(args[0]);
        String pid = args[1];
        ByteBuddyAgent.attach(agentJar, pid);
    }

    public static void agentmain(String arguments, Instrumentation instrumentation) {

        System.out.println("Let's install some malicious code...  ᕕ( ᐛ )ᕗ ");

        AgentBuilder.Transformer λ =
                (builder, typeDescription, classLoader, javaModule) -> builder
                                .method(named("currentTimeMillis"))
                                .intercept(value(1337));

        new AgentBuilder.Default()
                .ignore(none())
                .disableClassFormatChanges()
                .with(AgentBuilder.RedefinitionStrategy.RETRANSFORMATION)
                .type(named("java.lang.System"))
                .transform(λ)
                .installOn(instrumentation);
    }
}
