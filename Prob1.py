# Time Complexity : O(n)
# Space Complexity : O(n) for the recursive stack. 
# We Recursively call the function on the nodes until we reach the end of the list. Then, Update the pointers to get the list in reverse order.

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        #Method 1 - Iterative solution - O(n) TC, O(1) SC
        # if not head or not head.next: return head
        # curr=head
        # prev=None
        # while curr:
        #     temp=curr.next
        #     curr.next=prev
        #     prev=curr
        #     curr=temp
        # return prev


        #Method 2 - Recursive solution
        def reverse(head):

            if head ==None or head.next==None:
                return head
            

            rev=reverse(head.next) #print(head.val) after this line - 4,3,2,1 Also, print(rev.val) after this line - 5,5,5,5 - Global variable, never pushed on to the stack
            head.next.next=head
            head.next=None
            return rev
        return reverse(head)
