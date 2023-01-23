public class Card {
    final String[] Ranks = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};
    final String[] Suit = {"Hearts","Tiles","Clovers","Pikes"};
    public void getSuit() {
        for (int i = 0; i < Suit.length; i++) {
            System.out.println(Suit[i]);
        }
    }
    public void getRanks(){
         for(int j = 0;j< Ranks.length;j++){
             System.out.println(Ranks[j]);
        }
    }
}
