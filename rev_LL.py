#time complexity:o(n) travesing whole list
#space complexity: o(1) no extra space
#passed all cases on LeetCode: yes
#difficulty faced:
# comments: not needed
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        prev = None
        curr = head

        while curr:

            temp = curr

            curr = curr.next

            temp.next = prev 

            prev = temp 

        return prev

            