# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Approach 1:
# T = O(n)
# S = O(n)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        nodeSet = set()
        curr = head

        while curr != None:
            if curr in nodeSet:
                return curr
            nodeSet.add(curr)
            curr = curr.next
        
        return None


# Approach 2:
# T = O(n)
# S = O(n)
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head == None:
            return None

        # finding the first common point where slow and fast meets
        slow = head
        fast = head
        flag = False

        while fast.next != None and fast.next.next != None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                flag = True
                break

        if flag == False:
            return None

        # setting slow back to head and moving slow and fast by 1 space till they meet again.
        slow = head

        while slow != fast:
            slow = slow.next
            fast = fast.next

        return slow # or fast