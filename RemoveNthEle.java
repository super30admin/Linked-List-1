/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr= head;
        HashMap< Integer, ListNode> map = new HashMap<>();
        int i=1;
        while(curr.next!= null){
            map.put( i, curr);
            curr= curr.next;
            i++;
        }
       System.out.println(i);
        if(i-n==0){
          head=head.next;  
        } 
        else{
            curr= map.get(i-n);
        curr.next= curr.next.next;
        }
        return head;
    }
}

//time complexity- O(n)
//space complexity - O(n)