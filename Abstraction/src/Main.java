public class Main {
    public static void main(String[] args) {
        SubPrice first = new SubPrice("Alex","kurilets.o.v@gmail.com",2503,120);
        Player second = new SubPrice("Yura","Yura123@gmail.com",1701,180);
        System.out.println("first player--");
        first.sendingCheck();
        System.out.println("second player--");
        second.sendingCheck();
    }
}