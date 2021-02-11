  
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(-1)    //create a dummy node
        dummy.next=head      //dummy will be ahead of head ie, dummy.next will point to head
        
        slow=fast=dummy   //both slow and fast will point to dummy
        
        while n>0:        //create a window with the difference of n
            fast=fast.next
            n-=1
            
        while fast.next:    //move both the pointers till fast will reach to last node
            fast=fast.next
            slow=slow.next
        
        slow.next=slow.next.next    //delete the slow.next node
        return dummy.next   //return dummy.next
