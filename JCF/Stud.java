package JavaCollectionFramework;

public class Stud implements Comparable<Stud> {

    // This method is called for the current object (this)
    // Here we define the sorting logic
    // Sort on the basis of age
    @Override
    public int compareTo(Stud that) {
        if(this.age == that.age){
            this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }

    public int age;
    public String name;
    public int weight;

    // Constructor
    public Stud(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getters and Setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Display object in readable format
    @Override
    public String toString() {
        return "Stud{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}