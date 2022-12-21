public class Dog {
    // data members
    private String name;
    private int age;
    private String breed;
    private boolean isTrained;

    // constructor
    public Dog(String name, int age, String breed, boolean isTrained) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isTrained = isTrained;
    }

    // getters and setters for data members
    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        this.age = age;
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String setBreed(String breed) {
        this.breed = breed;
        return breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public boolean setTrained(boolean trained) {
        isTrained = trained;
        return trained;
    }

    // other functions
    public void bark() {
        System.out.println("Woof woof!");
    }

    public void sit() {
        System.out.println(name + " is now sitting.");
    }

    public void layDown() {
        System.out.println(name + " is now laying down.");
    }

    public void rollOver() {
        System.out.println(name + " is now rolling over.");
    }
    public void bringStick (){
        System.out.println(name + " is bringing me a stick");
    }
}
class Demo {
    public void RetEx (){
        Dog Retriver = new Dog("Sindy",3,"Retriver",true);
        Retriver.bark();
        Retriver.sit();
        Retriver.layDown();
        Retriver.rollOver();
        Retriver.bringStick();
    }
}
