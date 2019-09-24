package student_op;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class student_op {
	 public static String driverName="org.apache.hive.jdbc.HiveDriver";
	  public static String url="jdbc:hive2://192.168.217.200:10000/default";
	  public static String userName="root";
	  public static String password="123456";
	  public static String sql="";
	  public static ResultSet res;
	  public static void main(String[] args) throws ClassNotFoundException, SQLException {
			// TODO Auto-generated method stub
			Class.forName(driverName);
			Connection conn=DriverManager.getConnection(url, userName,password);
			Statement stmt=conn.createStatement();
			String tableName="student1";
			String sql="create table "+tableName+"(id int,name string) row format delimited fields terminated by ',";
			stmt.execute(sql);
			//�鿴��ǰ���ݿ��е����б�
			sql="show tables";
			res=stmt.executeQuery(sql);
			while(res.next()) {
				System.out.println(res.getString(1));
			}
			//�鿴student1�����ϸ��Ϣ
			sql="desc +tableName";
			res=stmt.executeQuery(sql);
			System.out.println("fieldsname"+"\t"+"datatype");
			while(res.next()) {
				System.out.println(res.getString(1)+"\t"+res.getString(2));
			}
			//�������ݵ���student1
			sql="load data local inpath '/student.txt' into table student1";
			stmt.execute(sql);
			
			//��ѯstudent1���е���������
			sql="select * from"+tableName;
			res=stmt.executeQuery(sql);
			while(res.next()) {
				System.out.println(res.getString(1)+"\t"+res.getString(2));
				}
			//��ѯstudet1��ļ�¼������
			sql="select count(*) from "+tableName;
			res=stmt.executeQuery(sql);
			while(res.next()) {
				System.out.println(res.getInt(1));
			}
			//ɾ��student1��
			sql="drop table "+tableName;
			 
			}
}
