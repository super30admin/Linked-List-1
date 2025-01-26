'''
Another approach: We can add nodes in a stack and then when we remove the linkedinlist will get reversed Time O(n), Space O(n)
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        prev =None
        curr = head
        cnext = head.next
        while cnext:
            curr.next = prev
            prev= curr
            curr = cnext
            cnext=curr.next
        curr.next = prev
        return curr
        