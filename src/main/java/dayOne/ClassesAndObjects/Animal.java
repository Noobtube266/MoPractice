package dayOne.ClassesAndObjects;
//blueprint for making objects
public class Animal {

    //default constructor until parameterized is created
//instance variable or property
    public String animalName;
    public int eyes;
    public String animalSound;

    //Constructor = construct objects in main

    public Animal(String animalName, int eyes, String animalSound){
this.animalName = animalName;
this.eyes = eyes;
this.animalSound = animalSound;

    }
    //Overloaded constructor
    public Animal(String animalName){
        this.animalName = animalName;
    }
    //Method
    /*
    accessModifier, return Data type, name (), {}
     */
    public String printNameAndMakeNoise(){

        return animalName + "========>" + this.animalSound;
    }
    public int getNumberEyes(){
        return this.eyes;
    }

}
