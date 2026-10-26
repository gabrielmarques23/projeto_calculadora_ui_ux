package calculadora;

/**
 * Testes funcionais da classe {@link Calculadora}.
 *
 * <p>Executa os casos de soma, subtração, multiplicação, divisão,
 * divisão por zero e operador inválido, exibindo a entrada, o resultado
 * esperado e o resultado obtido.</p>
 *
 * @author Gabriel Marques
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Executa todos os casos de teste e imprime o resultado no console.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        // Casos de sucesso das quatro operações básicas
        verifica("2 + 3", 5, c.calc(2, 3, "+"));
        verifica("7 - 4", 3, c.calc(7, 4, "-"));
        verifica("6 * 5", 30, c.calc(6, 5, "*"));
        verifica("8 / 2", 4, c.calc(8, 2, "/"));

        // Divisão por zero: deve lançar ArithmeticException
        try {
            c.calc(10, 0, "/");
            System.out.println("10 / 0 -> FALHOU (não lançou exceção)");
        } catch (ArithmeticException e) {
            System.out.println(
                    "10 / 0 -> PASSOU | esperado: ArithmeticException | obtido: " + e.getClass().getSimpleName());
        }

        // Operador inválido: deve lançar IllegalArgumentException
        try {
            c.calc(10, 2, "%");
            System.out.println("10 % 2 -> FALHOU (não lançou exceção)");
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "10 % 2 -> PASSOU | esperado: IllegalArgumentException | obtido: " + e.getClass().getSimpleName());
        }
    }

    /**
     * Compara o resultado esperado com o obtido e imprime o status do teste.
     *
     * @param conta    descrição da operação testada
     * @param esperado resultado esperado
     * @param obtido   resultado obtido
     */
    static void verifica(String conta, int esperado, int obtido) {
        String status = (esperado == obtido) ? "PASSOU" : "FALHOU";
        System.out.println(conta + " -> " + status + " | esperado: " + esperado + " | obtido: " + obtido);
    }
}
