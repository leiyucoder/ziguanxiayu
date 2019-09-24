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
		//JVM查找并加载指定的类
		Connection conn=DriverManager.getConnection(url, userName,password);
		//返回的是Connection接口的一个实例化对象
		Statement stmt=conn.createStatement();
		//Statement是JAVA执行数据库连接的一个接口，用于向数据库发送SQL
		System.out.println(stmt);
		
		String tableName="emp";
		String sql="select name,salary from"+tableName;
		stmt.executeQuery(sql);

	}

}
