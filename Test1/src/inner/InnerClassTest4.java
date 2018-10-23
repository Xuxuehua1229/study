package inner;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.enterprise.inject.New;

public class InnerClassTest4 {
    
	class Contents{
		String name;
		int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
    public Contents count(){
    	return new Contents(){
            private int i = 11;
            public int value(){
            	return i;
            }
    	};
    }
	public static void main(String[] args) {
       InnerClassTest4 innerClassTest4 = new InnerClassTest4();
       Contents c = innerClassTest4.count();
       
       
       System.out.println(System.currentTimeMillis());
       java.util.Date date = new java.util.Date();
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
       System.out.println(dateFormat.format(System.currentTimeMillis()));
       System.out.println(dateFormat.format(date));
    		   
	}

}
