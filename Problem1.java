// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Problem1 {
    
    public static ListNode reverseList(ListNode head) {
        // Initialise curr pointer to head and prev pointer to null
        ListNode prev = null;
        ListNode curr = head;
        // Iterate through the linked list
        while(curr != null) {
            // Set next pointer to the node next to curr
            ListNode next = curr.next;
            // Link node at curr to node at prev
            curr.next = prev;
            // Advance the prev and curr pointers to next node in the un-reversed part of linked list
            prev = curr;
            curr = next;
        }
        // The prev pointer finally points to the head of the reversed linked list
        return prev;
    }

    public static ListNode makeLinkedList(int[] arr) {
        ListNode head = null;
        for (int i = 0; i < arr.length; i++)
            head = insertNode(head, arr[i]);
        return head;
    }

    private static ListNode insertNode(ListNode head, int val) {
        ListNode temp = new ListNode(val);
        if (head == null)
            head = temp;
        else {
            ListNode curr = head;
            while (curr.next != null)
                curr = curr.next;
            curr.next = temp;
        }
        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode curr = head;
        List<Integer> ans = new ArrayList<Integer>(); 
        while (curr != null) {
            ans.add(curr.val);
            curr = curr.next;
        }
        System.out.println(ans);
    }
 
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5};
        ListNode head = makeLinkedList(arr);
        // printLinkedList(head);
        ListNode ans = reverseList(head);
        printLinkedList(ans);
    }

}
