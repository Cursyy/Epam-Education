public class Deck extends Card{
    public void show() {
        for(int i = 0;i< Suit.length;i++){
            for(int j = 0;j< Ranks.length;j++){
                System.out.println(Suit[i]+" "+Ranks[j]);
            }
        }
    }
}
