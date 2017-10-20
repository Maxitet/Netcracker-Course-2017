import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    MyPolynomial(){

    }

    MyPolynomial(double ... coeffs) {
        this.coeffs = coeffs.clone();
    }

    int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        String response = new String();
        for(int i = coeffs.length-1; i > 0; i--) {
            response += coeffs[i] + "x^" + i + " + ";
        }
        response += coeffs[0];
        return response;
    }

    public MyPolynomial add(MyPolynomial secondPolynom) {
        //MyPolynomial newPolynom = null;


        double[] newCoeffs = new double[0];
        if (this.coeffs.length >= secondPolynom.coeffs.length) {
            //newPolynom = new MyPolynomial(this.coeffs);

            for (int i = 0; i < secondPolynom.coeffs.length; i++) {
                //newPolynom.coeffs[i] += secondPolynom.coeffs[i];
            }
        } else {
            newCoeffs = secondPolynom.coeffs.clone();
            //newPolynom = new MyPolynomial(secondPolynom.coeffs);
            for (int i = 0; i < this.coeffs.length; i++) {
                //newPolynom.coeffs[i] += this.coeffs[i];
                newCoeffs[i] += this.coeffs[i];
            }
        }

        return (new MyPolynomial(newCoeffs));
    }

    public MyPolynomial multiply(MyPolynomial secondPolynom) {
        MyPolynomial newPolynom = null;

        if(this.coeffs.length >= secondPolynom.coeffs.length) {
            newPolynom = new MyPolynomial(this.coeffs);
            for(int i=0; i < secondPolynom.coeffs.length; i++) {
                newPolynom.coeffs[i] *= secondPolynom.coeffs[i];
                System.out.println(newPolynom.coeffs[i]);
            }
        }

        if(this.coeffs.length < secondPolynom.coeffs.length) {
            newPolynom = new MyPolynomial(secondPolynom.coeffs);
            for(int i=0; i < this.coeffs.length; i++) {
                newPolynom.coeffs[i] *= this.coeffs[i];
            }
        }
        return newPolynom;
    }

    public double evaluate(double x) {
        for(int i = coeffs.length-1; i > 0; i--) {
            x += Math.pow(coeffs[i], i);
        }
        x += coeffs[0];
        return x;
    }

}
