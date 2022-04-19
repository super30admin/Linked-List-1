#linked-list-cycle-ii

# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no



def detectCycle( head):
    slow=head
    fast=head
    cycle=False
    while(fast!=None and fast.next!=None):          #move slow by 1, and fast by 2. If there is a cycle, at a time, slow will equal to fast
        slow=slow.next
        fast=fast.next.next
        if(slow==fast):                             #is slow==fast, then theres a cycle, so break
            cycle=True
            break
    slow=head
    if(cycle):
        while(slow!=fast):                          #to find the starting point of the cycle, you just need to move slow and fast both by 1, and whenever they meet is the starting point
            slow=slow.next
            fast = fast.next
    else:
        return None
    return fast