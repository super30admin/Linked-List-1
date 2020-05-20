# Did it run Leetcode:Yes
# Time Complexity: O(n) , n is number. of nodes in linked list since we traverse once through the entire list
# Space Complexity:O(1) constant space for pointers and dummy node
# Apprach:Single Pass: We need gap of n between last and the node whose next we want to delete. Therefore we 2 pointers. Both point to dummy initially.  Dummy is used for edge cases where linked list has only one node or we want to delete head. First will travel for n nodes so that gap is formed between first and second of n. Then each will traverse by 1 pointer until first reaches the end. Now second is pointing to the previous of the node we want to delete.  So we set next pointer of previous to next of node to be deleted. We return dummy.next which is head
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy = ListNode()
        dummy.next = head
        first = dummy
        second = dummy

        for i in range(0, n + 1):
            first = first.next

        while first is not None:
            first = first.next
            second = second.next
        print(second.val)
        second.next = second.next.next
        return dummy.next
