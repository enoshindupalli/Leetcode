//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge",400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie,"fast");

        Dog retriever = new Dog("Lab Retriever", 65,"Floppy", "Swimmer");
        doAnimalStuff(retriever,"slow");

        Fish gold = new Fish("Goldish", 0.25,2,3);
        doAnimalStuff(gold, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}