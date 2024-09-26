
# Time Complexity : O(2n)->O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :no



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if not head:
            return head
        length=0
        ptr=head
        
        while ptr!=None:         
            length+=1
            ptr=ptr.next
            
        print("length#",length)
        
        target_idx=length-n
        print("target_idx=",target_idx)
        
        ptr=head
        curr_len=1
        if curr_len>target_idx:
            return head.next
        while curr_len<=target_idx:
            if curr_len==target_idx:
                ptr.next=ptr.next.next
                break
            
            ptr=ptr.next
            curr_len+=1

        return head
# #  On Pass   
# # Definition for singly-linked list.
# # class ListNode:
# #     def __init__(self, val=0, next=None):
# #         self.val = val
# #         self.next = next
# class Solution:
#     def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
#         dummy=ListNode(0,head)
#         slow=dummy
#         fast=dummy

#         if not head or not head.next:
#             return head.next 
        
#         while fast.next!=None: 
#             fast=fast.next
#             if n<=0:
#                 slow=slow.next
#             n=n-1
#         slow.next=slow.next.next    

#         return dummy.next
            