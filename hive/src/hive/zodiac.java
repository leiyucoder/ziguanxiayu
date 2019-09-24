package hive;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


import org.apache.hadoop.hive.ql.exec.UDF;

public class zodiac extends UDF{
	
	SimpleDateFormat fmt=new SimpleDateFormat("yyyy");
	Date da=fmt.parse(date);
	
	String[] sx={"∫Ô","º¶","π∑","÷Ì"," Û","≈£","ª¢","Õ√","¡˙","…ﬂ","¬Ì","—Ú"};
	Calendar cal=Calendar.getInstance();
	cal.setTime(da);
	int year=cal.get(Calendar.YEAR);
	return sx[year%12];

}
}
