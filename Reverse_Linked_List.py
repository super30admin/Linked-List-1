#Time complexity: O(n)
#Space complexity: O(1)
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # prev, curr = None, head
        # while curr:
        #     temp = curr.next
        #     curr.next = prev
        #     prev = curr
        #     curr = temp
        # return prev

        if head is None or head.next is None:
            return head

        prev = None
        curr = head
        fast = head.next

        while fast is not None:
            curr.next = prev
            prev = curr
            curr = fast
            fast = fast.next

        curr.next = prev
        return curr
        
        
