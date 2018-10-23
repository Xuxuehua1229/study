package inner;

public class InnerClassTest2 {
    private int s = 100;
    private int out_i = 1;
    
    public void f(final int k){
    	final int s = 200;
    	int i = 1;
    	final int j = 10;
    	
    	//局部内部类（定义在方法内部） 与局部变量类似，不能有访问修饰符
    	class Inner{
    		int s = 300;//可以定义与外部类同名的变量
    		//static int m = 20; 不可以定义静态变量
    		Inner(int k){
    			inner_f(k);
    		}
    		int inner_j = 100;
    		
        	void inner_f(int k){
        		System.out.println("inner_j:"+inner_j);
        		System.out.println("out_i="+out_i);//如果内部类没有与外部类同名的变量，在内部类中可以直接访问外部类的实例变量
        		System.out.println("j="+j);//可以访问外部类的局部变量（即方法内的变量），但是变量必须是final的
        		//System.out.println("i="+s); 问题：如果内部类有与外部类局部变量（被final修改的）同名的变量，怎么访问该外部类局部变量呢？？？
        		System.out.println("inner_s="+s);//如果内部类中有与外部类同名的变量，直接用变量名访问的是内部类的变量 
        		System.out.println("inner_this.s="+this.s);//用（this.变量名）访问的也是内部类变量
        		System.out.println("out_this.s="+InnerClassTest2.this.s);//用（外部类名.this.内部类变量名）访问的是外部类变量
        	}
    	}
    	new Inner(k);
    }
    
	public static void main(String[] args) {
		//访问局部内部类必须先有外部类对象
        InnerClassTest2 out = new InnerClassTest2();
        out.f(3);
	}

}
