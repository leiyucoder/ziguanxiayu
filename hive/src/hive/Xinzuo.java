package hive;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;

public class Xinzuo extends UDF{
	public String evaluate(String date) throws ParseException{
		//SimpleDateFormat���ڶ������ַ������н����͸�ʽ�����
		SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");
		Date da=fmt.parse(date);
		
		String[] xz= {"ˮƿ��","˫����","������","��ţ��","˫����","��з��",
				"ʨ����","��Ů��","������","��Ы��","������","Ħ����"};
		int[] d= {20,19,21,20,21,22,23,23,23,24,23,22};
		
		//Calendar���ڶ����ڽ��в���
		Calendar cal=Calendar.getInstance();
		cal.setTime(da);
		//��ȡ�·�--MONTH���ر���������·�Сһ
		int month=cal.get(Calendar.MONTH);//4
		System.out.println(month);
		//��ȡ����µĵڼ���
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
