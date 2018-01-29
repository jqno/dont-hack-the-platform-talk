package demos.libraries;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static demos.reflection.Reflector.getDeclaredField;
import static demos.reflection.Reflector.setPrivateFieldValue;

public class ConfusingCardGame {

    enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }

    public static void main(String... args) throws Exception {
        for (Suit s : Suit.values()) {
            System.out.println(s);
        }

        System.out.println("\nShuffle\n");
        addEnumConstant(Suit.class, "TRUMPS");

        for (Suit s : Suit.values()) {
            System.out.println(s);
        }
    }










    /* HOW DOES IT WORK? */


    private static final Objenesis OBJENESIS = new ObjenesisStd();

    private static <E extends Enum<?>> void addEnumConstant(Class<E> type, String constantName) throws Exception {

        /* Get enum.values() */
        Method method = type.getDeclaredMethod("values");
        Enum[] values = (Enum[])method.invoke(type);
        int ordinal = values.length;

        /* Create new enum instance */
        E newInstance = OBJENESIS.newInstance(type);
        setPrivateFieldValue(Enum.class, "ordinal", newInstance, ordinal);
        setPrivateFieldValue(Enum.class, "name", newInstance, constantName);

        /* Create values array with new constant */
        Enum[] newValues = (Enum[]) Array.newInstance(type, ordinal + 1);
        System.arraycopy(values, 0, newValues, 0, ordinal);
        newValues[ordinal] = newInstance;

        /* Replace old enum.values with new */
        /* $VALUES is static final so we have to make it non-final first 😎 */
        Field valuesField = getDeclaredField(type, "$VALUES");
        Field modifiersField = getDeclaredField(Field.class, "modifiers");
        modifiersField.setInt(valuesField, valuesField.getModifiers() & ~Modifier.FINAL);
        valuesField.set(null, newValues);
    }
}
