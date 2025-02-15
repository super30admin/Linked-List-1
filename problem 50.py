# https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(-1) #need a dummy ahead
        dummy.next = head
        slow = dummy
        fast = dummy
        cnt = 0
        while cnt <= n: # move fast until n because we need to give the gap between slow and fast
            fast = fast.next
            cnt+=1
        
        while fast is not None: # move both pointers until fast reaches end
            slow = slow.next # slow will be right before the nth node from end
            fast = fast.next
        
        temp = slow.next # sever the link
        slow.next = slow.next.next
        temp.next = None

        return dummy.next # this will return head
        
        