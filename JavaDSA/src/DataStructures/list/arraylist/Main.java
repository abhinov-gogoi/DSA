package DataStructures.list.arraylist;

public class Main {
    public static void main(String[] args) {

        DSxArrayList<String> arrayList = new DSxArrayList<>(1);


        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        arrayList.get(2);

        System.out.println(arrayList.size());

        System.out.println(arrayList);
    }


}
