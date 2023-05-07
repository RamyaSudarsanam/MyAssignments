package week3.day1;

public class Automation extends MultipleLanguage {

	public void Java() {
		System.out.println("Java Language");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Language");
		
	}

	public void Selenium() {
		System.out.println("Testing with Selenium WebDriver");
		
	}

public static void main(String[] args) {
	Automation obj=new Automation();
	obj.Java();
	obj.python();
	obj.ruby();
	obj.Selenium();

}
}