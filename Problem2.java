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

public class Problem2 {
    
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Make a dummy node that points to head
        // Dummy node takes care of case when head has to be removed
        ListNode dummy = new ListNode();
        dummy.next = head;
        // Set first and second pointer to dummy
        ListNode first = dummy, second = dummy;
        int count = 0;
        // Advance first pointer to n+1 positions, since we want the second pointer to point at node before the node to be deleted.
        while(++count <= n + 1) {
            first = first.next;
        }
        // Keep on incrementing first and second pointers until first pointer reaches null
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        // Remove node next to second pointer
        ListNode temp = second.next;
        second.next = temp.next;
        temp = null;
        // Return head
        return dummy.next;
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
        int n = 2;
        ListNode ans = removeNthFromEnd(head, n);
        printLinkedList(ans);
    }
}
