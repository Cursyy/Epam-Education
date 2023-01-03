public class Main {
    public static void main(String[] args) {
        Parametrs param = new Parametrs();
        param.refName("Alex");
        param.refLastName("Kurilets");
        param.refAge(17);
        System.out.print("Name - "+param.getName()+"\nLast name - "+param.getLastname()+"\nAge - "+param.getAge());
    }
}