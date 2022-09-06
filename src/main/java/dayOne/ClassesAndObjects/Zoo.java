package dayOne.ClassesAndObjects;

public class Zoo {
    public static void main(String[] args) {

        //dataType of thing we want to create
        Animal animal1 = new Animal("Dog", 2, "woof woof");
        Animal animal2 = new Animal("Spider", 8, "silent killer");
        Animal animal3 = new Animal("Fish");
        System.out.println(animal1.getNumberEyes());
    }
}
