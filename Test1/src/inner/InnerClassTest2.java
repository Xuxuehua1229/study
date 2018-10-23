package inner;

public class InnerClassTest2 {
    private int s = 100;
    private int out_i = 1;
    
    public void f(final int k){
    	final int s = 200;
    	int i = 1;
    	final int j = 10;
    	
    	//�ֲ��ڲ��ࣨ�����ڷ����ڲ��� ��ֲ��������ƣ������з������η�
    	class Inner{
    		int s = 300;//���Զ������ⲿ��ͬ���ı���
    		//static int m = 20; �����Զ��徲̬����
    		Inner(int k){
    			inner_f(k);
    		}
    		int inner_j = 100;
    		
        	void inner_f(int k){
        		System.out.println("inner_j:"+inner_j);
        		System.out.println("out_i="+out_i);//����ڲ���û�����ⲿ��ͬ���ı��������ڲ����п���ֱ�ӷ����ⲿ���ʵ������
        		System.out.println("j="+j);//���Է����ⲿ��ľֲ��������������ڵı����������Ǳ���������final��
        		//System.out.println("i="+s); ���⣺����ڲ��������ⲿ��ֲ���������final�޸ĵģ�ͬ���ı�������ô���ʸ��ⲿ��ֲ������أ�����
        		System.out.println("inner_s="+s);//����ڲ����������ⲿ��ͬ���ı�����ֱ���ñ��������ʵ����ڲ���ı��� 
        		System.out.println("inner_this.s="+this.s);//�ã�this.�����������ʵ�Ҳ���ڲ������
        		System.out.println("out_this.s="+InnerClassTest2.this.s);//�ã��ⲿ����.this.�ڲ�������������ʵ����ⲿ�����
        	}
    	}
    	new Inner(k);
    }
    
	public static void main(String[] args) {
		//���ʾֲ��ڲ�����������ⲿ�����
        InnerClassTest2 out = new InnerClassTest2();
        out.f(3);
	}

}
