#TC = O(n)
#SC = O(n)
#Run on LC

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:

        s = set()

        temp = head

        while (temp):

            if (temp in s):
                return temp

            s.add(temp)

            temp = temp.next

        return None
