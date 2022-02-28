#Method 1: Two Pass without dummy node
#TC:O(n)
#SC:O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def len_list(self,head):
        count = 0
        if head == None:
            return count
        curr = head
        while curr != None:
            count += 1
            curr = curr.next
        return count
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        length = self.len_list(head)
        if length == 1:
            return None
        count = length - n - 1
        curr = head
        if count == -1:
            head = head.next
            return head
        while count:
            curr = curr.next
            count -= 1
        curr.next = curr.next.next
        return head

#Method 2: Two Pass Dummy Head
#TC:O(n)
#SC:O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head or not head.next:
            return 
        dummy = ListNode(0,head)
        length = 0
        curr = head
        while curr != None:
            length += 1
            curr = curr.next
        length -= n
        curr = dummy
        while length > 0:
            length -= 1
            curr = curr.next
        curr.next = curr.next.next
        return dummy.next

#Method 2: One pass (fast and slow pointer), Dummy Head
#TC:O(n)
#SC:O(1)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head or not head.next:
            return 
        dummy = ListNode(0,head)
        length = 0
        fast = slow = dummy
        for i in range(n):
            fast = fast.next
        while fast.next != None:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return dummy.next