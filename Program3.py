#time complexity is: O(n)
#Space Complexity is: O(1)
#Program ran successfully on leetcode
#No issues while coding the program

# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution(object):
    def detectCycle(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if(head==None):
            return
        #initialising the required pointers
        self.flag=False
        self.slow=head
        self.fast=head
        #We will be writing conditions such that it can handle evan length and odd length linked lists
        while(self.fast!=None and self.fast.next!=None):
            #we will moving slow pointer by one step and fast pointer by two steps
            self.slow=self.slow.next
            self.fast=self.fast.next.next
            #If both slow and fast pointers meet, it means that there is a cycle in the linked list
            if(self.slow==self.fast):
                #Setting the flag to true
                self.flag=True
                break
        #We will be reassigning slow pointer to the start of the linked list
        self.slow=head
        if(self.flag==False): 
            return
        #We will be moving slow and fast by one step until both of them meet together
        while(self.slow!=self.fast):
                self.slow=self.slow.next
                self.fast=self.fast.next
        #Finally we will be returning the slow pointer
        return self.slow
