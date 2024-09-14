package space.algolab;

public class Main {
    static {
        System.loadLibrary("c");
    }

    public static void main(String[] args) {
        JniClass jniClass = new JniClass();
        jniClass.nativeMethod();
    }
}