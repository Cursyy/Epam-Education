public class Parametrs {
    private String name;
    private String lastname;
    private int age;
    public String getName(){
        return name;
    }
    public String getLastname(){
        return lastname;
    }
    public int getAge(){
        return age;
    }
    public void refName( String newName){
        name = newName;
    }
    public void refLastName(String newLastname){
        lastname = newLastname;
    }
    public void refAge(int newAge){
        age = newAge;
    }
}
