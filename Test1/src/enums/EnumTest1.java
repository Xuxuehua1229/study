package enums;


public class EnumTest1 {

	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SPRING.getSeasonName());
		Season.SPRING.show();
	}
}

class Season{
	//提供类的属性：private final
	private final String seasonName;
	private final String seasonDesc;
	
	//提供类的构造器：private
	private Season(String seasonName, String seasonDesc) {
		super();
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}
    //通过公共的方法来调用类的属性
	public String getSeasonName() {
		return seasonName;
	}

	public String getSeasonDesc() {
		return seasonDesc;
	}
	
	//创建枚举类的对象
	public static final Season SPRING = new Season("spring", "春暖花开");
	public static final Season SUMMER = new Season("summer", "夏日炎炎");
	public static final Season AUTUMN = new Season("autumn", "秋高气爽");
	public static final Season WINTER = new Season("winter", "白雪皑皑");
	
	
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}

	public void show(){
		System.out.println("这是一个季节");
	}
	
} 
