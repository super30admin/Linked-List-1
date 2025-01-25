// https://leetcode.com/problems/remove-nth-node-from-end-of-list
Given the head of a linked list, remove the nth node from the end of the list and return its head.
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Approach 1: Brute force approach
//In this I am finding the length of the list and then subtracting the n from it. now I am moving to the node prior to the node we have to remove and then do 
// node.next=node.next.next
// But the problem will be when we have to remove 1st node as we don't have previous node we are introducing an temporary node
// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Base case
        if(head==null){
            return null;
        }
        //Temp node to find the length of the list
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        //Finding the position to remove
        int pos=cnt-n;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        temp=dummy;
        //Iterating to the node before to the node we have to remove
        while(pos>0){
            temp=temp.next;
            pos--;
        }
        temp.next=temp.next.next;
        //at the end we will be returning the head which is dummy.next
        return dummy.next;

    }
}

//Approach 2: As it's asking us to do in a singele pass
// In this we are maintaining a fast and slow pointer. first we are moving a fast pointer until it's greater than n. then we are moving fast and slow both the pointers by 1 until fast is null
// by this we will be at the position before the node which we have to remove
// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        int count=0;
        while(count<=n){
            count++;
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;

    }
}