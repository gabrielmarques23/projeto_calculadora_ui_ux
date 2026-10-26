package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        verifica("2 + 3", 5, c.calc(2, 3, "+"));
        verifica("7 - 4", 3, c.calc(7, 4, "-"));
        verifica("6 * 5", 30, c.calc(6, 5, "*"));
        verifica("8 / 2", 4, c.calc(8, 2, "/"));

        try {
            c.calc(10, 0, "/");
            System.out.println("10 / 0 -> FALHOU (não lançou exceção)");
        } catch (ArithmeticException e) {
            System.out.println(
                    "10 / 0 -> PASSOU | esperado: ArithmeticException | obtido: " + e.getClass().getSimpleName());
        }

        try {
            c.calc(10, 2, "%");
            System.out.println("10 % 2 -> FALHOU (não lançou exceção)");
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "10 % 2 -> PASSOU | esperado: IllegalArgumentException | obtido: " + e.getClass().getSimpleName());
        }
    }

    static void verifica(String conta, int esperado, int obtido) {
        String status = (esperado == obtido) ? "PASSOU" : "FALHOU";
        System.out.println(conta + " -> " + status + " | esperado: " + esperado + " | obtido: " + obtido);
    }
}
