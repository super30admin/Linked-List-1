"""
https://leetcode.com/problems/reverse-linked-list/
"""


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        """Recursive solution below"""
        ##base case
        if head is None or head.next is None:
            return head  
        reversedlist=self.reverseList(head.next)
        ###stack.pop happens   
        ## we converted chain from 5 -> null to 5->4 
        head.next.next=head 
        ###head is at 4 remember so we just now have to break 4-> 5 redundant pointer so we do this head.nex=none###[1,2,3,4,5]  
        head.next=None
        return reversedlist
        
        
        """
        1-> 2-> 3-> 4-> 5->
        1 is abandoned inside the recursive stack and we go to the baby
        stack  built will be so we call the recursive function on the baby that is head.next because if we call this function on baby we will
        first have to abndon the parent inside the recurisve stack so stack will be built like below. 5 will not go inside the recursive stack
        due to obvios reasons coz we will call the function on child 
        so if 5 is child 4 will be put in stack and then we hit null so 5 never goes to the stack. And then we hit head.next=Null so in the backend stack.pop will happen and 4 will be popped which will be head.  
    
                [ 4 ]
                [ 3 ]
                [ 2 ]
                [ 1 ] 
        
        """
        

# # Definition for singly-linked list.
# # class ListNode:
# #     def __init__(self, val=0, next=None):
# #         self.val = val
# #         self.next = next
# class Solution:
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         """Recursive solution below"""
#         ##base case
#         if head is None or head.next is None:
#             return head
           
        
        # """iterative solution below"""
#         """
#         Current.next should be previous thats how we reverse it
#         """
#         ##base case
#         if not head or not head.next:
#             return head
        
#         ###head item assignment
#         current=head
#         prev=None
#         fast=current.next
        
#         while fast!=None:
#             current.next=prev
#             """   
#             job of previous is done
#             move prev to current location         
#             """      
#             prev=current
#             """job of current is done move current to fast location"""
#             current=fast
#             """move fast to next location"""
#             fast=fast.next
#             """now here previous is at 2nd last index current is at last index and fast is None so if we just output this our answer would be
#             [4,3,2,1] instead of [5, 4,3,2,1] so in the end we do current.next=prev"""
        
#         current.next=prev
#         return current   
#             # temp=current.next
#             # prev.next=temp
#             # prev=prev.next
#             # prev.next=current
#             # current=prev
        
        
            
            
        