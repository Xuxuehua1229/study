package enums;


public class EnumTest1 {

	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SPRING.getSeasonName());
		Season.SPRING.show();
	}
}

class Season{
	//�ṩ������ԣ�private final
	private final String seasonName;
	private final String seasonDesc;
	
	//�ṩ��Ĺ�������private
	private Season(String seasonName, String seasonDesc) {
		super();
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
	
	//����ö����Ķ���
	public static final Season SPRING = new Season("spring", "��ů����");
	public static final Season SUMMER = new Season("summer", "��������");
	public static final Season AUTUMN = new Season("autumn", "�����ˬ");
	public static final Season WINTER = new Season("winter", "��ѩ����");
	
	
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}

	public void show(){
		System.out.println("����һ������");
	}
	
} 
