package rectangle;

public class Rectangle {

    public static void main(String[] args) {

        /*allat kecske = new allat(13,"sertzhsertser", true);
        System.out.println(kecske);
        macska kismacska = new macska(21,"Gunther",false,64,"perzsa");
        System.out.println(kismacska);*/
        negyzet a = new negyzet();
        negyzet b = new negyzet(3, 6);
        System.out.println(a);
        a.setA(8);
        a.setB(16);
        System.out.println(a);
        System.out.println("kerulet: " + a.kerulet());
        System.out.println("terulet: " + a.terulet());
        a.nagyobbTerulet(b);
        System.out.println("A nagyobb terulet: " + a.nagyobbTerulet(b));
        System.out.println(b);

    }

}
