# Time Complexity :  O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        #using dummy for cases where head needs to be removed
        dummy = ListNode(-1)
        dummy.next = head

        slow = fast = dummy

        while(count <= n):
            fast = fast.next
            count += 1
        
        while(fast != None):
            slow = slow.next
            fast = fast.next
        temp = slow.next
        slow.next = slow.next.next
        temp.next = None

        return dummy.next