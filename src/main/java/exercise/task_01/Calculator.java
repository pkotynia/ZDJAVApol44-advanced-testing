package exercise.task_01;

/**
 * Stwórz klasę Calculator implementującą operacje:
 *
 * dodawanie,
 * odejmowanie,
 * mnożenie,
 * dzielenie.
 *
 * Następnie dla każdej operacji wykonaj przynajmniej 3 przypadkitestowe (3 zestawyparametrów).
 *
 */

public class Calculator {

    public int add(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0.0) {
            throw new IllegalArgumentException("divisor should be 0.0");
        }
        return dividend/divisor;
    }
}
