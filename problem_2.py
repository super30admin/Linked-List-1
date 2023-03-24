# Time Complexity - O(n)
# Space Complexity - O(1)


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head 
        slow = dummy
        fast = dummy 
        count = 0

        while count <= n :
            fast = fast.next
            count += 1  

        while fast :
            slow = slow.next 
            fast = fast.next 
        removed_node = slow.next
        slow.next = slow.next.next 
        removed_node.next = None
        

        return dummy.next