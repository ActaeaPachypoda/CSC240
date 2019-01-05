public class ArrayTest{
    public static void main(String args[]){
        MyArray a = new MyArray();
        a.add(1);
        System.out.println(a.add(2, 2));
        System.out.println(a.add(1, 3));
        System.out.println(a.add(0, 4));
        System.out.println(a);
        a.remove();
        a.addFirst(5);
        System.out.println(a.element(0));
        a.set(1, 0);
        System.out.println(a.indexOf(3));
        System.out.println(a.size());
        System.out.println(a);

        a.clear();
        System.out.println(a);
        a.remove();
        System.out.println(a.element(0));
        System.out.println(a.add(1, 0));
        a.set(1, 0);
        System.out.println(a.indexOf(0));
        System.out.println(a.size());

    }
}
