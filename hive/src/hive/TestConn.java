package hive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConn {
	  public static String driverName="org.apache.hive.jdbc.HiveDriver";
	  public static String url="jdbc:hive2://192.168.217.200:10000/default";
	  public static String userName="root";
	  public static String password="123456";
	  
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName(driverName);
		//JVM���Ҳ�����ָ������
		Connection conn=DriverManager.getConnection(url, userName,password);
		//���ص���Connection�ӿڵ�һ��ʵ��������
		Statement stmt=conn.createStatement();
		//Statement��JAVAִ�����ݿ����ӵ�һ���ӿڣ����������ݿⷢ��SQL
		System.out.println(stmt);
		
		String tableName="emp";
		String sql="select name,salary from"+tableName;
		stmt.executeQuery(sql);

	}

}
