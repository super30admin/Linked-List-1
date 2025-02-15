// Time Complexity : O (2n) => O(n)
// Space Complexity : O (1) 
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : i have implemented this by using slow and fast pointer where slow pointer moves in 1x speed and fast 2x speed till fast is not null.at the pointer where slow and fast met then i came to know that there is a cycle but i need the point where cycle started slow for that then i restart one of pointer and run both in 1x speed in this case where they met each other that is the point where cycle starts.


// Your code here along with comments explaining your approach


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        while(fast !=null && fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                flag=true;
                break;
            }

        }
        if(flag){
            slow=head;
            while(slow != fast){
                slow=slow.next;
                fast=fast.next;
            }
        }else{
          return null ;
        }
        return slow;
       
        
       
    }
}