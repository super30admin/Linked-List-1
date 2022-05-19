package LINKED;

public class Common {
    protected static void print(ListNode node){
        while(node != null){
            System.out.print(node.val +" -> ");
            node = node.next;
        }
        System.out.println();
        return;
    }
    protected static int len(ListNode node){
        int len = 0;
        while(node != null){
            len++;
            node = node.next;
        }
        return len;
    }
}
