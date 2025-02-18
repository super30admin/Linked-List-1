//Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

//Brute Force approach

// Time Complexity :    O(L) + O(L+n), We are calculating the length of the linked list and then iterating up to the (L-N)th node of the linked list, 
//where L is the total length of the list and N is the position of the node to delete.
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        
        int count = 0;
        ListNode temp = head;

        // Count the number of nodes
        while (temp != null) {
            count ++;
            temp = temp.next;
        }
        /* If N equals 
        the total number of nodes
        delete the head */
        if (count == n) {
            ListNode newHead = head.next;
            return newHead;
        }

        /* Calculate the position 
        of the node to delete (res) */
        int res = count - n;
        temp = head;

        /* Traverse to the node 
        just before the one to delete */
        while (temp != null) {
            res --;
            if (res == 0) {
                break;
            }
            temp = temp.next;
        }

        // Delete the Nth node from the end
        ListNode delNode = temp.next;
        temp.next = temp.next.next;
        return head;
    }
}

//Optimal approach

// Time Complexity :    O(n) where n is the length of the LL
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        /* Move the fastp pointer N nodes ahead */
        for (int i = 0; i < n; i ++) {
            fast = fast.next;
        }
        /* If fastp becomes NULL the Nth node from the end is the head */
        if (fast == null) {
            return head.next;
        }
        /* Move both pointers Until fastp reaches the end */
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // Delete the Nth node from the end
        ListNode delNode = slow.next;
        slow.next = slow.next.next;
        return head;
    }
}