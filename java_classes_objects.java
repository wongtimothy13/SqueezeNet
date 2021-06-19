

public class java_classes_objects {
    public static void main(String[] args){

        // Pet dog = new Pet(15);
        // int age = dog.getAge();
        // System.out.println(age);

        Vehicle tesla = new Vehicle();
        int year = tesla.getYear();
        System.out.println(year);
    }
}

// Number 1 
class Pet {
    private String name;
    private int age;
    private String location; 
    private String type;

    public Pet(int Age) {
        this.age = Age;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getType() {
        return type;
    }

    //setters
    public void setName(String Name) {
        this.name = Name;
    }
    public void setAge(int Age) {
        this.age = Age;
    }
    public void setLocation(String Location) {
        this.location = Location;
    }
}


//Number 2 
class Vehicle {
    private String model;
    private int year;
    private String color;
    private int price;
    private int inventory = 0;

    public Vehicle() {
    }

    public Vehicle(String Model, int Year) {
        this.model = Model;
        this.year = Year;
    }

    public Vehicle(String Model, int Year, String Color) {
        this.model = Model;
        this.year = Year;
        this.color = Color;
    }

    //getter methods
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public String  getColor() {
        return color;
    }

    //setter methods
    public void setModel(String Model) {
        this.model = Model;
    }
    public void setYear(int Year) {
        this.year = Year;
    }
    public void setColor(String Color) {
        this.color = Color;
    }

    //method with Boolean return
    public boolean availability() {
        if (this.inventory != 0){
            return true;
        } else {
            return false;
        }
    }

    //method with String return
    public String lol() {
        return "Hey, LOL my dude.";
    }
}