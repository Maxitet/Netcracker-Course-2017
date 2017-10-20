public class demo {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(-1, -3);
        MyComplex complex2 = new MyComplex(3,2);

        System.out.println(complex1);

        System.out.println("Действительная часть числа: " + complex1.getReal());

        System.out.println("Мнимая часть числа: " + complex1.getImag());

        System.out.println("Модуль: " + complex1.magnitude());

        System.out.println("Аргумент: " + complex1.argument() + " радиан");

        System.out.println("Сложение complex1 и complex2: " + complex1.add(complex2));

        System.out.println("Вычитание: " + complex1.substract(complex2));

        System.out.println("Умножение: " + complex1.multiply(complex2));

        System.out.println("Деление: " + complex1.divide(complex2));

        System.out.println("Сопряжённое complex1: " + complex1.conjugate());


    }
}
