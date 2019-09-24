package hive;

import org.apache.hadoop.hive.q1.exec.UDF;

public class Hello extends UDF{
	public static String evaluate(String a) {
		return "hello, "+a;
		
	}

}
