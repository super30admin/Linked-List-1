'''
In this problem we have to remove the nth node from the end of the linkedlist.
So I took 2 pointer slow and fast, both starting at a dummy node created before head(to handle cases where we have to remove last node).
Then fast pointer is moved first creating a window of n nodes, then slow pointer is moved maintaining the window constant with n nodes.
Once the fast pointer is moved to last node, the element at slow pointer is removed and the node is mapped to next element connecting to removed element.
'''
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        count = 0
        dummy = ListNode(-1)
        dummy.next = head
        slow = dummy
        fast = dummy
        # moving the fast pointer 
        while count <= n:
            count += 1
            fast = fast.next
        # slide window
        while fast is not None:
            slow = slow.next
            fast = fast.next
        # mapping the nodes by removing nth element
        curr = slow.next
        slow.next = slow.next.next
        curr.next = None
        return dummy.next

'''
Time Complexity: O(n)
We are iterating on the linked list once
Space Complexity: O(1)
we are not taking any extra space other than the pointers
'''