package nl.jqno.talks.donthacktheplatform.demo8;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ConfusingCardGame {

    private static final Objenesis OBJENESIS = new ObjenesisStd();

    enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }

    public static void main(String... args) throws Exception {
        Arrays.stream(Suit.values()).forEach(System.out::println);

        System.out.println("\nShuffle\n");

        addEnumConstant(Suit.class, "TRUMPS");
        Arrays.stream(Suit.values()).forEach(System.out::println);
    }

    private static <E extends Enum<?>> void addEnumConstant(Class<E> type, String constantName) throws Exception {
        Method method = type.getDeclaredMethod("values");
        Enum[] values = (Enum[])method.invoke(type);
        int ordinal = values.length;

        E newInstance = OBJENESIS.newInstance(type);
        setPrivateField(Enum.class, "ordinal", newInstance, ordinal);
        setPrivateField(Enum.class, "name", newInstance, constantName);

        Enum[] newValues = (Enum[]) Array.newInstance(type, ordinal + 1);
        System.arraycopy(values, 0, newValues, 0, ordinal);
        newValues[ordinal] = newInstance;

        Field valuesField = getDeclaredField(type, "$VALUES");
        Field modifiersField = getDeclaredField(Field.class, "modifiers");
        modifiersField.setInt(valuesField, valuesField.getModifiers() & ~Modifier.FINAL);

        valuesField.set(null, newValues);
    }

    private static <T> void setPrivateField(Class<T> type, String fieldName, T receiver, Object newValue) throws Exception {
        Field field = getDeclaredField(type, fieldName);
        field.set(receiver, newValue);
    }

    private static <T> Field getDeclaredField(Class<T> type, String fieldName) throws Exception {
        Field field = type.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    }
}
