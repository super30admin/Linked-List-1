# pproach:
# Iterate through the linked list, reversing the next pointer of each node to point to the previous node.
# Maintain three pointers (prev, curr, temp) to track and update links until the list is fully reversed.
# Time & Space Complexity:
# Time Complexity: O(n) (Each node is visited once).
# Space Complexity: O(1) (Only a few extra pointers used)
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        curr = head
        while curr:
            temp = curr.next
            curr.next = prev 
            prev = curr
            curr = temp
        return prev