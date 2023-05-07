package week3.day1assignments;

public class Students {
	public void getStudentInfo(int stuID) {
		System.out.println(stuID);
	}
	
	public void getStudentInfo(int stuID, String Name) {
	System.out.println(stuID + Name);
	}
	
	public void getStudentInfo(String email, long a) {
		System.out.println(email + a);
	}
	

	public static void main(String[] args) {
		Students info=new Students();
		info.getStudentInfo(25);
		info.getStudentInfo(25,"Ramya");
		info.getStudentInfo("ramyareddy_15@yahoo.com",9003847041L);
	}
}
