import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //деление на ноль
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //int c = calc.devide.apply(a, b);

        //самое простое выбросить ошибку если b==0 или обработать ее

        // данный способ подглядел у ИИ,
        // самостоятельно догадаться до создания еще одного предиката и
        // его применении очень сложно,
        // зато printlnStr придумал сам :)

        if (calc.isNotZero.test(b)) {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } else {
            calc.printlnStr.accept("Ошибка: деление на ноль!");
        }

        int d = calc.multiply.apply(4, 6);
        calc.println.accept(d);

        int e = calc.pow.apply(5);
        calc.println.accept(e);

        int g = -1;
        if (calc.isPositive.test(g)) {
            calc.printlnStr.accept("Yes");
        } else {
            calc.printlnStr.accept("No");
        }

        int h = calc.abs.apply(g);
        if (calc.isPositive.test(h)) {
            calc.printlnStr.accept("Yes");
        } else {
            calc.printlnStr.accept("No");
        }

    }
}
