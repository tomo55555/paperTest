public class Main{
	public static void main(String[] args){
		Dog d1=new Dog();
		Dog d2=new Dog("Paul");
		d1.showStatus();
		d2.showStatus();
	}
}
class Dog{
	private String name="未定";
	private int no;
	private static int totalCount=0;
	public Dog(){
		totalCount++;
		this.no=totalCount;
	}
	public Dog(String name){
		this();
		this.name=name;
	}
	public void showStatus(){
		System.out.printf("名前:%s,NO:%d%n",this.name,this.no);
	}
}
