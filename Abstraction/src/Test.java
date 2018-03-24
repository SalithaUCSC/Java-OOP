abstract class Animal{
    private int age;
    abstract void eat();

    void sleep(){
        System.out.println("Animal is sleeping...");
    }

}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating...");
    }
}

class Test {
    public static void main(String args[]){
        Animal a = new Dog();
        a.eat();        // Executed with overriding
        a.sleep();      // Executed without overriding
    }
}
