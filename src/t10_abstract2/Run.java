package t10_abstract2;

public class Run {
	public static void main(String[] args) {
		// Animal animal = new Animal(); -> 추상클래스는 new로 생성할 수 없다
		
		Animal aniDog = new Dog();
		aniDog.cry();
		
		Animal aniCat = new Cat();
		aniCat.cry();
		
	}
}
