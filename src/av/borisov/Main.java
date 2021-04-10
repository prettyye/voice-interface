package av.borisov;

public class Main {
	public static void main(String[] args) {
		Voice[] voicedAnimals = {new Cat(), new Dog(), new Cow()};
		for (Voice animal : voicedAnimals) {
			System.out.print(animal.getClass().getSimpleName()+" says: ");
			animal.voice();
		}
	}
}
