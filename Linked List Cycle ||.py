# Solution 1 - To use hash set.  When we will traverse the cycle, we will repeat the node at the start of the cycle. The node is already present in hashset and hence we identify the head as well as presence of the cycle in linked list. 
# TC - O(N), SC - O(N)
# Solution 2 - USe two pointers. Slow and Fast. As we traverse linked list using slow pointer, before it completes its first iteration, fast pointer will catch up with slow pointer for sure, if the cycle is present as it traverse 2x speed of slow. As we confirm the presence, to identify the head of the cycle, we will set slow to head and we will start traversing. Slow and fast will meet at the head of the cycle. It's because head of the cycle is at equidistant from head and meeting point. 2(a+b) = a+b+c+b
# TC - O(N), SC - O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return None
        slow = head
        fast = head
        flag = False
        while (fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next
            if (slow == fast):
                flag = True
                break
        if flag == False: return None
        slow = head
        while slow != fast:
            slow = slow.next
            fast = fast.next
        return slow

        