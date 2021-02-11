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
    def reverseList(self, head: ListNode) -> ListNode:
        pre=None      
        curr=head
                              //Iterative approach
        while curr!=None:     //traverse all the nodes
            nextt=curr.next     //store current.next in nextt
            curr.next=pre       //change current.next to pre
            pre=curr        //change pre to current node
            curr=nextt      //change current node to current.next i.e, next node in the original list
        return pre    //return pre since it will be the new head
        
