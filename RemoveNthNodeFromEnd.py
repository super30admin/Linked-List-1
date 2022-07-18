#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = ListNode()
        fast = ListNode()
        idx = 0
        # null
        if head == None:
            return head

        if head.next == None:
            if n == 1:
                head = head.next
                return head
        # logic
        slow = head
        fast = head

        while (fast.next != None):

            # it seems that TC is O(n^2) here but if we keep track of fast pointer, it is O(n)
            while (idx != n):
                # print("here2")
                fast = fast.next
                idx += 1

                if (fast == None):
                    head = head.next
                    return head

            # slidind window from here
            if (fast.next != None):
                slow = slow.next
                fast = fast.next
                # only when fast is not last. if it is last then fast.next will be None.
                # So, it will dive error above then we check for ffast.next!=None

        slow.next = slow.next.next
        # print("head ",head)
        return head
