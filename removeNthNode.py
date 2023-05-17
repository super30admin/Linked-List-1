#Time Complexity: O(n)
#Space complexity: O(1)

class Solution:
    def removeNthFromEnd(self, head, n):

        dummy = head
        length = self.linkedListLength(head)
        nthNodeMinusOne = length - n

        if(nthNodeMinusOne == 0 and length == 0):
            return None
        elif(nthNodeMinusOne == 0):
            head = head.next
            return head

        i = 1

        while(head != None):
            if(i == nthNodeMinusOne):
                if(head.next.next != None):
                    head.next = head.next.next
                    head = head.next
                else:
                    head.next = None
                    head = head.next
            else:
                head = head.next
            i+=1

        return dummy

    def linkedListLength(self, head):
        if head == None:
            return 0
        
        return 1 + self.linkedListLength(head.next)