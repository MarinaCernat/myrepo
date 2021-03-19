package Java;

public class MyClass {
    private String text1;
    private String text2;

    public MyClass(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    @Override
    public String toString() {
        return text1 + " " + text2;
    }
}
