import java.lang.Math;

public class Delta extends Equacao {
    private double delta;

    // #region metodos acessores
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    // #endregion

    public void calculaDelta() {
        delta = Math.pow(super.getB(), 2) - (4 * super.getA() * getC());
    }
}
