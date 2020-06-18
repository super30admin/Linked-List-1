/*

    Time Complexity :  O(N)
    Space Complexity : O(1)
    is worked on leetcode : YES


*/

public class RemoveLastNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy =  new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
//         dummy node points to head, created for handling head removal
        
        dummy.next = head;
        
        int count = 0;
//         maintain size n window  and move fast pointer till counter reach nth 

        while(count <= n){
            fast = fast.next;
            count++;
        }
        //  and then move slow pointer by one and fast by one till fast reaches end
        //  now slow pointer will be at the node  before the node you want to delete

        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        // delete the node
        slow.next = slow.next.next;
        // return ddummy.next which is pointing to correct head all the time
        return dummy.next;
    }


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