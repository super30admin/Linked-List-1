# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Nope
#Instead of using 3 pointers I used only 2 of them.
# We do store curr.next in nxt variable
# then we point the next pointer to the prev one
#Then we move the prev pointer to the curr
#we move the curr to the next poistion which is stored in nxt

# // Your code here along with comments explaining your approach



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Startingprev with dummy node and curr to first node
        prev,curr=None,head
        
        while curr:
            nxt=curr.next
            curr.next=prev
            prev=curr
            curr=nxt
        
        return prev