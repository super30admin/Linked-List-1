// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class RemoveNthNode {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy pointer to handle the edge case of removing head from the linked list.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        // Two pointers are used for creating a gap of length n.
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // Generate the gap by moving the fast pointer by n steps.
        int count = 0;
        while(count++ < n){
            fast = fast.next;
        }
        
        // Once the fast pointer is in place, then start moving both the pointers simultaneously until the fast pointer reaches the end.
        // By the end of the iteration, slow pointer will be in the right place where the node needs to be removed.
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        // delete the node.
        slow.next = slow.next.next;
        
        // Finally return next node to dummy. 
        return dummy.next;
    }

    public static ListNode generateLinkedList(int[] nums){
        ListNode head = null, prev = null;
        for(int i = nums.length-1; i>=0; i--){
            head = new ListNode(nums[i], prev);
            prev = head;
        }
        return head;
    }

    public static void printList(ListNode head){
        if(head == null) return;

        while(head != null){
            System.out.print(head.val+" --> ");
            head = head.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        printList(removeNthFromEnd(generateLinkedList(new int[]{1,2,3,4,5}), 2));
        printList(removeNthFromEnd(generateLinkedList(new int[]{1,2,3,4,5,6,7,8}), 3));
        printList(removeNthFromEnd(generateLinkedList(new int[]{4}), 1));
        printList(removeNthFromEnd(generateLinkedList(new int[]{44,55}), 1));
    }
}
