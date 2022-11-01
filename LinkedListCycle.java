//TC:O(n)
//SC:O(1)
//works in leetcode
//use two pointers slow,fast to determine cycle if both pointer meet.
//use x,y pointer to determine start of cycle

public class LinkedListCycle {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){// LinkedList has cycle
                break;
            }
        }
        if(fast == null || fast.next==null)
            return null;

        ListNode x = head;
        ListNode y = slow;

        while(x!=y){           //when x==y, that is the meeting point of beginning of cycle
            x = x.next;
            y = y.next;
        }

        return x;

    }

    public static void main(String [] args){

        ListNode node1 = new ListNode(-4, null);
        ListNode node2 = new ListNode(0,node1);
        ListNode node3 = new ListNode(2,node2);
        ListNode head = new ListNode(3,node3);

        node1.next =node3;

        ListNode begin = detectCycle(head);

        System.out.println(begin.val);

    }
}












