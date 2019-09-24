package hive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Xinzuo extends UDF{
	public String evaluate(String date) throws ParseException{
		//SimpleDateFormat用于对日期字符串进行解析和格式化输出
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		Date da=fmt.parse(date);
		
		String[] xz= {"水瓶座","双鱼座","白羊座","金牛座","双子座","巨蟹座",
				"狮子座","处女座","天枰座","天蝎座","射手座","摩羯座"};
		int[] d= {20,19,21,20,21,22,23,23,23,24,23,22};
		
		//Calendar用于对日期进行操作
		Calendar cal=Calendar.getInstance();
		cal.setTime(da);
		//获取月份--MONTH返回比正常输出月份小一
		int month=cal.get(Calendar.MONTH);//4
		System.out.println(month);
		//获取这个月的第几天
		int day=cal.get(Calendar.DAY_OF_MONTH);//12
		
		if (day<d[month]) {
			month=month-1;
		}
		if(month>=0) {
			return xz[month];}
		return xz[11];
	}
	
	public static void main(String[] args) throws ParseException {
		Xinzuo xz=new Xinzuo();
		System.out.println(xz.evaluate("1999-10-29"));
	}

}
