package fabrikMethode;

public class ConcreteCreatorB extends Creator{

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductTxt();
	}

}