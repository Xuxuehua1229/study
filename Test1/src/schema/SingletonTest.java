package schema;

public class SingletonTest {
	public static void main(String[] args) {
		//����ģʽ:ֻ�ܴ���һ������
       Singleton1 s1 = Singleton1.getSingleton();
       System.out.println(s1);
       Singleton1 s2 = Singleton1.getSingleton();
       System.out.println(s2);
	}
}

//����ģʽ(����ʽ)
class Singleton1{
	//���幹������˽�л���
	private Singleton1(){

	}
	//��������ģʽ����
	private static Singleton1 singleton1 = new Singleton1(); 
	public static Singleton1 getSingleton() {
		return singleton1;
	}
}

//����ģʽ(����ʽ)
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
