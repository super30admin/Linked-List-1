# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach
class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #Base Case 1
        if(head==None):
            return None
        slow = head
        fast = head
        flag = False
        #To check if a cycle exists
        while(fast!=None and fast.next!=None):
            #slow 1x
            slow=slow.next
            #fast 2x
            fast=fast.next.next
            #Condition says that cycle exists
            if(slow==fast):
                flag = True
                break #Break the loop or else there is no null for the while to end
        #Base Case 2
        if(flag==False):
            return None
        #Place one of the pointers to head slow or fast and move both with 1x
        slow = head
        #The point where slow meets fast is the hed of the cycle
        while(slow!=fast):
            slow=slow.next
            fast=fast.next
        return slow