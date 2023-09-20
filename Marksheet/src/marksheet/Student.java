package marksheet;

public class Student{
	Integer sNo;
	String name;
	Integer sub1;
	Integer sub2;
	Integer sub3;
	Integer sub4;
	Integer sub5;
	Double total;
	public Student(int sNo,String name,int sub1,int sub2,int sub3,int sub4,int sub5){
		this.sNo = sNo;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.total = (double)sub1 + (double)sub2 + (double)sub3 + (double)sub4 + (double)sub5;
		
	}
}
