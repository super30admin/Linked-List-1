# Time COmplexity :- O(n)
# Space complexity :- O(1)
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        fastnode = head
        slownode = head
        dummyhead = ListNode()
        dummyhead.next = head
        previous = dummyhead

        for i in range(n):
            fastnode = fastnode.next

        while (fastnode != None):
            previous = slownode
            slownode = slownode.next
            fastnode = fastnode.next

        previous.next = slownode.next
        slownode = None
        return dummyhead.next

#         dummy_node = ListNode()
#         dummy_node.next = head
#         fast_node = dummy_node

#         i = 0
#         while(i <= n):
#             fast_node = fast_node.next
#             i+=1
#         slow_node = dummy_node
#         while(fast_node != None):
#             slow_node = slow_node.next
#             fast_node = fast_node.next

#         slow_node.next = slow_node.next.next
#         return dummy_node.next
