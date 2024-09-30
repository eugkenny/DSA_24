public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < 8; i++) {
            l.insert(i, (int) (Math.random() * 100));
            System.out.println(l + " : " + l.size());
        }

        l.insert((int)(Math.random() * l.size()), (int) (Math.random() * 100));
        System.out.println(l + " : " + l.size());

        l.insert((int)(Math.random() * l.size()), (int) (Math.random() * 100));
        System.out.println(l + " : " + l.size());

        l.remove(1);
        System.out.println(l + " : " + l.size());
    }
}
