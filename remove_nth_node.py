# TC - O(n)
# SC - O(1)

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:

    def get_length(self, head):
        length = 0
        while head:
            length+=1
            head = head.next
        return length

    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        total_len = self.get_length(head)
        index_to_remove = total_len - n + 1
        if index_to_remove == 1:
            return head.next
            
        prev, curr = None, head
        curr_node_index = 1
        while curr:
            prev = curr
            curr = curr.next
            curr_node_index +=1
            if curr_node_index == index_to_remove:
                break

        prev.next = curr.next if curr else None
        return head

