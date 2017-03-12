
public class B extends A{
	
	public B(){
		//super();
		System.out.println("in B");
	}
	
	void print(){
		super.print();
		System.out.println("in B");
		//print();
	}

	public static void main(String[] args) {
		B b = new B();
		//b.print();
		//B a = new A();
		//a.print();
	}
}
