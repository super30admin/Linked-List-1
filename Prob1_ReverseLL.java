// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)   return head;
        
        //Iterative approach
       //Making use of 3 pointers
        /*
        ListNode prev = null, curr = head;
        
        while(curr != null){
            ListNode next = curr.next; //Stored the next node
            curr.next = prev; // Setting the link for curr to prev
            prev = curr; //Now prev is cuur node
            curr = next; // But curr will be next node
        }
        
        return prev;
        */
        
        //Recursive approach // Here we are not using 3 pointers 
        
        ListNode rev = reverseList(head.next);
        
        head.next.next = head; // Here everytime current head's next pointer link will be set
        head.next = null; //Then removing link of curr head and making it to null

        return rev; // This will be head of reverse list and every recursive call will return same node in whole computation
        
    }
}