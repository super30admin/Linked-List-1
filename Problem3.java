// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem3 {
    
    public static ListNode detectCycle(ListNode head) {
        // Initialise slow and fast pointer to head
        ListNode slow = head, fast = head;
        // While fast pointer is not null and fast pointer doesn't point to null, advance slow pointer by 1 node and fast pointer by 2 nodes
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // If slow pointer and fast pointer point to same node, break the loop
            if (slow == fast) {
                break;
            }
        }
        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }
        // Set curr pointer to head
        ListNode curr = head;
        // Increment curr and slow pointer by 1 node until they meet at the point at which tail connects to node
        while(curr != slow) {
            curr = curr.next;
            slow = slow.next;
        }
        return curr;
    }

    public static ListNode makeCyclicLinkedList(int[] arr, int pos) {
        ListNode[] headtail = {null, null};
        ListNode posptr = null;
        for (int i = 0; i < arr.length; i++) {
            headtail = insertNode(headtail[0], arr[i]);
            if (i == pos) {
                posptr = headtail[1];
            }
        }
        ListNode head = headtail[0], tail = headtail[1];
        tail.next = posptr;
        return head;
    }

    private static ListNode[] insertNode(ListNode head, int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = temp;
        else {
            ListNode curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = temp;
        }
        ListNode tail = temp;
        return new ListNode[]{head, tail};
    }

    public static void printAns(ListNode head, ListNode ans) {
        ListNode curr = head;
        int index = 0; 
        while (curr != null) {
            if (curr == ans) {
                break;
            }
            index++;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("no cycle");
        } else {
            System.out.println("tail connects to node index " + index);
        }
    }
 
    public static void main(String args[]) {
        int arr[] = {3,2,0,-4};
        int pos = 1;
        ListNode head = makeCyclicLinkedList(arr, pos);
        ListNode ans = detectCycle(head);
        printAns(head, ans);
    }

}
