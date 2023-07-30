import com.cg.dayfive.encapsulation.Encapsule;

module MyProject {
	public class MainClass  {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encapsule obj=new Encapsule();
			obj.setName("Nithia");
			obj.setId(169);
			obj.setMailId("nithialakshmi@gmail.com");
			obj.setMobile(1234567891);
			System.out.println(obj.toString());

		}

	}
	
	
}