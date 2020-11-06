"""
Time complexity O(N)
Space Complexity O(N) 


"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution_iter:
    def reverseList(self, head: ListNode) -> ListNode:
        if head is None or head.next is None :
            return head
        st=[]
        while(head.next!=None):
            st.append(head)
            head=head.next
        
        ptr=head
        while st:
            head=st.pop()
            head.next.next=head
            head.next=None
        return ptr