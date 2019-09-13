# leetcode: accepted
# time complexity: o(n)
# doubts (yes):  please check the comments
# explaination: we are taking two pointers, p1 and p2. We shift the p1 pointers , n places from the begining and then
# we move the p1 till the end if the linkedlist and move p2 along with it.

# when p1 shows null, it means p2 is n positions from end of linkedlist. (the difference between p1 and p2 is n) so when the p1 shows null, it means its n'th position from end of linkedlist

# aftet that we just link the p2 to p2.next.next and return the list

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        p1 = head
        p2 = head

        for i in range(n):
            p1 = p1.next
        if not p1:  # what does this line do
            return head.next
        while (p1.next != None):  # it also gives wrong o/p when i put p1!=None
            p2 = p2.next  # the output is wrong when i traverse p1 first and then traverse p2
            p1 = p1.next

        # print(p2.val)
        p2.next = p2.next.next
        return head
