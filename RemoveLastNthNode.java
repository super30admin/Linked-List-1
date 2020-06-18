/*

    Time Complexity :  O(N)
    Space Complexity : O(1)
    is worked on leetcode : YES


*/

public class RemoveLastNthNode {

    public ListNode removeNthFromEnd_UsingLength(ListNode head, int n) {
        
        
        if(head == null ) return null;
        // if (head.val == n )  return null;
        ListNode temp = head;
        int count = 0;
        int len = length (temp);
//          when you are deleting head
        if(n ==  len) return head.next;
        
        int diff = len - n;
        // get the difference
        while (count <diff - 1 ){
            temp = temp.next;
            count=count+1;
        }
       
        
        temp.next = temp.next.next;
        
        
        return head;
        
    }
    private int length(ListNode head){
        int len = 0;
        while (head != null){
            len +=1;
            head = head.next;
        }
        return len;
    }
    
}