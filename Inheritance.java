
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}


class Student {
    void study() {
        System.out.println("Student studies");
    }
}

class Graduate extends Student {
    void research() {
        System.out.println("Graduate student researches");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}


interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {
    public void showFather() {
        System.out.println("This is father");
    }

    public void showMother() {
        System.out.println("This is mother");
    }
}


public class Inheritance {   // 👈 CHANGED HERE
    public static void main(String[] args) {

        // Single Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        Graduate g = new Graduate();
        g.study();
        g.research();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple Inheritance
        Child ch = new Child();
        ch.showFather();
        ch.showMother();
    }
}