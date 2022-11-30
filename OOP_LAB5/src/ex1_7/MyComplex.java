package ex1_7;

public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;

	public MyComplex() {
	};

	public MyComplex(double real, double imag) {
		this.imag = imag;
		this.real = real;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public String toString() {
		return "(" + real + " + " + imag + "i)";
	}

	public boolean isReal() {
		return (imag == 0);
	}

	public boolean isImaginary() {
		return (real == 0);
	}

	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}

	public boolean equals(MyComplex another) {
		return (this.real == another.getReal() && this.imag == another.getImag());
	}

	public double magnitude() {
		return Math.sqrt(real * real + imag * imag);
	}

	public double argumentInRadians() {
		return Math.atan2(imag, real);
	}

	public MyComplex add(MyComplex right) {
		real += right.getReal();
		imag += right.getImag();
		return this;
	}

	public MyComplex addNew(MyComplex right) {
		return new MyComplex(real + right.getReal(), imag + right.getImag());
	}

	public MyComplex subtract(MyComplex right) {
		real -= right.getReal();
		imag -= right.getImag();
		return this;
	}

	public MyComplex substractNew(MyComplex right) {
		return new MyComplex(real - right.getReal(), imag - right.getImag());
	}
	public MyComplex multiplyWith(MyComplex another) {
        // (ac - bd) + (ad + bc)i
        real = real*another.getReal() - imag*another.getImag();
        imag = real*another.getImag() + imag*another.getReal();
        return this;
    }

    public MyComplex divideBy(MyComplex another) {
        // [(a + bi) * (c – di)] / (c2 + d2)
        MyComplex tmp = multiplyWith(another.conjugate());
        double delimiter = another.getReal()*another.getReal() + another.getImag()*another.getImag();
        if (delimiter != 0) {
            real = tmp.getReal() / delimiter;
            imag = tmp.getImag() / delimiter;
        }
        return this;
    }
    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }

}
