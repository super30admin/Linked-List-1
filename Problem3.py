// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=fast=head    //set both the pointers to head
        
        while fast!=None and fast.next!=None:   
            slow=slow.next  //move slow by one element 
            fast=fast.next.next   //move fast by one element
            
            if slow==fast:  //if slow==fast =>loot found
                fast=head    //set fast to head
                while fast!=slow: //travel fast and slow till we will not get the node in which loop will start
                    fast=fast.next
                    slow=slow.next
                return slow
        return None
        
