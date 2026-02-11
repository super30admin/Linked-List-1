// Approach 01: Brute force - traverse the entire linked list in forward manner
// store the ListNode one by one in a List, then traverse the List in reverse order
// and form the reverse linked list
// Time and Space : O(2n), Extra Space : O(n)

// Approach 02 : Optimal One - using two variable apporach, reversing the linked list
// in the forward traversal itself keeping a prev, curr, temp variable(to keep track of next node)
// Time : O(n), Space: O(1) - no extra space needed

// Yes this code successfully ran over leetcode

// we can also use recursive stack approach but not optimal one.


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;


        while(curr != null){
            ListNode temp = curr.next; // keep track of next
            curr.next = prev; // reverse
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
