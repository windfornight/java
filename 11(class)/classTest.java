public class classTest{
	public static void main(String[] args){
		classTestA a = new classTestA();
		System.out.println(a.toString());
		
		classTestB b = new classTestB();
		b.print();
		
		b.staticFunc();
		
		System.out.println(b.toString());
		
		System.out.println(b.getA());
	}
}


//默认的父类是object
class classTestA{
	protected int a;
	classTestA(){
		a = 1;
	}
	
	public void print(){
		System.out.println("This is in a!");
	}
	
	public static void staticFunc()
	{
		System.out.println("static func in a");
	}
	
	public int getReloadFunc(int a)
	{
		return a;
	}
	
	//重载
	public double getReloadFunc(double a)
	{
		return a;
	}
	
	protected int getA()
	{
		return a;
	}
}

//final 防止扩展
final class classTestB extends classTestA{
	
	classTestB(){
		super();
		a = 100;
	}
	
	@Override  //重写标志，表示必需重写, 表现为多态
	public String toString(){
		return "b string test";
	}
	
	
	public final void print(){
		super.print();  //调用父类的方法
		System.out.println("but is in B!");
	}
	
	
	public static void staticFunc(){
		classTestA.staticFunc();  //静态调用父类方法
		System.out.println("static func in B");
	}
}

//public protected default privite