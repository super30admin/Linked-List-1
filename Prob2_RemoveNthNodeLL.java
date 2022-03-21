// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)  return head;

        int c = 0;
        
        ListNode temp = new ListNode(-1); // What if we have to delete head node in the list
        temp.next = head;
        ListNode slow = temp;
        ListNode fast = temp;
        
        //Will traverse using fast pouinter by 1 element until we reach 1 element before element which we gonna delete (nth node from end of list)
        while(c < n){
            fast = fast.next;
            c++;
        }
        //Then Traverse slow and fast, until fast becomes null
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        

        //Slow points to the previous node of node being delete
        slow.next = slow.next.next;
        return temp.next; //Returning the head of list 
    }
}