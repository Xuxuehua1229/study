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
    //��Ա�ڲ����У�1.���ܶ��徲̬��Ա  2.���Է����ⲿ������г�Ա
    class Inner{
    	int i = 2;
    	int j = 100;//�ڲ�����ⲿ���ʵ���������Թ���
    	int inner_i = j;
    	void inner_f1(){
    		System.out.println("outer_static_i="+InnerClassTest1.i);//���ڲ����з����ⲿ��ľ�̬����ֱ����(�ⲿ����.��̬������)
    		System.out.println("inner_i="+i);//���ڲ����з����ڲ����Լ��ı���ֱ����(������)����
    		System.out.println("inner_this.j="+this.j);//���ڲ����з����ڲ����Լ��ı���Ҳ������(this.������)
    		System.out.println("outer_j="+InnerClassTest1.this.j);//���ڲ����з����ⲿ�������(�ⲿ����.this.������)
    		System.out.println("outer_k="+k);//����ڲ�����û�����ⲿ��ͬ���ı����������ֱ���ñ����������ⲿ�����	
    		outer_f1();
    		outer_f2();
    	}
    }
    //�ⲿ��ķǾ�̬�������ʳ�Ա�ڲ���
    public void outer_f3(){
    	Inner inner = new Inner();
    	inner.inner_f1();
    }
    //�ⲿ��ľ�̬�������ʳ�Ա�ڲ��࣬�����ⲿ���ⲿ���ʳ�Ա�ڲ���һ��
    public static void outer_f4(){
    	//step1 �����ⲿ�����
    	InnerClassTest1 out = new InnerClassTest1();
    	//step2 �����ⲿ��������ڲ������
    	Inner inner = out.new Inner();
    	//step3 �����ڲ���ķ���
    	inner.inner_f1();
    }
	public static void main(String[] args) {
		//outer_f4();
        InnerClassTest1 out = new InnerClassTest1();
        InnerClassTest1.Inner outin = out.new Inner();//�����ⲿ���зǾ�̬���ڲ������
        outin.inner_f1();
	}

}
