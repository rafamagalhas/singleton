package singleton;

public class CarFactory {
	protected int totalCarsFiat;
    protected int totalCarsFord;
    protected int totalCarsVolks;
	public static CarFactory instance;
	
	
	protected CarFactory() {
		
	}
	
	public static CarFactory getInstance() {
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}
 
    public String createCarVolks() {
        return new String("Car Volks #" + totalCarsVolks++ + " created.");
    }
 
    public String createCarFord() {
        return new String("Carro Ford #" + totalCarsFord++ + " created.");
    }
 
    public String createCarFiat() {
        return new String("Carro Fiat #" + totalCarsFiat++ + " created.");
    }
 
    public String reportGenerate() {
        return new String("Total de carros Fiat vendidos: " + totalCarsFiat
                + "\nTotal de carros Ford vendidos: " + totalCarsFord
                + "\nTotal de carros Volks vendidos: " + totalCarsVolks);
    }
 
}
