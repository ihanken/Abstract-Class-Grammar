public abstract class Animal {
    public abstract void cry();
}

public class Dog: Animal {
    void cry() {
    }

    public static void main(String args[]){
       Animal obj = new Dog();
       obj.cry();
    }
}
