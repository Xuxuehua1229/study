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
      //valueOf(String name):要求传入的形参name是枚举类的对象，包括大小也要一致
      //否则就会报java.lang.IlleagalArgumentException异常
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
	//创建枚举类的对象
	SPRING("spring", "春暖花开"),
	SUMMER("summer", "夏日炎炎"),
	AUTUMN("autumn", "秋高气爽"),
	WINTER("winter", "白雪皑皑");
	
	//提供类的属性：private final
	private final String seasonName;
	private final String seasonDesc;
	
	//提供类的构造器：private
	private Season1(String seasonName, String seasonDesc) {
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
	
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}

	public void show(){
		System.out.println("这是一个季节");
	}
	
} 