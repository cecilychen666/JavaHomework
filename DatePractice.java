import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
		
		long l = 10000;  //记录最新的流逝时间
		Date date = new Date(l);
		printDate(l, date);
		l *= 10;
		
		for(int i = 0; i < 7; i++) {  //通过循环设置新的流逝时间并显示日期
			date.setTime(l);
			printDate(l, date);
			l *= 10;
		}
		
	}
	
	public static void printDate(long l, Date date) {
		
		System.out.println(l + ": " + date.toString());  //用tostring()显示日期
		
	}

}