package inner;

public class InnerClassTest3 {
    private static int i = 1;
    private int j = 10;
    public static void outer_f1(){
    	
    }
    public void outer_f2(){
    	
    }
    //1����̬�ڲ��������public��protected��private���� 2:��̬�ڲ����п��Զ��徲̬�������߷Ǿ�̬����
    static class Inner{
    	static int inner_i = 100;
    	int inner_j = 200;
    	static void inner_f1(){
    		System.out.println("outer.i="+i);//��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա��������̬�����;�̬������
    		outer_f1();
    	}
    	void inner_f2(){
    		System.out.println("inner_f2...");
    		//System.out.println(InnerClassTest3.this.j); ����
    		//System.out.println("outer.j="+j); ���� �Ǿ�̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա�������Ǿ�̬�����ͷǾ�̬������
    		//outer_f2(); ����
    	}
    }
    
    public void outer_f3(){
    	System.out.println("Inner.inner_i="+Inner.inner_i);//�ⲿ������ڲ���ľ�̬��Ա���ڲ���.��̬��Ա
    	Inner.inner_f1();
    	Inner inner = new Inner();//�ⲿ������ڲ���ķǾ�̬������Ա��ʵ�����ڲ��༴��
    	inner.inner_f2();
    }
	public static void main(String[] args) {
        new InnerClassTest3().outer_f3();
	}

}
