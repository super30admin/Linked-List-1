# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Time Complexity : O(n)
# Space Complexity: O(1)
class Solution(object):
    #     Calculating size of list and the iterate
    def removeTwoPass(self, head, n):
        #         Base case
        if head == None:
            return None

        current = head
        size = 1

        while current.next != None:
            current = current.next
            size += 1

        ele = size - n
        #        if ele is the first element in the list
        if ele == 0:
            head = head.next
        else:
            #             logic
            current = head
            count = 1
            while count != ele:
                current = current.next
                count += 1

            current.next = current.next.next

        return head

    #     Using two pointers we will calculate the nth element and remove accordingly
    def removeOnePass(self, head, n):
        #         Base Case
        if head == None:
            return None
        #         Initializing two pointers

        current = head
        sp = head
        fp = head
        count = 0

        #       increment the fast pointer till n
        while count != n:
            fp = fp.next
            count += 1
        #     after getting current fp , if current fp is none we will move head to next
        if not fp:
            head = head.next
            return head
        #        If fp is not null then we will move the sliding window till last element
        while fp.next != None:
            sp = sp.next
            fp = fp.next

        # when fp is at the end of the list then sp will be at at previous node of nth location from end of the list
        sp.next = sp.next.next

        return head

    def removeNthFromEnd(self, head, n):

        return self.removeTwoPass(head, n)
        return self.removeOnePass(head, n)

        """
        :type head: ListNode
        :type n: int
        :rtype: ListNode
        """
