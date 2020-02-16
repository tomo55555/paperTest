public class AnimalClient{
	public static void main(String[] args){
		Animal[] animals={new Dog("ポチ"),new Cat("タマ")};
		for(Animal a:animals){
			a.introduce();
			a.makeNoise();
			if(a instanceof Cat){
				((Cat)a).sleep();
			}
		}
	}
}
abstract class Animal{
	String name;
	Animal(String name){
		this.name=name;
	}
	void introduce(){
		System.out.printf("名前は%sだよ。%n",this.name);
	}
	abstract void makeNoise();
}
class Dog extends Animal{
	Dog(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println("ワン!");
	}
}
class Cat extends Animal{
	Cat(String name){
		super(name);
	}
	@Override
	void makeNoise(){
		System.out.println("ニャー!");
	}
	void sleep(){
		System.out.println("こたつでおやすみ。");
	}
}






