// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


//slow and fast and iterate through the end of list. again atke slow to head and ietate slow and fast
//the meeting point is the node
class ListNode {
    int val;
    ListNode next;

    

    public ListNode(int val) {
        this.val = val;
    }

}

public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        if (!flag) return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }

    public static void main(String[] args) {
        Problem3 problem = new Problem3();

       
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next; 

      
        ListNode cycleNode = problem.detectCycle(head);
        if (cycleNode != null) {
            System.out.println("Cycle detected. Cycle starts at node with value: " + cycleNode.val);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
