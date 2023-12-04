// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


//take slow pointer and fast pointer. forward fastpointer until n and now iterate the node
//so that slow points the node before.
class ListNode {
    int val;
    ListNode next;

  

    public ListNode(int val) {
        this.val = val;
    }

    
}

public class Problem2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);  // Use a value that won't be in the actual list
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        // Move fast pointer n+1 steps ahead
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {
        Problem2 remover = new Problem2();

        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        System.out.println("Original List:");
        printList(head);

       
        ListNode modifiedHead = remover.removeNthFromEnd(head, n);

        System.out.println("\nModified List:");
        printList(modifiedHead);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
