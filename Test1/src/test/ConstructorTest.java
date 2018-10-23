package test;

public class ConstructorTest {
    //��������ʱ�������ĵ���˳���ǣ��ȳ�ʼ����̬��Ա��Ȼ����ø��๹�������ٳ�ʼ���Ǿ�̬��Ա����������������
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
