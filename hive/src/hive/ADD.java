package hive;

public class ADD extends UDF{
	public Intager evaluate(Integer... a) {///...表示参数是可变的
		int total=0;
		for(int i=1;i<a.length;i++) {
			total+=a[i];
		}
		return total;
		
		
	}
	public Double evaluate(Double... a) {///...表示参数是可变的
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
