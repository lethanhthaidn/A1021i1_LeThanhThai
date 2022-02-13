package ss10_DSA_List.bai_tap;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1, 10);
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("index i: " + arrayList.indexOf(2));
    }
}


