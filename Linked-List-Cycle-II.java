// ## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

// Do not modify the linked list.

// Example 1:

// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.

// Approach 1 - Bruteforce Approach
// In this approach we will use hashset and stone the reference i.e nodes in that. As we know references cannot be 
// same of two nodes but values can.
// Time Complexity = O(n)
// Space Complexity = O(n)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //Base Condition check
        if(head == null){
            return null;
        }
        //Hashset Declared
        HashSet<ListNode> set=new HashSet<>();
        //Iterating over an linkedlist
        while(head.next!=null){
            //If it contains then it will return the start of the cycle only
            if(set.contains(head)){
                return head;
            }
            //If not then it will add in Hashset
            else{
                set.add(head);
                head=head.next;
            }
        }
        //At the end if not found then it will return null
        return null;
    }
}


//Approach 2: Optimized Approach
// In this approach we will maintain an 2 pointers Fast and Slow pointer. We will move fast pointer by 2 and slow pointer by 1
// If both the pointers meet then there is a cycle else there is no cycle. If there is a cycle then we have to find now the starting 
// point of the cycle so for that we will rewind one pointer let's take it as a Fast pointer and we will keep slow pointer
// at the same where both the pointers met. Now we will move the both by 1 and the point when both will meet again will be the starting point

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        boolean isCycle=false;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                isCycle=true;
                break;
            }

        }
        if(isCycle){
            fast=head;
            while(fast!=slow){
                fast=fast.next;
                slow=slow.next;
            }
            return fast;
        }
        return null; 
    }
    
}
