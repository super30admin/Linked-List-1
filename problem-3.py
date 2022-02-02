# Leetcode Execution:YES
# Time Complexity:O(n)
# Space Complexity:O(n)
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        # we keep all the nodes in the list and check if the node. next is in array if it is the we return the node.next node else we return none if there is no loop 
        if head==None: return None
        mapp=[]
        temp=head
        i=0
        while(temp!=None):
            # print(mapp)
            if temp.next in mapp:
                return temp.next
                
                
            else:
                mapp.append(temp)
                temp=temp.next
        return None
        
        