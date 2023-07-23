# Time Complexity : O(n)
# Space Complexity : O(1)
# Here, we use fast pointer n times, then use a slow pointer and iterate both of them till fast reaches null. When it is at Null, the slow pointer.next will be pointing at the node to be deleted.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # Method 1 - 2 Pass algorithm - Get length of the LL, then do (len-n) to get the location of node to be deleted. Then iterate till (len-n)>0, the moment it becomes zero, you are at pointer.next equals the node to be deleted.

        # dummy=ListNode(0,head)
        # len=0
        # first=head

        # while first:
        #     len+=1
        #     first=first.next
        
        # len-=n
        # first=dummy.  #using dummy, for edge cases where the 1st node itself is to be deleted
        # while len>0:
        #     len-=1
        #     first=first.next
        # first.next=first.next.next
        # return dummy.next

        # Method 2 - 1 Pass algorithm
        dummy=ListNode(0,head)
        slow=dummy          #using dummy, for edge cases where the 1st node itself is to be deleted
        fast=head
        for i in range(n):
            if fast==None: #for the edge case of n==full Length
                break
            fast=fast.next #iterate fast till i==n
        while fast!=None: #we'll iterate fast and slow till fast is Null (end of LL)
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next #deletion
        return dummy.next

        