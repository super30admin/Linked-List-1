/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Idea
 * 1. Use slow and fast pointers to check for a loop
 * 2. Move slow pointer to start and start again moving both pointers one place at a time. 
 * 3. They meet at the loop end point
 * 
 * Leetcode: yes 
 * 
 */


class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

            
        }
                
        return null;
    }
    public static void main(String[] args){
        System.out.println("LinkedListCycle");
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(4);
        head.next.next.next = head.next;

        LinkedListCycle obj = new LinkedListCycle();
        System.out.println(obj.detectCycle(head).val);
    }
}