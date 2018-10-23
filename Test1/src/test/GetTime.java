package test;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GetTime {

	public static void main(String[] args) {
	    Calendar cal = Calendar.getInstance();
        //���ȡ�õ������ա�Сʱ������
	    System.out.println("Calendar_cal:"+cal);
		System.out.println("Calendar_year:"+cal.get(Calendar.YEAR));
		System.out.println("Calendar_month:"+cal.get(Calendar.MONTH));//0��11
		System.out.println("Calendar_date:"+cal.get(Calendar.DATE));
		System.out.println("Calendar_hour:"+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("Calendar_minute:"+cal.get(Calendar.MINUTE));
		System.out.println("Calendar_second:"+cal.get(Calendar.SECOND));
		
		//java 8
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println("LocalDateTime_localDate:"+localDate);
		System.out.println("LocalDateTime_year:"+localDate.getYear());
		System.out.println("LocalDateTime_month:"+localDate.getMonth());//Ӣ�ģ�may
		System.out.println("LocalDateTime_month:"+localDate.getMonthValue());//1��12
		System.out.println("LocalDateTime_date:"+localDate.getDayOfMonth());
		System.out.println("LocalDateTime_hour:"+localDate.getHour());
		System.out.println("LocalDateTime_minute:"+localDate.getMinute());
		System.out.println("LocalDateTime_second:"+localDate.getSecond());
		
		//���ȡ�ô�1970��1��1��0ʱ0��0�뵽���ڵĺ�������
		System.out.println("Calendar_TimeInMillis:"+Calendar.getInstance().getTimeInMillis());
		System.out.println("System_TimeInMillis:"+System.currentTimeMillis());
		System.out.println("Clock_TimeInMillis:"+Clock.systemDefaultZone().millis());
	
		//���ȡ��ĳ�µ����һ�죿
		Calendar cal1 = Calendar.getInstance();
		System.out.println("��ȡĳ�µ����һ�죺"+cal1.getActualMaximum(Calendar.DAY_OF_MONTH));
	
		//��θ�ʽ�����ڣ�
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date1 = new Date();
		System.out.println("SimpleDateFormat_date1:"+dateFormat.format(date1));
		//java 8
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println("SimpleDateFormat_date2:"+date2.format(timeFormat));
		
		//��ӡ����ĵ�ǰʱ�̡�
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DATE, -1);
		System.out.println("��ӡ����ĵ�ǰʱ��:"+dateFormat.format(cal2.getTime()));
		//java 8
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime yesterday = today.minusDays(1);
		System.out.println("��ӡ����ĵ�ǰʱ��:"+yesterday);
		System.out.println("��ӡ����ĵ�ǰʱ��:"+yesterday.format(timeFormat));
	}
}
