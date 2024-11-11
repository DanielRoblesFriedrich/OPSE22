package fabrikMethode;

public class ConcreteCreatorCsv extends Creator {

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductCsv();
	}

}
