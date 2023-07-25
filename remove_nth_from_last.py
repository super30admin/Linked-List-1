#  Time Complexity : O(2N) for length calculation, O(N) for single_pass
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this :


#  Your code here along with comments explaining your approach
    #     for length approach first go though the list, calculate the length, then calculate the difference and relative position
    #  of the element before the one to be removed, and make the element skip the next one.

    #     for the single pass approach, fast pointer travels till the range n, then slow pointer initiates, the ituition is the relative
    #   position of the element behind the one to be removed.



# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
        def single_pass(self, head, n):
        fast=head
        slow=head

        for i in range(n):
            fast=fast.next
        if(fast==None):
            # head=head.next
            return head.next
        while(fast.next!=None):
            slow=slow.next
            fast=fast.next
        slow.next=slow.next.next
        return head


    def calculate_length_method(self, head, n):
        temp=head
        l=0
        while(temp!=None):
            l+=1
            temp=temp.next
        print(l)
        prev_node=head
        d=l-n-1
        if(d<0):
            return head.next
        else:
            if(d==0):
                head.next=head.next.next
                return head

        print
        # if(l)
        while(d>0):
            prev_node=prev_node.next 
            d-=1
        prev_node.next=prev_node.next.next
        return head

    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        # return self.calculate_length_method(head, n)
        return self.single_pass(head,n)