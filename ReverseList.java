//Iterative
//TC: O(N) - N nodes in the list
//SC: O(1) 

//Recursive
//TC: O(N)
//SC: O(N)

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class ReverseList{

    //Iterative
    public static ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode next, prev = null;
        
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        return prev;
    }

    //Recursive
    static ListNode p;
    public static ListNode reverseListRecursive(ListNode head) {
        helper(head);
        return p;
    }
    
    private static void helper(ListNode cur){
        
        if(cur == null) return;
        
        if(cur.next == null) {
            p = cur;
            return;
        }
        
        helper(cur.next);
        cur.next.next = cur;
        cur.next = null;

    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode newhead = reverseList(head);
        while(newhead != null){
            System.out.print(newhead.val + "-> ");
            newhead = newhead.next;
        }

        //Recursion
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);

        ListNode newhead2 = reverseListRecursive(head2);
        while(newhead2 != null){
            System.out.print(newhead2.val + "-> ");
            newhead2 = newhead2.next;
        }

    }

}