# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    """Time complexity-O(n) single pass
    Space Complexity-O(1)"""
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        dummy=ListNode(-1)
        dummy.next=head
        fast=dummy
        slow=dummy
        i=0 
        while i<=n:
            fast=fast.next
            i+=1
        while fast:
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return dummy.next
        
            
            
        
        
        """Time complexity-two pass O(n)
        Space complexity-O(1)"""
#         ll=head
#         Newll=head
#         if ll:
#             Nodelen=1
#             i=1
#         while ll.next:
#             Nodelen+=1
#             ll=ll.next
#         noderemoveIndex=Nodelen-n
#         while Newll.next:
#             if noderemoveIndex==0:
#                 removeNode=head
#                 head=head.next
#                 removeNode.next=None
#                 break
#             if i!=noderemoveIndex:
#                 Newll=Newll.next
#                 i+=1
#             else:
#                 removeNode=Newll.next
#                 Newll.next=Newll.next.next
#                 removeNode.next=None
#                 break
                
#         if Nodelen==1 and n==1:
#             removeNode=head
#             head=head.next
#             removeNode.next=None
#         return head
        
        
                    
            