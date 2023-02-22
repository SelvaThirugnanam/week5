package methodOverloading;

public class Students
{
	


		public void getStudentInfo(int id)
		{
			System.out.println("Student id is "+id);
		}
		public void getStudentInfo(int id, String name)
		{
			System.out.println("Student id is "+id+" and name is "+name);
		}
		public void getStudentInfo(int id, String name, String email, long phoneNumber) 
		{
			System.out.println("Student id is "+id+" and name is "+name+" and email is "+email+" and phone number is "+phoneNumber);
		}
		public static void main(String[]args) 
		{
			Students std=new Students();
			std.getStudentInfo(2017111080);
			std.getStudentInfo(2017111080,"Selvendran");
			std.getStudentInfo(2017111080, "Selvendran", "selva1305@gmail.com", 9345668614l);

		}


}


