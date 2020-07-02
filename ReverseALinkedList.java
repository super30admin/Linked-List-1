// Time Complexity : O(n), n is number of nodes
// Space Complexity : O(1) for iterative and stack space for recursive solution
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :



//Iterative Solution
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null) return head;
        //if only one node in ll return the node
        if(head.next == null) {
            return head;
        }
        
        //create temp node pointing to head.next
        ListNode temp = head.next;
        //create prev node pointing to null
        ListNode prev = null;
        //copy first node (head) to null
        head.next = prev;  
        
        //do till temp.next == null
        while(temp.next!=null) { 
            //point prev to head
            prev = head;
            //point head to temp
            head = temp;
            //temp to temp.next/head.next
            temp = head.next;
            //reverse the head
            head.next = prev;
        } 
        //reverse of last node 
        prev = head;
        head = temp;
        head.next = prev;
        return head; 
    }
}

/*
Explanation with example :

 null 1->2->3->4->5->NULL
   p  h  t

head.next = prev
 null<-1  2->3->4->5->NULL
   p   h  t  
   
do till temp.next != null (to avoid null pointer exception)
while :
prev = head
null<-1   2->3->4->5->NULL
      ph  t 
      
head = temp
temp = head.next 
null<-1   2->3->4->5->NULL
      p   h  t 
      
head.next = prev
null<-1<-2  3->4->5->NULL
      p  h  t 
      
repeat...

to reverse last node : 
do this after loop (except temp = head.next, to avoid null pointer exception)
prev = head;
head = temp;
skip temp = head.next
head.next = prev;


return head, head points to last node of input
*/





//Recursive Solution
class Solution {
    public ListNode reverseList(ListNode head) {
        
        //base case, when head reaches last node, return head (its not added to the recursive stack)
        // as head.next == null condition is checked
        //return head to recursive call
        if(head == null || head.next == null) return head; 
        
        else {
            
            //create node curr pointing to head.next
            ListNode curr = head.next;
            //and call it recursivly, until it reaches base case (last node)
             
            //curr is pointed to the last node (head : base case, is returned)
            curr = reverseList(curr);
            
            //during pop, control starts from curr = reverseList(curr); 
            //st.pop () in recursion stack  (2nd last node)
            //head is at 2nd last node (at first pop)
            //reverse the node (curr (last node) points to 2nd last node after first pop) 
            head.next.next = head;
            head.next = null;
            
            //after each pop the curr is returned but curr still points to the last node
            // st.pop () happens until stack is empty
            //if stack is empty, recursion ends and result is returned
                     
            return curr;
       
            
        }    
    }
}

