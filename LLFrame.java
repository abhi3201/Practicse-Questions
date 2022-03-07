import java.util.*;
class LLFrame {
    public static void main(String args[]) {
        LinkedList<String>list=new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("this");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i< list.size();i++){
           // if(list.get(i)==value) for searching thr value
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("NULL");
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }

}
