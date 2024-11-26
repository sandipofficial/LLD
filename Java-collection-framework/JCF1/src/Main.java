import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // List or Collection --> Interface

        //ArrayList --> concrete class
        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
        Collection<Integer> coll = new ArrayList<>();
        coll.add(30);
        coll.add(40);
        coll.add(50);
        coll.add(60);
        coll.add(70);
        //add
        list.add(10);
        list.add(20);
//        System.out.println(list);

        //addAll
        list.addAll(2, coll);
//        System.out.println(list);

        //get
//        System.out.println(list.get(2));

        //iterator() --> pending
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.print(iterator.next() + " ");
//        }

        //set
        list.set(0,90);
//        System.out.println(list);

        //remove
//        list.remove(2);
//        System.out.println(list);

        //removeAll
//        System.out.println("RemoveAll");
//        list.removeAll(coll);
//        System.out.println(list);
//        System.out.println(coll);

        //clear
//        list.clear();
//        System.out.println(list);

        //size
//        System.out.println(list.size());
//        list.clear();
//        System.out.println(list.size());
//        coll.toArray();

        //contains
//        System.out.println(list.contains(20));

        //toArray
//        Object[] arr = list.toArray();
//        for(Object obj: arr){
//            System.out.print(obj+ " ");
//        }

        //ArrayList
        //sort
//        System.out.println("before sorting"+list);
//        Collections.sort(list);
//        System.out.println("after sorting"+list);
//        Collections.sort(list,Collections.reverseOrder());
//        System.out.println("sorting in reverse order"+list);

        //clone
        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println("new list"+newList);

        System.out.println("hi");


    }
}