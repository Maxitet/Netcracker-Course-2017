public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
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

    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }

    public boolean isReal() {
        return real != 0;
    }

    public boolean isImaginary() {
        return imag != 0;
    }

    public boolean equals(double real, double imag) {

        return (this.real == real) && (this.imag == imag);
    }

    public boolean equals(MyComplex m) {
        return (this.real == m.real) && (this.imag == m.imag);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag/real);
    }

    public MyComplex add(MyComplex m) {
        this.real += m.real;
        this.imag += m.imag;
        return this;
    }

    public MyComplex addNew(MyComplex m) {
        MyComplex newComplex = new MyComplex(this.real + m.real, this.imag + m.imag);
        return newComplex;
    }

    public MyComplex substract(MyComplex m) {
        this.real -= m.real;
        this.imag -= m.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex m) {
        MyComplex newComplex = new MyComplex(this.real - m.real, this.imag - m.imag);
        return newComplex;
    }

    public MyComplex multiply(MyComplex m) {
        this.real = (this.real * m.real) - (this.imag * m.imag);
        this.imag = (this.real * m.imag) + (m.real * this.imag);
        return this;
    }

    public MyComplex divide(MyComplex m) {
        this.real = ((this.real * m.real) + (this.imag * m.imag)) / (Math.pow(m.real,2) + Math.pow(m.imag,2));
        this.imag = ((m.real * this.imag) - (this.real * m.imag)) / (Math.pow(m.real,2) + Math.pow(m.imag,2));
        return this;
    }

    public MyComplex conjugate() {
        MyComplex newComplex = new MyComplex(this.real, -this.imag);
        return newComplex;
    }
}

