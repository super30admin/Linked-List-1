# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        # ## brute force approach
        # ## TC - o(n) To calculate the length + O(n) For removal --> O(n)
        # ## Sc -> O(1)
        # if head == None:
        #     return head
        # # Calculate the length 
        # length = 1
        # temp = head
        # while temp.next!= None:
        #     temp = temp.next
        #     length+=1
        # # If only one node 
        # if length == 1:
        #     return None  
        # # If I have to remove the first node then
        # if length == n:
        #     return head.next      
        # # Removal logic 
        # temp = head
        # counter = 1
        # while counter<length-n:
        #     temp = temp.next
        #     counter+=1

        # temp.next = temp.next.next
        # return head   

        ## Optimize Method    
        ## TC - O(n) Sc - O(1) 
        dummy = ListNode(0)
        dummy.next = head
        fast = dummy
        slow = dummy
        temp = n
        while(temp>0):
            if fast!= None:
                fast = fast.next
                temp-=1
        while fast!=None and fast.next!=None:
            fast = fast.next
            slow = slow.next

        slow.next = slow.next.next     

        return dummy.next       
            

        
