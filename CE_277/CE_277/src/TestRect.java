public class TestRect {
    public static void main(String[] args) {
        RectangleMeth rec1 = new RectangleMeth();
        RectangleMeth rec2 = new RectangleMeth(2,5,3);

        rectangular r =new rectangular(2,5,3);

        System.out.println(rec2.sideLeftArea());
        System.out.println(rec2.topSideArea());
        System.out.println(rec2.findVolume());

        System.out.println(rec2.length());

        System.out.println(r.volume());
    }
}
