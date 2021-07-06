

# brute force
# def detectCycle(self, head: ListNode) -> ListNode:
#     node_seen = set()
#     while head is not None:
#         if head in node_seen:
#             return head
#         else:
#             node_seen.add(head)
#             head = head.next

# using slow and fast pointer:

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        # node_seen = set()
        # while head is not None:
        #     if head in node_seen:
        #         return head
        #     else:
        #         node_seen.add(head)
        #         head = head.next
        slow, fast = head, head
        flag = False

        # while condition if not cyclic and fast.next is for even and odd number array
        while fast != None and fast.next != None:
            slow = slow.next
            fast = fast.next.next
            # cyclic property
            if slow == fast:
                flag = True
                break
        # return none if not cyclic
        if not flag:
            return None
        else:
            # reset one flag to head
            slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow
