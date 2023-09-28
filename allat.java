package rectangle;

class allat {

    private final int kor;
    private final String nev;
    private final boolean ferfi;

    public allat(int kor, String nev, boolean ferfi) { // konstruktor :), ez egy metódus, ami egy objektumot hoz létre az alábbiak alapján ! ! !
        this.kor = kor;
        this.nev = nev;
        this.ferfi = ferfi;
    }

    public String toString() {
        return "Az allat " + this.kor + " eves, " + nev + "-nek hivjak, s " + (ferfi ? "ferfi" : "no");
    }

}
