import java.lang.CharSequence;
public class charSequence implements CharSequence{
    String str;
    public charSequence() {}
    public charSequence(String str) {
        this.str = str;
    }
    private int searchIndex(int i) {
        return str.length() - str.length() + i;
    }
    @Override
    public char charAt(int i) {
        if (i < 0 && i > str.length() - 1) {
            throw new StringIndexOutOfBoundsException(i);
        }
        return str.charAt(i);
    }
    @Override
    public int length() {
        int value = 0;
        while(value<str.length()){
            value++;
        }
        return value;
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }
    @Override
    public String toString() {
        return str;
    }
}
