//TC: O(N)
//SC: O(1)

//We use Floyd's Tortoise and Hare
//Two pointers slow and fast are traversed, until they meet. They meet if there is a cycle.
//The entrace to cycle is determined by initialising one ptr to head and other to meeting point. 
//both are traversed. The node at which they meet is the entry point.

public class LinkedListCycle {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return fast;
            }  
        }
        return null;
        
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;

        ListNode newhead = detectCycle(head);
        System.out.print(newhead.val + "-> ");
    }     
}
