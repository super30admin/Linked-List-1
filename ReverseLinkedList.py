'''
In this problem we have to reverse the linked list, to solve this I considered 3 pointers. 
prev pointer pointing to null, curr pointer to head and fast pointer at curr.next.
we iterate as long as the curr pointer reached to end of the linked list, by mapping curr pointer to prev, fast pointer to curr.
By the time curr pointer reaches to last node, the list is mapped in the reverse.
'''
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None or head.next is None: return head
        prev = None
        curr = head
        # as long as the current pointer reaches to last node
        while curr is not None:
            # mapping curr node pointer to its prev node
            fast = curr.next
            curr.next = prev
            prev = curr
            curr = fast
        return prev
'''
Time Complexity: O(n)
We are iterating on the linked list once 
Space Complexity: O(1)
we are not using any extra space other than 3 pointers
'''