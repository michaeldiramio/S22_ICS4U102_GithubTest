import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Snake());
		animals.add(new Mouse());


		for(int i = 0; i < animals.size(); i++) {
			animals.get(i).makeNoise();
		}
		
	}

	
}