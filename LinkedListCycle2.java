// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class LinkedListCycle2 {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

   public static ListNode detectCycle(ListNode head) {
        
    // Two pointers for traversing the linkedlist at different speed.
    ListNode slow = head;
    ListNode fast = head;
    boolean isCycle = false;
    
    // Slow pointer traverses the linkedlist at 1x speed.
    // Fast pointer traverses the linkedlist at 2x speed.
    // If there is a cycle in the LinkedList the slow and fast pointers meet at a node. 
    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            isCycle = true;
            break;
        }
    }
    
    // If there is no cycle found after traversing the entire linkedlist then we return null.
    if(!isCycle) return null;
    
    // If there is a cycle then we reset one of the pointer to head and traverse slow and fast pointers at 1x speed. 
    // They surely meet at the node where the cycle begins. 
    fast = head;
    while(slow != fast){
        fast = fast.next;
        slow = slow.next;
    }
    
    // Finally return the node where the cycle starts.
    return slow;
}

    public static ListNode generateCyclicLinkedList(int[] nums, int pos){
        ListNode head = null, prev = null;
        for(int i = nums.length-1; i>=0; i--){
            head = new ListNode(nums[i], prev);
            prev = head;
        }

        // Generating a cycle.
        ListNode slow = head;
        ListNode fast = head;
        
        while(--pos > 0){
            slow = slow.next;
        }
        while(fast.next != null){
            fast = fast.next;
        }
        
        fast.next = slow;
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
        ListNode node = detectCycle(generateCyclicLinkedList(new int[]{1,2,3,4,5}, 3));
        if(node != null) System.out.println(node.val);
        node = detectCycle(generateCyclicLinkedList(new int[]{8,7,5,6,2,3,1}, 4));
        if(node != null) System.out.println(node.val);
        node = detectCycle(generateCyclicLinkedList(new int[]{3,2,0,-4}, 2));
        if(node != null) System.out.println(node.val);
        node = detectCycle(generateCyclicLinkedList(new int[]{1,2}, 1));
        if(node != null) System.out.println(node.val);
    }
}
