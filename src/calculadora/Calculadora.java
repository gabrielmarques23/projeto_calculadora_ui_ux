package calculadora;

/**
 * Calculadora responsável pelas quatro operações matemáticas básicas.
 *
 * <p>Utilizada pelo módulo financeiro para cálculos de orçamento mensal,
 * divisão de despesas e projeção de economia.</p>
 *
 * @author Gabriel Marques
 * @version 1.0
 */
public class Calculadora {

    /**
     * Executa uma operação matemática entre dois números inteiros.
     *
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operador operação desejada: {@code "+"}, {@code "-"}, {@code "*"} ou {@code "/"}
     * @return resultado da operação
     * @throws ArithmeticException      se {@code b} for zero em uma divisão
     * @throws IllegalArgumentException se o operador informado não existir
     */
    public int calc(int a, int b, String operador) {
        switch (operador) {
            case "+":
                // Soma
                return a + b;
            case "-":
                // Subtração
                return a - b;
            case "*":
                // Multiplicação
                return a * b;
            case "/":
                // Impede divisão por zero, que interromperia a execução do programa
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                return a / b;
            default:
                // Operador fora das quatro operações suportadas
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
