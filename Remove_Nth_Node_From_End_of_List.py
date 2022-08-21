# Time Complexity :O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        nodedel = head
        temp = head
        prev = None
        count = n - 1
        while temp.next:
            if count <= 0:
                prev = nodedel
                nodedel = nodedel.next
                temp = temp.next
            else:
                temp = temp.next
                count -= 1
        if nodedel == head:
            head = nodedel.next
        elif nodedel.next is None:
            prev.next = None
        else:
            prev.next = nodedel.next
        return head
                    
        
        