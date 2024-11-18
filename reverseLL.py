# // Time Complexity :O(n) for node traversal
# // Space Complexity :O(1) for prev curr and temp
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach


class Solution:
    
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #basecase
        if not head : return None
        
        #we use 3 pointers  prev:0/Null, current:1, temp:2
        prev = None             #0
        curr = head             #1

        while curr != None:     #       keep moving the 3 points one by one. 
            #prev,curr,temp
            temp = curr.next    #2      store next pointer//increment next
            
            curr.next = prev    #1      use next pointer to point towards previous node

            prev = curr         #1->2   increment previous

            curr = temp         #2->3   increment current
        return prev
    

# #temp outside while loop
# class Solution:
    
#     def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         if head == None: return None
#         #3 pointers -1 prev, 0 current, 2 temp
#         prev = None         #0
#         curr = head         #1
#         temp = curr.next    #2

#         while temp != None:
#             #prev,curr,temp
#             curr.next = prev    #1
#             prev = curr         #1->2
#             curr = temp         #2->3
#             temp = temp.next    # increase next
       
#         curr.next = prev          #needs to add the final prev to the return
#         return curr