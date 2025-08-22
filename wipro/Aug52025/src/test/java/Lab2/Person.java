package Lab2;

public class Person {
	
	    private String name;
	    private float age;

	    public Person(String name, float age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public float getAge() {
	        return age;
	    }

	    // Setters
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(float age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Person{Name='" + name + "', Age=" + age + "}";
	    }
	}

