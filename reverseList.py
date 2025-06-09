# // Time Complexity :  O(N)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no
# https://leetcode.com/problems/reverse-linked-list/

# // Your code here along with comments explaining your approach
# have prev, curr, next pointers. firstly next pointer then update curr.next pointer to prev, move prev and current pointer





# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev=None
        curr=head
        while(curr):
            nxt=curr.next
            curr.next=prev
            prev=curr
            curr=nxt
        return prev

###########################################################################################################################

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        def helper(prev,curr):
            if  curr is None:return prev
            nxt=curr.next
            curr.next=prev
            prev=curr
            curr=nxt
            return helper(prev,curr)
        return  helper(None,head)


        
