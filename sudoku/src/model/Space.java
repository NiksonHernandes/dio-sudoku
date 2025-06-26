package model;

public class Space {

    private Integer actual; //Valor atual digitado pelo usuário
    private final int expected; //Valor esperado para aquele espaço
    private final boolean fixed; //Informo se o espaço pode ser editado ou não (Vazio ou ocupado)

    public Space(int expected, boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;
        if (fixed) {
            actual = expected;
        }
    }

    public void setActual(final Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    public void clearSpace() {
        setActual(null);
    }

    public Integer getActual() {
        return actual;
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }
}
