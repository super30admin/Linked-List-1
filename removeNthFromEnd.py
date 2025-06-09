# // Time Complexity :O(N)
# // Space Complexity :o(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach
 #what if you are deleting end ponter, pointer in between and head pointer? consider all these conditions
# 2 methods one with slow and fast pointers and one with count
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #have slow fast pointer ,by time slow pointer starts fats willbe ahead by n+1 points
        slow,fast=head,head
        while(n):
            fast=fast.next
            n-=1
        if fast is None: return head.next
        fast=fast.next
        
        while(fast is not None):
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return head
###################################################################################################
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        #method one count number of node then ..in second pass move to required node then delete it
        #what if you are deleting end ponter, pointer in between and head pointer
        cnt=0
        head1=head
        head2=head
        while(head):
            cnt+=1
            head=head.next
        cnt=cnt-n-1
        while(cnt>0):
            print(head1.val)
            head1=head1.next
            cnt-=1
        if cnt==-1:return head2.next
        head1.next=head1.next.next
        return head2

        
