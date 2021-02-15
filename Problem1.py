"""206. Reverse Linked List
Time Complexity - O(n)
Space Complexity - O(1)
Using three pointers storing values of prev,current,next values and till current is not none keep on changing current.next to previous values and update prev = current,current= next and next = next node to next"""
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None:
            return None 
        prev = None
        current = head
        while (current != None):
            next_val = current.next
            current.next = prev
            prev = current
            current= next_val
        head = prev
        return head
            