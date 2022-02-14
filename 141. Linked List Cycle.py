# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        """
        Slow 1 slow x fast 2x, they meet at a point suggesting cycle
        while loop condition:

        """
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            head = head.next
            if slow == fast:
                return True
        return False

        """
        SOln 2 brute force way is to take a hashset and store the listnode
        in the hashset when cycle element is encountered , its already prseent in the hashset and hence it the cycle element. This approach uses O(n) space so we can do better than that in all linked list problems
        """
        # hashset=set()
        # while head:
        #     if head in hashset:
        #         return True
        #     hashset.add(head)
        #     head=head.next
        # return False

