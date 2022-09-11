# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#We use slow and fast pointers. When fast=slow that means there is a cycle
#Now then we make slow as head and increment both +1 again.
# Now when again they will meet then we return any of the pointer
# we run the initial loop and keep a flag , if flag is false then its no cycle
# If fast or fast.next is null then our loop exits.


# // Your code here along with comments explaining your approach

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow,fast=head,head
        flag=False
        
        if head==None:
            return None
        
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if slow==fast:
                slow=head
                flag=True
                break
        
        if flag!=True:
            return None
        if flag:
            while fast!=slow:
                slow=slow.next
                fast=fast.next
                
        
        return slow