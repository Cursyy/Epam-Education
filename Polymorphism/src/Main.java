public class Main {
    public static void main(String[] args) {
        Clock myClock = new Clock();
        Clock myCasio = new Casio();
        Clock myGShock = new gShock();
        myClock.clockBrand();
        myCasio.clockBrand();
        myGShock.clockBrand();
    }
}