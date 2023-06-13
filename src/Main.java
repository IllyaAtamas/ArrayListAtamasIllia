public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("el1");
        list.add("el2");
        list.add("el3");
        System.out.println("Size: " + list.size());
        System.out.println("Elements:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(1);
        System.out.println("Size after removal: " + list.size());
        System.out.println("Elements after removal:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println("Size after clear: " + list.size());
    }
}