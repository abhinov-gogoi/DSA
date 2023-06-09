package DataStructures.list;

public class Main {
    public static void main(String[] args) {

        DSxArrayList<String> arrayList = new DSxArrayList<>(1);

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        System.out.println(arrayList.size());

        System.out.println(arrayList);
    }


}
