package Lab2;


public class Lab2_5Person {
	private String name;
    private float age;

    // Constructor
    public Lab2_5Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getAge() {
        return age;
    }
    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


