package Core_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class listex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10); // 0
        list.add(39); // 1
        list.add(-98); // 2
        list.add(90); //3
        list.remove(2);

        list.add(2, 30);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.contains(90));
        System.out.println(list.indexOf(90));

        System.out.println("1) Elements :- ");
        for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));    
        }

        System.out.println("2) Elements :- ");
        for (int e : list) {
            System.out.println(e);
        }

        System.out.println("Lambda :-");
        list.forEach(e -> System.err.println(e));

        System.out.println("Enhanced :- ");
        list.forEach(System.out::println);

        System.out.println("Iterator :- ");
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class c implements Consumer<Integer> {
    public void accept (Integer t){
    System.out.println(t);
    }
}