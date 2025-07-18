public class D52ensyu {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Horse horse = new Horse();

        cat.bark();
        horse.bark();
    }
}

class Animal {
    public void bark() {
        System.out.println("何かの鳴き声");
    }
}

class Cat extends Animal {
    @Override
    public void bark() {
        System.out.println("にゃーん");
    }
}

class Horse extends Animal {
    @Override
    public void bark() {
        System.out.println("ひひーん");
    }
}
