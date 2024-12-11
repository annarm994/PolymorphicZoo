package zoo;

import java.util.ArrayList;

public class ZooDemo {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba");
        Elephant elephant = new Elephant("Dumbo");
        Monkey monkey = new Monkey("George");

        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(lion);
        zoo.add(elephant);
        zoo.add(monkey);

        for (Animal animal : zoo) {
            System.out.println("Animal: " + animal.getName());
            System.out.print("Single sound: ");
            animal.makeSound();
            System.out.println();

            System.out.print("Repeated sound: ");
            animal.makeSound(3);
            System.out.println("\n");
        }
    }
}
