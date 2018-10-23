package inner;

public class InnerClassTest3 {
    private static int i = 1;
    private int j = 10;
    public static void outer_f1(){
    	
    }
    public void outer_f2(){
    	
    }
    //1：静态内部类可以用public、protected、private修饰 2:静态内部类中可以定义静态变量或者非静态变量
    static class Inner{
    	static int inner_i = 100;
    	int inner_j = 200;
    	static void inner_f1(){
    		System.out.println("outer.i="+i);//静态内部类只能访问外部类的静态成员（包括静态变量和静态方法）
    		outer_f1();
    	}
    	void inner_f2(){
    		System.out.println("inner_f2...");
    		//System.out.println(InnerClassTest3.this.j); 报错
    		//System.out.println("outer.j="+j); 报错 非静态内部类不能访问外部类的非静态成员（包括非静态变量和非静态方法）
    		//outer_f2(); 报错
    	}
    }
    
    public void outer_f3(){
    	System.out.println("Inner.inner_i="+Inner.inner_i);//外部类访问内部类的静态成员：内部类.静态成员
    	Inner.inner_f1();
    	Inner inner = new Inner();//外部类访问内部类的非静态变量成员：实例化内部类即可
    	inner.inner_f2();
    }
	public static void main(String[] args) {
        new InnerClassTest3().outer_f3();
	}

}
