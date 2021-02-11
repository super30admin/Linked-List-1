#TimeComplexity:O(N) 
#SpaceComplexity: O(1)
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        if head==None or head.next==None: #check for Null case
            return None
        s=head #declare slow and fast pointer
        f=head
        cur=head
        while(f!=None and f.next!=None):#increment both untill both are equal 
            s=s.next
            f=f.next.next
            if s==f:  #if equal then there is cycle.Increment current from beginning and slow from where it is equal to fast both will meet at the starting of cycle.
                while(s!=cur):
                    s=s.next
                    cur=cur.next
                return s
        return None

            
        #print(s.val,f.val)
        