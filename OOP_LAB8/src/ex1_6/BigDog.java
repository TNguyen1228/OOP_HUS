package ex1_6;

public class BigDog extends Dog {

	public BigDog(String name) {
		super(name);
	}

	@Override

	public void greeting() {
		System.out.println("Woow!");
	}

	@Override
	public void greeting(Dog another) {
		System.out.println("Woooooowwwww!");
	}

	public void greeting(BigDog another) {
		System.out.println("Wooooooooooowwwww!");
	}
}
