# 1 --> 2 --> 3 --> 4 --> 5 --> 6
# declare two pointers slow and fast 
# Until count <= k, we move the fast pointer, then move slow and fast by 1.
# Slow reaches the poition right before the node that needs to be removed
# update the pointers to next

# Time: O(N)
# Space O(1)

class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:

        if head == None or head.next == None:
            return

        dummy = ListNode()
        dummy.next = head

        slow = head
        fast = head
        count = 0


        while count <= n:
            fast = fast.next
            count += 1

        while fast != None:
            slow = slow.next
            fast = fast.next

        # now slow points to the node before which we need to remove

        slow.next = slow.next.next

          # we return dummy.next as in the case we have to delete the node we have only dummy node to return so we link it as dummy.next
        return dummy.next





