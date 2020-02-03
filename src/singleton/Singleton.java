package singleton;

public class Singleton {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		System.out.println(factory.createCarFiat());
		System.out.println(factory.createCarFord());
		System.out.println(factory.createCarVolks());

		System.out.println(factory.reportGenerate());
		
		CarFactory factory2 = new CarFactory();
		System.out.println(factory2.reportGenerate());
		
		System.out.println(factory.reportGenerate());
	}

}
