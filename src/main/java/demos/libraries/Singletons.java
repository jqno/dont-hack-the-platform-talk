package demos.libraries;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

import static demos.reflection.Reflector.setPrivateFieldValue;

public class Singletons {

    enum Singleton {
        INSTANCE
    }

    public static void main(String... args) throws Exception {
        Singleton s = copyEnumConstant(Singleton.class, Singleton.INSTANCE);

        System.out.println("Original: " + Singleton.INSTANCE);
        System.out.println("Copy:     " + s);
        System.out.println("Same?     " + Singleton.INSTANCE.equals(s));
    }





















    /* HOW DOES IT WORK? */


    private static final Objenesis OBJENESIS = new ObjenesisStd();

    private static <E extends Enum<?>> E copyEnumConstant(Class<E> type, E constant) throws Exception {
        E newInstance = OBJENESIS.newInstance(type);
        setPrivateFieldValue(Enum.class, "ordinal", newInstance, constant.ordinal());
        setPrivateFieldValue(Enum.class, "name", newInstance, constant.name());
        return newInstance;
    }
}
