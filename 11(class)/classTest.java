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


//Ĭ�ϵĸ�����object
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
	
	//����
	public double getReloadFunc(double a)
	{
		return a;
	}
	
	protected int getA()
	{
		return a;
	}
}

//final ��ֹ��չ
final class classTestB extends classTestA{
	
	classTestB(){
		super();
		a = 100;
	}
	
	@Override  //��д��־����ʾ������д, ����Ϊ��̬
	public String toString(){
		return "b string test";
	}
	
	
	public final void print(){
		super.print();  //���ø���ķ���
		System.out.println("but is in B!");
	}
	
	
	public static void staticFunc(){
		classTestA.staticFunc();  //��̬���ø��෽��
		System.out.println("static func in B");
	}
}

//public protected default privite