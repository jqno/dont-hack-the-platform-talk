package demos.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflector {

    public static <T> Constructor<T> getDeclaredConstructor(Class<T> type, Class<?>... parameterTypes) throws NoSuchMethodException {
        Constructor<T> constructor = type.getDeclaredConstructor(parameterTypes);
        constructor.setAccessible(true);
        return constructor;
    }

    public static <T> Method getDeclaredMethod(Class<T> type, String name, Class<?>... parameterTypes) throws NoSuchMethodException {
        Method method = type.getDeclaredMethod(name, parameterTypes);
        method.setAccessible(true);
        return method;
    }

    public static <T> Field getDeclaredField(Class<T> type, String fieldName) throws NoSuchFieldException {
        Field field = type.getDeclaredField(fieldName);
        field.setAccessible(true);
        return field;
    }

    public static <T> void setPrivateField(Class<T> type, String fieldName, T receiver, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Field field = getDeclaredField(type, fieldName);
        field.set(receiver, newValue);
    }

    public static <T> Object getPrivateField(Class<T> type, String fieldName, T receiver) throws NoSuchFieldException, IllegalAccessException {
        Field field = getDeclaredField(type, fieldName);
        return field.get(receiver);
    }
}
