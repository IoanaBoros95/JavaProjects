package lab14;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        //1
        List<String> list1 = new ArrayList<>();
        list1.add("For");
        list1.add("My");
        list1.add("List");
        op.printList(list1);

        //2
        List<Integer> myList = new ArrayList<>();
        op.addValueToList(myList, 3);
        System.out.println(myList);

        //3
        List<String> list = new ArrayList<>();
        list.add("For");
        list.add("My");
        list.add("List");
        op.printListFromIndex(list, 0);

        //4
        List<String> list2 = new ArrayList<>();
        list2.add("For");
        list2.add("My");
        list2.add("List");
        op.printDescendingList(list2);

        //5
        op.addStringToList(list2,1,"Ioana");
        System.out.println(list2);

        //6
        op.addParameterToFirstPosition(list,"Maria");
        System.out.println(list);

        //7
        op.printValueAndIndex(list2);

        //8
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(5);
        list3.add(10);
        list3.add(2);
        System.out.println(op.getHighestNumber(list3));

        //Optional
        //1
        op.changePosition(list);
        System.out.println(list);

        //2
        System.out.println(op.getEvenList(list3));

        //3
        System.out.println(op.getSortedList(list3));
    }
}
