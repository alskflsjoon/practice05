package prob3;

public class SoundTest {

	static void printSound(Soundable obj){
		System.out.println(obj.sound());
	}
	
	public static void main(String[] args) {
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
}
