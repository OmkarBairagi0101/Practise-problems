import java.util.*;


//Question :
// Sort an array using recursion
public class SortUsingRecursion {

    public static void sort(List<Integer> list){
        if(list.size() == 1 || list.isEmpty()){
            return;
        }

        int last = list.get(list.size()-1);
        list.remove(list.size()-1);
        sort(list);
        insertLast(list, last);
    }

    public static void insertLast(List<Integer> list, int last){
        if(list.isEmpty() || list.get(list.size()-1) <= last){
            list.add(last);
            return;
        }

        int last1 = list.get(list.size()-1);
        list.remove(list.size()-1);
        insertLast(list, last);
        insertLast(list, last1);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 5, 2, -1, -10, -3, -4, -11, -2));

        sort(list);
        System.out.println("Sorted List : " + list);

    }
}
