public class Demo {
    public static void main(String[] args) {
        MyPolynomial polynom1 = new MyPolynomial(3.1, 2, 3, 8.3);
        MyPolynomial polynom2 = new MyPolynomial(2, 1, 5, 3, 6.4);

        System.out.println(polynom2);

        System.out.println(polynom1.add(polynom2));

        System.out.println("Значение полинома: " + polynom1.evaluate(2));

        System.out.println("Степень полинома: " + polynom1.getDegree());

        System.out.println("Умножение: " + polynom1.multiply(polynom2));




    }
}
