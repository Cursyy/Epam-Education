public class Main {
    public static void main(String[] args) {
        charSequence charSeq = new charSequence("Simple text");
        System.out.println((charSeq.charAt(5)));
        System.out.println(charSeq.length());
        System.out.println(charSeq.subSequence(0,3));
        System.out.println(charSeq.isEmpty());
    }
}