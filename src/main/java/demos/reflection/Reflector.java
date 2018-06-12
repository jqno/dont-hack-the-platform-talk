package demos.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflector {

    public static <T> Method getDeclaredMethod(Class<T> type, String name, Class<?>... parameterTypes) throws NoSuchMethodException {
        var method = type.getDeclaredMethod(name, parameterTypes);
        method.setAccessible(true);
        return method;
    }

    public static <T> Field getDeclaredField(Class<T> type, String fieldName) throws NoSuchFieldException {
        var field = type.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    }

    public static <T> void setPrivateFieldValue(Class<T> type, String fieldName, T receiver, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        var field = getDeclaredField(type, fieldName);
        field.set(receiver, newValue);
    }

    public static <T> Object getPrivateFieldValue(Class<T> type, String fieldName, T receiver) throws NoSuchFieldException, IllegalAccessException {
        var field = getDeclaredField(type, fieldName);
        return field.get(receiver);
    }
}
