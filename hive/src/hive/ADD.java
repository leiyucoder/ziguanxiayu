package hive;

public class ADD extends UDF{
	public Intager evaluate(Integer... a) {///...��ʾ�����ǿɱ��
		int total=0;
		for(int i=1;i<a.length;i++) {
			total+=a[i];
		}
		return total;
		
		
	}
	public Double evaluate(Double... a) {///...��ʾ�����ǿɱ��
		int total=0;
		for(int i=1;i<a.length;i++) {
			total+=a[i];
		}
		return total;
		
		
	}
	public static void main(String[] args) {
		ADD ad=new ADD();
		System.out.println(ad(4,2,5,3,2,2,3));
		
	}

}
