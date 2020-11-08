# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None or not head.next:
            return head
        # prev = None
        # curr = head
        # while curr:
        #     f=curr.next
        #     curr.next= prev
        #     prev = curr
        #     curr = f
        # return prev

        # recursive
        #         p=self.reverseList(head.next)
        #         head.next.next=head
        #         head.next=None
        #         return p
        # iterative of recuur
        stack = []
        while head:
            stack.append(head)
            head = head.next
        a = p = ListNode()
        # print(p)
        while stack != []:
            att = stack.pop()
            p.next = att
            # print(p)
            p.next.next = None
            p = p.next

        return a.next

