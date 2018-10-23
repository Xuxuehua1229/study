package enums;

public class EnumTest2 {
   public static void main(String[] args) {
	  System.out.println(Season1.SUMMER);
      Season1.SUMMER.show();
      System.out.println(Season1.SUMMER.getSeasonDesc());
      System.err.println();
      Season1[] s1 = Season1.values();
      for (int i = 0; i < s1.length; i++) {
		 System.out.println(s1[i]);
	  }
      //valueOf(String name):Ҫ������β�name��ö����Ķ��󣬰�����СҲҪһ��
      //����ͻᱨjava.lang.IlleagalArgumentException�쳣
      Season1 s2 = Season1.valueOf("SPRING");
      System.out.println(s2.getSeasonName());
      System.out.println();
      
      Thread.State[] states = Thread.State.values();
      for (int i = 0; i < states.length; i++) {
		 System.out.println(states[i]);
	  }
   }
}
enum Season1{
	//����ö����Ķ���
	SPRING("spring", "��ů����"),
	SUMMER("summer", "��������"),
	AUTUMN("autumn", "�����ˬ"),
	WINTER("winter", "��ѩ����");
	
	//�ṩ������ԣ�private final
	private final String seasonName;
	private final String seasonDesc;
	
	//�ṩ��Ĺ�������private
	private Season1(String seasonName, String seasonDesc) {
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}
    //ͨ�������ķ����������������
	public String getSeasonName() {
		return seasonName;
	}

	public String getSeasonDesc() {
		return seasonDesc;
	}
	
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}

	public void show(){
		System.out.println("����һ������");
	}
	
} 