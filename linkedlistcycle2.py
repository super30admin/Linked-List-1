# // Time Complexity : O(N) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach

## we need ot find the point where the cycle starts. This is an exmplae of rhe hare and tortoise problem with little bit of math. 
## we start with a fast and slow pointer, where fast moves by 2 steps and slow by 1 . wherever the meet that is going to be a part of cycle
## now we have another dummy node starting from head. and now we start a loop where slow and dummy try to meet
## the point where they meet is the start of the circle.

class solution:

    def cycle(self, head):
        if not head:
            return None

        dummy = head
        slow = head
        fast = head
        while fast != None or fast.next != None:
            fast = fast.next.next   
            slow = slow.next
            if fast == slow:
                break

        if fast == None or fast.next == None:
            return None

        while dummy!= slow:
            dummy = dummy.next
            slow = slow.next
        
        return slow