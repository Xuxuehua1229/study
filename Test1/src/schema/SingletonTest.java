package schema;

public class SingletonTest {
	public static void main(String[] args) {
		//单例模式:只能创建一个对象
       Singleton1 s1 = Singleton1.getSingleton();
       System.out.println(s1);
       Singleton1 s2 = Singleton1.getSingleton();
       System.out.println(s2);
	}
}

//单例模式(饿汉式)
class Singleton1{
	//定义构造器（私有化）
	private Singleton1(){

	}
	//创建单例模式对象
	private static Singleton1 singleton1 = new Singleton1(); 
	public static Singleton1 getSingleton() {
		return singleton1;
	}
}

//单例模式(饱汉式)
class Singleton2{
	private Singleton2(){

	}
	private static Singleton2 singleton2 = null;
	public static Singleton2 getSingleton2() {
		if(singleton2 == null){
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
