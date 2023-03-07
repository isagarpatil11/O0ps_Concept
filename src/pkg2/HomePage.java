package pkg2;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User K = new User();
		K.setuserName("Ganesh");
		System.out.println(K.getuserName());
		
		K.setphoneNumber("8999891971");
		System.out.println(K.getphoneNumber());
	
		K.setemailId("sagarpatil278@gmail.com");
		System.out.println(K.getemailId());
		
		K.setaddress("Nakane Road");
		System.out.println(K.getaddress());
		
		K.setcity("Dhule");
		System.out.println(K.getcity());
		
	}

}
