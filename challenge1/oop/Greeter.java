package challenge1.oop;

public class Greeter {

    void greet(){
        System.out.println("Hi there");
    }

    public static void main(String[] args){
        (new Greeter()).greet();
    }
}
