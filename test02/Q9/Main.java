public class Main{
	public static void main(String[] args){
		//下記にて検証してください

		//Q1
		//new A().a();
		
		//Q2
		//Y y=new A();
		//y.b();
		
		//Q3
		//B b=new A();
		//b.c();
		
		//Q4
		//X x=new Y();
		//x.a();
		
		//Q5
		//Y y=new A();
		//((A)y).c();
		
		//Q6
		//Y y=new B();
		//((A)y).a();
		
		//Q7
		//X x=new B();
		//x.a();
	}
}
interface X{
	void a();
}
abstract class Y implements X{
	public abstract void a();
	public abstract void b();
}
class A extends Y{
	public void a(){
		System.out.println("Aa");
	}
	public void b(){
		System.out.println("Ab");
	}
	public void c(){
		System.out.println("Ac");
	}
}
class B extends Y{
	public void a(){
		System.out.println("Ba");
	}
	public void b(){
		System.out.println("Bb");
	}
	public void c(){
		System.out.println("Bc");
	}
}
