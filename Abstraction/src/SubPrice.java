public class SubPrice extends Player {
    private float price;
    public SubPrice(String username,String email,int id, float price){
        super(username,email,id);
        setPrice(price);
    }
    public void sendingCheck() {
        System.out.println("Sending check to " + getUsername() + " with price " + price);
    }
    public void setPrice(float newPrice){
        if (newPrice>=0.0){
            price = newPrice;
        }
    }
}
