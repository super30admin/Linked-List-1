from create_singly_list_node import ListNode, listNodeToString, stringToListNode


class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        """
            https://leetcode.com/problems/remove-nth-node-from-end-of-list/
            // Time Complexity : O(n)
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english :
                - Make dummy node for edge case, when we want to delete
                - Make the gap required unless count is not greater than
                - Move both slow and fast pointer together
        """
        # edge case
        if not head:
            return head

        # fore edge case when n = 1
        dummy = ListNode(-1)
        dummy.next = head

        slow = fast = dummy
        # traverse until count (the gap)
        # is <= the required n
        count = 0
        while count <= n:
            fast = fast.next
            count += 1
        # move both slow and fast simultaneously
        while fast:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return dummy.next

    def removeNthFromEndBruteForce(self, head: ListNode, n: int) -> ListNode:
        # edge case
        if not head:
            return head

        dummy = ListNode(-1)
        dummy.next = head
        length = 1
        cur = dummy
        while cur and cur.next:
            length += 1
            cur = cur.next
        cur = dummy
        count = 1
        while count < length - n:
            cur = cur.next
            count += 1
        cur.next = cur.next.next
        return dummy.next


if __name__ == '__main__':
    h = Solution()
    head = stringToListNode([3, 2, 0, -4])
    new_head = removeNthFromEnd(head)
    print(listNodeToString(new_head))
