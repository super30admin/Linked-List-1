package LeetCode;
import java.util.*;
public class LinkedListOne {
	
	  public class ListNode {
	      int val;
	      ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	
	//Reverse a linked List
	//TC : O(N)
	//SC : O(!)
	class Solution1 {
	    public ListNode reverseList(ListNode head) {
	        
	        if( head ==null || head.next == null)
	            return head;
	        
	         ListNode last = reverseList(head.next); 
	           head.next.next = head;
	           head.next = null;
	        return last;
	     }
	}
	
	
	//Remove Nth Node From End of List
	//TC : O(n)
	// SC : O(1)
	class Solution2 {
	    public ListNode removeNthFromEnd(ListNode head, int count) {
	        if(count ==1 && head == null || head.next == null)
	            return null;
	       
	        ListNode temp = head;
	        while(count > 0){
	            temp = temp.next;
	            count--;
	        }
	        ListNode slow = head;
	        while(temp!=null)
	        {
	            slow = slow.next;
	            temp=temp.next;
	        }
	        
	        temp = head;
	        
	        while(temp.next!=slow && temp!=slow)
	        temp = temp.next;
	        
	        if(temp == slow)
	         head = temp.next;
	        
	        temp.next = slow.next;
	        return head;
	    }
	}
	
	 //Linked List Cycle II
	//TC O(n)
	//SC O(n)
	public class Solution {
	    public ListNode detectCycle(ListNode head) {
	        HashSet<ListNode> set = new HashSet<>();
	        
	        while(head!=null){
	            if(set.contains(head))
	                return head;
	            set.add(head);
	            head=head.next;
	    
	        }
	        return head;
	    }
	}
	
	
}
