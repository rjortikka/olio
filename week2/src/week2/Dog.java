package week2;

public class Dog{
	
	private String name;
	private String says;
	
	public void speak(String says) {
		
		if (says.trim().isEmpty()) {
			this.says = "Much wow";
		} else {
			this.says = says;
		}
		System.out.println(name + ": " + this.says);
		
	}
	
	public Dog(String name) {
		if (name.trim().isEmpty()) {
			this.name = "Doge";
		} else {
			this.name = name;
		}
		System.out.println("Hey my name is: " + this.name);
	}

}

