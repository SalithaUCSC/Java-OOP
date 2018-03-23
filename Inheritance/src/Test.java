class Animal{
    int age = 5;
    void eat(){
        System.out.println("Animal eats");
    }
    void sleep(){
        System.out.println("Animal sleeps");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Test{
    public static void main(String args[]){
        Dog dog = new Dog();
        // call methods from super class
        dog.sleep();
        dog.eat();
        // call method from sub class
        dog.bark();
        // get attribute value from super class
        System.out.println("Age : " + dog.age);

    }
}