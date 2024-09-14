package space.algolab.field;

public class JavaVariables {
    private int privateNum = 0;
    public int publicNum = 0;
    private static int staticPrivateNum = 0;
    public static int staticPublicNum = 0;

    public native void setPrivateNum(int value);

    public native void setStaticPrivateNum(int value);

    public void printPrivates() {
        System.out.println("privateNum = " + privateNum);
        System.out.println("staticPrivateNum = " + staticPrivateNum);
    }
}
