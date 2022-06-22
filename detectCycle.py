#Time complexity : O(n) i.e. n is the number of nodes in the linkedlist
#Space complexity : O(1)
#Did this code successfully run on Leetcode : Yes
#youtube : https://www.youtube.com/watch?v=j-m1Ijn_7DA
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        #for null condition
        if head == None:
            return None
        #creating slow and faster node pointer pointing at head
        slow = ListNode()
        fast = ListNode()
        slow = head
        fast = head
        #creating boolean variable for storing if the loop is found or not
        flag = False
        #creating for loop for odd and even nodes of the linkedlist
        #if odd nodes then fast.next = None
        #if even nodes then fast = None
        while fast != None and fast.next != None:
            #incrementing the slow pointer by speed 1
            slow = slow.next
            #incrementing fast pointer by speed 2
            fast = fast.next.next
            #when fast and slow will be pointing to same node we can say that the loop is present
            if slow == fast:
                flag = True
                break
            
        #if the cycle is not present then we will return null
        if not flag:
            return None
        else:
            #finding the index for from which the loop will start
            """Idea: let a = distance from head node to the loop staring head
            b = distance from a to the first meeting point of two pointers
            c= distcance from meeting point back to the node to the loop starting
            Putting distance of slow = distance of fast
            Distane by slow = 2*(a+b) where 2 would be the twice time taken by slow pointer to cover same distance as the fast
            Distance by fast = (a+b)+ (b+c) here fast pointer will travel whole linked list is a+b and then in loop it will meet slow pointer by travelling b+c
            2a + 2b = a+ 2b + c and we get a=c"""
            #so resetting the slow pointer again at the starting point so that slow will cover distance a and fast will cover distance  c to get starting node of the loop
            slow=head
            #loop will execute till slow and fast point to same node
            while slow!=fast:
                #moving both the pointer by speed 1
                slow = slow.next
                fast = fast.next
            return slow
