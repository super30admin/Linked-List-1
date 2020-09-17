//One pass solution
//TC: O(N) - N = no of nodes in linked list.
//SC: O(1)

//We use two pointers slow and fast to delete nth node from end.
//Initially fast is traversed such that distance between slow and fast is n.
//Then slow and fast both are traversed until fast reaches null.
//When fast is null, the node next to slow should be deleted. We change the pointers. 



public class RemoveNodefromEnd {
 
    public static ListNode remove(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;

        for(int i = 0; i <= n; i++)
            fast = fast.next;

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newhead = remove(head, 3);
        while(newhead != null){
            System.out.print(newhead.val + "-> ");
            newhead = newhead.next;
        }
    }
}
