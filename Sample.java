//Problem 1: Reverse LinkedList
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Iterative Solution
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head == null || head.next==null) return head;
//         //Link initialization
//         ListNode prev = null;
//         ListNode current = head;
//         ListNode temp = head.next;

//         //reverses all links until n-1
//         while(temp!=null){
//             current.next=prev;
//             prev=current;
//             current=temp;
//             temp=temp.next;
//         }
//         //for final link
//         current.next=prev;
//         prev=current;
//         return prev;

//     }
// }

//recursive solution - O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode res = reverseList(head.next); //res is global scope variable, can be defined globally too.
        //System.out.println(res.val);
        head.next.next= head; // reversing the link
        head.next=null; //doing current next as null because we now traverse previous and not next.
        return res;
    }
}

//Problem 2: Remove Nth node from end of list
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    //single pass solution
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy= new ListNode(-1);
        dummy.next= head;
        int count=0;
        ListNode fast= dummy;
        ListNode slow= dummy;
        while(count<=n){  //slide fast to n elements, and then assign slow to head 
            fast=fast.next;
            count++;
        }
        //slide slow and fast pointers so that slow points to N-1 element(for removal) and fast points to null
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode temp = slow.next; //this is to mark the removal node next as null.
        slow.next=slow.next.next; //only this line could also have worked
        temp.next=null; //now we remove link of node to be removed.

        return dummy.next;
    }
}

//Problem 2: LinkedList Cycle 2
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean flag= false;
        ListNode slow = head;
        ListNode fast = head;
        //try to find end link of cycle
        while(fast!=null && fast.next !=null){ //while cycle doesnt complete
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){ //if found break
                flag=true; 
                break;
            }
        }
        if(!flag) return null; //if not found, means cycle does not exist, return

        // while(slow!=fast){
        //     slow=slow.next;
        //     fast=fast.next;
        // }
        // return flag;

        // while CYCLE HEAD is equidistant from cycle end point and HEAD, move slow OR fast pointer to head
        fast=head; 
        while(slow!=fast){ // slow and fast will meet at Cycle head
            slow=slow.next;
            fast=fast.next;
        }

        return slow; //return slow or fast!
    }
}