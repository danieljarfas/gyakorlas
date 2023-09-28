package rectangle;

public class negyzet {

    private double a, b;

    public negyzet(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public negyzet() {
        this(0, 0);
    }

    public String toString() {
        return "A: " + this.getA() + " B: " + this.getB() + ", Terulet: " + this.terulet() + ", Kerulet: " + this.kerulet()
                + ", a test egy: " + (this.isNegyzet() ? "negyzet" : "teglalap");
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) { //nincs visszateresi erteke4!
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double kerulet() {
        return (2 * this.getA()) + (2 * this.getB());

    }

    public double terulet() {
        return this.getA() * this.getB();
    }

    public double nagyobbTerulet(negyzet b) {
        return this.terulet() > b.terulet() ? this.terulet() : b.terulet(); // ?=eldontendo :=ez vagy ez /elso vagy masodik/
    }

    public boolean isNegyzet() {
        return this.a == this.b ? true : false;
    }

}
