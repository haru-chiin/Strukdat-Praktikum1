public class Segitiga<T> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt() {
        return((int)alas*(int) tinggi/2);
    }

    public double getResultAsDouble() {
        return ((double)alas*(double) tinggi/ 2);
    }
}

