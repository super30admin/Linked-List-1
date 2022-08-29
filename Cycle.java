// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Approach 1 was using HashSet but remember
//whenever you use extra memory for LL problems - it is not an optimal solution
//Here, we are usng 2 pointer aproach. First step is to detect if there is a cycle - by giving 2x speed 
//to the fast pointer and slow pointer moves in single steps. Once, the slow and fast pointer meet, cycle
//gets detected. Then, we re-initialize slow pointer to the head and the fast pointer remains and move both
//pointers by 1x speed. Now this time the point where they meet will be the answer.
//Remeber a = c (equation) of slow and fast pointer iterations

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Cycle {
    public static ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        
        if(!flag)
            return null;
        slow = head;
        while(slow != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        ListNode result = detectCycle(head);
        System.out.println(result.val);
    }
}
