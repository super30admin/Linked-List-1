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
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//used the cyclic approach to solve the problem 
//here a+b==a+b+c+b =>2(a+b)=a+2b+c =>a=c 
//slow go at x speed fast go at 2x speed and continue to go till fast!=null and fast.next!=null
//if slow==fast then the cycle exist and we get out of loop
//we use boolean hascycle =true if exist else false 
//if false then cycle not exist and retun null 
//increment slow and fast till slow!=fast and return slow

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        boolean hascycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow ){
                hascycle=true;
                break;
            }
        }
        if(!hascycle){
            return null ;
        }
        fast=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}