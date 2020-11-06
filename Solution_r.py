"""
Time complexity O(N)
Space Complexity O(N) recursive stack can go N level deep 


"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution_r:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None or head.next is None :
            return head
        ptr=self.reverseList(head.next)
        #st.pop() and 4 will be head 
        head.next.next=head
        head.next=None
        return ptr