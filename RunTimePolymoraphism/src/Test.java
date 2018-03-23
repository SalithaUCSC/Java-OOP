class Animal {
    // most super class method
    public void eat(){
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal{
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("Dog eats meat");
    }
}

class Puppy extends Dog{
    // dynamic method dispatch happens to this method
    public void eat() {
        System.out.println("Puppy drinks milk");
    }
}

class Test{
    public static void main(String args[]){
        // create reference variables
        Animal a1, a2, a3;
        System.out.println("-----No Dynamic method dispatch-----");
        a1 = new Animal();
        a1.eat();
        System.out.println("-----Dynamic method dispatch-----");
        a2 = new Dog();
        a3 = new Puppy();

        a2.eat();
        a3.eat();
    }
}