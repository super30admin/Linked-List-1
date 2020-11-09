# As discussed, the simple way is to find where 2 pointers fast and slow intersect (Floyd's algorithm) and then move pointers until both are eual if yes then there is a cycle
# Time Complexity: O(n)
#Space Complexity: O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def findCycle(self, head):
        slow = head
        fast = head
        intersection = None
        
        while(fast is not None or fast.next is not None):
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                intersection = slow
        
        if head is None:
            return None
        if intersection is None:
            return None
        
        p1 = head
        p2 = intersection
        while p1 != p2:
            p1 = p1.next
            p2 = p2.next
        return p1

n1 = ListNode(1)
n2 = ListNode(2)
n1.next = n2
n2.next = n1
s= Solution()
head = s.findCycle(n1)
print(head.val)