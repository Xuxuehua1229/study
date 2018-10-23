package inner;

public class InnerClassTest1 {
    private static int i = 1;
    private int j = 10;
    private int k = 20;
    
    public static void outer_f1(){
    	System.out.println("outer_f1...");
    }
    public void outer_f2(){
    	System.out.println("outer_f2...");
    }
    //成员内部类中，1.不能定义静态成员  2.可以访问外部类的所有成员
    class Inner{
    	int i = 2;
    	int j = 100;//内部类和外部类的实例变量可以共存
    	int inner_i = j;
    	void inner_f1(){
    		System.out.println("outer_static_i="+InnerClassTest1.i);//在内部类中访问外部类的静态变量直接用(外部类名.静态变量名)
    		System.out.println("inner_i="+i);//在内部类中访问内部类自己的变量直接用(变量名)即可
    		System.out.println("inner_this.j="+this.j);//在内部类中访问内部类自己的变量也可以用(this.变量名)
    		System.out.println("outer_j="+InnerClassTest1.this.j);//在内部类中访问外部类变量用(外部类名.this.变量名)
    		System.out.println("outer_k="+k);//如果内部类中没有与外部类同名的变量，则可以直接用变量名访问外部类变量	
    		outer_f1();
    		outer_f2();
    	}
    }
    //外部类的非静态方法访问成员内部类
    public void outer_f3(){
    	Inner inner = new Inner();
    	inner.inner_f1();
    }
    //外部类的静态方法访问成员内部类，与在外部类外部访问成员内部类一样
    public static void outer_f4(){
    	//step1 建立外部类对象
    	InnerClassTest1 out = new InnerClassTest1();
    	//step2 根据外部类对象建立内部类对象
    	Inner inner = out.new Inner();
    	//step3 访问内部类的方法
    	inner.inner_f1();
    }
	public static void main(String[] args) {
		//outer_f4();
        InnerClassTest1 out = new InnerClassTest1();
        InnerClassTest1.Inner outin = out.new Inner();//创建外部类中非静态的内部类对象
        outin.inner_f1();
	}

}
