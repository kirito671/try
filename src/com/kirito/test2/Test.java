package com.kirito.test2;

public class Test {
    static void main() {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
