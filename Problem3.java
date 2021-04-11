//Linked List Cycle-2
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
To detectCycle we follow 2 step, one to find if there is an cylce in the list. 2ndt step is to find where 
is the start of the cycle. We use two pointer approach. One is slow pointer and another is fast pointer. Fast pointer 
moves 2 steps till we find a cycle. When cycle is detected we send slw pointer to head & again traverse the list 
to check if slow and fast are not same

*/
public class Problem3 {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode res = detectCycle(head);
        while(res != null){
            System.out.print(" " +res.val);
            res = res.next;

        }

    }
    public static ListNode detectCycle(ListNode head) {
        if(head == null)
            return head;
        ListNode slow = head, fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                isCycle = true;
                break;
            }
            
        }
        //cycle found
        if(isCycle == false)
            return null;
        ///travserse the list normally
        slow = head;
        // System.out.println(slow.val);
        while(slow != fast && fast.next != null && slow.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        
    }
}
