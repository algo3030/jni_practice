package space.algolab;

public class Main {
    public static void main(String[] args) {
        JniClass jniClass = new JniClass();
        jniClass.nativeMethod();
        System.out.println("Hello, World!");
    }
}