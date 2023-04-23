package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="ViVo";
				float mobileWeight= 18.20f;
		System.out.println("ViVo");

	}
	public void sendMessage() {
		boolean Fullcharged=true;
		int mobileCost= 43000;
	System.out.println("Fully Charged");
	}
	
	public static void main(String[] args) {
		Mobile features=new Mobile();
		features.makeCall();
		features.sendMessage();
		System.out.println("This is my mobile");
	}
}
