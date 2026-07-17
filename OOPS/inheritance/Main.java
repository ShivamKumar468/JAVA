//java.util.io
package inheritance;

class Animal {
    void eat(){
        System.out.println("Eating");
    }

}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }

}

public class Main{
    public static void main(String args[]){
        Dog d= new Dog();
        d.bark();
        d.eat();
    }
}