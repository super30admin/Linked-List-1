// Time Complexity :
O(n + n) => O(n) [we are traversing list twice, once for calculating size
and other time to delete the node]
// Space Complexity :
O(1)
// Did this code successfully run on Leetcode :
Yes
// Any problem you faced while coding this :
edge case when the element to be removed and the size of list are same
// Your code here along with comments explaining your approach


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        //Define a variable to calculate length of the list
        int size = 0;
        //Define a pointer to iterate through the list
        ListNode currentOne = head;
        
       //Find the length of the List
        while(currentOne != null){
            size++ ;
            currentOne = currentOne.next ;
        }
        
        
        // check if we need to change the head, handles [1][1] and [1,2][2] testcase
        if (n == size) 
            return head.next;
        
        //Now traverse until the node before n
        size = size - (n+1);
        //place the currentOne at head again
        currentOne=head;
        while(size>0) {
            size--;
            currentOne = currentOne.next;
            
        }
       
        currentOne.next = currentOne.next.next;  
        return head ;
    
        
    }
}





