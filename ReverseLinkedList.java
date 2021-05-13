// Time Complexity : O(n)
// Space Complexity : O(1) --> Iterative approach
// Space Complexity : O(n) --> Recursive approach(for the recursive stack)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class ReverseLinkedList{

    static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public static ListNode reverseListRecurse(ListNode head) {
        // base case
        if(head == null || head.next == null){
            return head;
        }
        
        // recurse
        ListNode reversed = reverseListRecurse(head.next);
        
        // logic for updating the pointers
        head.next.next = head;
        head.next = null;
        
        // Finally return the head.
        return reversed;
    }

    public static ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        // We keep a track of nodes using three pointers.
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        // Update the links in the node by changing the connection from current node to previous node.
        // Once the link is changed, move all the 3 pointers by one step ahead.
        while(fast != null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        
        // After the last iteration, the link from current head to previous node will be missing. update the final missing link.
        curr.next = prev;
        return curr;
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
        printList(reverseList(generateLinkedList(new int[]{1,2,3,4,5})));
        printList(reverseListRecurse(generateLinkedList(new int[]{1,2,3,4,5,6,7,8})));
        printList(reverseList(generateLinkedList(new int[]{4})));
        printList(reverseListRecurse(generateLinkedList(new int[]{4,5})));
        printList(reverseList(generateLinkedList(new int[]{})));
        printList(reverseListRecurse(generateLinkedList(new int[]{})));
    }
}