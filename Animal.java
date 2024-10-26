class Animal {
    public void makeSound(){
        System.out.println("Animal make a sound");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("dog bar");
    }

}
class cat extends Animal{
    public void makeSound(){
        System.out.println("cat meow");
    }
}

class bird extends Animal{
    public void makeSound(){
        System.out.println("bird chips");
    }
}
public class Main{
    public static void main(String[]args){
        Animal [] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new cat();
        animals[2] = new bird();
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}




