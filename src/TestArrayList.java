public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> l = new SinglyLinkedList<>();

        int value, index;
        for(int i = 0; i < 8; i++) {
            value = (int) (Math.random() * 100);
            l.insert(i, value);
            System.out.println(l + " : " + l.size() + " : inserted " + value + " at index " + i);
        }

        index = (int)(Math.random() * l.size());
        value = (int) (Math.random() * 100);
        l.insert(index, value);
        System.out.println(l + " : " + l.size() + " : inserted " + value + " at index " + index);

        index = (int)(Math.random() * l.size());
        value = (int) (Math.random() * 100);
        l.insert(index, value);
        System.out.println(l + " : " + l.size() + " : inserted " + value + " at index " + index);

        l.remove(1);
        System.out.println(l + " : " + l.size());
    }
}
