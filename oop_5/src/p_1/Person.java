package p_1;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name) throws ImpossibleInfo {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws ImpossibleInfo{
		if(name.length() < 5) {
			throw new ImpossibleInfo("name is too short: " + name);
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws ImpossibleInfo {
		if(age < 0 || age > 150) {
			throw new ImpossibleInfo("impossible age: " + age);
		}
		this.age = age;
	}
	
	public String toString() {
	       return getName() + " " + getAge();
	}
	
	

}
