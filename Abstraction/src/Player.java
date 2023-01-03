public abstract class  Player{
    private String username;
    private String email;
    private int id;
    public Player(String username, String email, int id){
        System.out.println("Constructing player account");
        this.username = username;
        this.email = email;
        this.id = id;
    }
    public void sendingCheck(){
        System.out.println("Sending a check to " + this.username +  " " + this.email);
    }
    public String getUsername() {
        return username;
    }
}
