from create_singly_list_node import ListNode, listNodeToString, stringToListNode


class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        """
            https://leetcode.com/problems/reverse-linked-list/
            // Time Complexity : O(n)
            // Space Complexity : O(1)
            // Did this code successfully run on Leetcode : Yes
            // Three line explanation of solution in plain english :
                - Fast and Prev pointer point to None
                - Move fast pointer first, adjust other pointers
                - Return the prev
        """
        # if one head or no head
        if not head or not head.next:
            return head

        prev = None
        current = slow
        fast = None
        while current:
            fast = current.next
            current.next = prev
            prev = current
            current = fast
        return prev

    def reverseList_recursive(self, head: ListNode) -> ListNode:
        """
            // Time Complexity : O(n)
            // Space Complexity : O(n) if recursive stack
        """
        # base
        if head is None or head.next is None:
            return head
        # logic
        reversed_head = self.reverseList_recursive(head.next)
        head.next.next = head
        head.next = None
        return reversed_head


if __name__ == '__main__':
    h = Solution()
    head = stringToListNode([1, 2, 3, 4, 5])
    new_head = h.reverseList(head)
    print(listNodeToString(new_head))
