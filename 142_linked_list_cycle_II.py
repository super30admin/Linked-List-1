from create_singly_list_node import ListNode, listNodeToString, stringToListNode


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        """
            https://leetcode.com/problems/linked-list-cycle-ii/
            // Time Complexity : O(n)
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english :
                - Using slow and fast pointer find the mid point
                - Move one pointer to the start of the list
                - Move each pointer one at a time till we reach the cycle start
        """
        if not head:
            return None

        slow = fast = head
        flag = False

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow:
                # cycle detected
                flag = true
                break

        if not flag:
            return None

        # finding cycle start index
        slow = head
        while fast != slow:
            slow = slow.next
            fast = fast.next
        return fast
