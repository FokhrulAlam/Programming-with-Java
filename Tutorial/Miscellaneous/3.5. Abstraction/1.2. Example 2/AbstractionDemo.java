package miscellaneous.tutorial.programmingWithJava;


public class AbstractionDemo {
	public static void main(String[] args) {
		SamsungConfig obj = new SamsungConfig();
		IphoneConfig obj1 = new IphoneConfig();
		show(obj);
		show(obj1);
		
	}
	public static void show(Phone obj) {
		obj.showConfig();
	}
}

abstract class Phone{
	public abstract void showConfig();
}

class SamsungConfig extends Phone{
	public void showConfig() {
		System.out.println("2 gb, Lolipop");
	}
}

class IphoneConfig extends Phone{
	public void showConfig() {
		System.out.println("2 gb, IOS 9.3");
	}
}
