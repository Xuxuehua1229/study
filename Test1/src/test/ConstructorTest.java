package test;

public class ConstructorTest {
    //创建对象时构造器的调用顺序是：先初始化静态成员，然后调用父类构造器，再初始化非静态成员，最后调用自身构造器
    static class A {
    	static {
    		System.out.print("1");
    	}
    	public A(){
    		System.out.print("2");
    	}
    }
    static class B extends A{
    	static{
    		System.out.print("a");
    	}
    	public B(){
    		System.out.println("b");
    	}
    }
    

    static ConstructorTest constructor = new ConstructorTest("2");
    static {
    	System.out.print("1");
    }
    ConstructorTest(String s){
    	System.out.print("  "+s);
    }
    public static void staticFunction(){
    	System.out.println("3");
    } 
	public static void main(String[] args) {
       staticFunction();
       System.out.println("================================");
       A a = new B();
       a = new B();
	}

}
