package rectangle;

public class macska extends allat {

    //oroklodes
    private final int testhossz;
    private final String faj;

    public macska(int kor, String nev, boolean ferfi, int testhossz, String faj) { // konstruktor :), ez egy metódus, ami egy objektumot hoz létre az alábbiak alapján ! ! !
        super(kor, nev, ferfi);
        this.testhossz = testhossz;
        this.faj = faj;
    }
}
