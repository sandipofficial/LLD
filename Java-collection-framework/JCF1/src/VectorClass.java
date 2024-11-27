import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();
//        List<Integer> list = new ArrayList<>();
        Collection<Integer> coll = new Vector<>();
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
//        list.addAll(2, coll);
//        System.out.println(list);

        //get
//        System.out.println(list.get(2));

        //iterator() --> pending
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        //set
        list.set(0,90);
        System.out.println(list);

        //remove
//        list.remove(2);
        System.out.println(list);

        //removeAll
        System.out.println("RemoveAll");
//        list.removeAll();
        System.out.println(list);
        System.out.println(coll);

        //clear
        list.clear();
        System.out.println(list);

        //size
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        coll.toArray();

        //contains
        System.out.println(list.contains(20));

        //toArray
//        Object[] arr = list.toArray();
//        for(Object obj: arr){
//            System.out.print(obj+ " ");
//        }

        //ArrayList
        //sort
        System.out.println("before sorting"+list);
        Collections.sort(list);
        System.out.println("after sorting"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("sorting in reverse order"+list);

        //clone
//        List<Integer> newList = (ArrayList<Integer>) list.clone();
//        System.out.println("new list"+newList);

        //ensureCapacity
        List<Integer> marks = new java.util.Vector<>();
//        marks.ensureCapacity(100);
        //isEmpty
        System.out.println(marks.isEmpty());

        //indexOf --> if two values are same then it will return index of first value
        list.add(40);
        list.add(40);
        System.out.println(list);
        System.out.println(list.indexOf(40));
        System.out.println(list.lastIndexOf(40));

        list.addFirst(30);
        list.addLast(50);
        System.out.println(list);
        //peek
//        System.out.println(((java.util.Vector<Integer>) list).peek());
//        System.out.println(((java.util.Vector<Integer>) list).poll());
//        System.out.println(list);
//
//        ((java.util.Vector<Integer>) list).offer(70);
//        System.out.println(list);
    }
}
