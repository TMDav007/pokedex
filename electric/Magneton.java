package electric;

public class Magneton {

	private String name = "Magneton";
	private String type = "Electric/Steel";
	private String color = "Red";
	private String evolution = "Final";

	public String getName() {
		return this.name;
	}

	public void showDetails() {
		System.out.println("The details are name is " + name + "type is " + type + "color is " + color + ",and evolution is " + evolution);
	}


}
