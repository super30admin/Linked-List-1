TC:O(n)
SC:O(1)

Failed in Leetcode


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr, prev, succeed;
        
        curr = head.next;
        prev = head;
        succeed = curr.next;
        head.next = null;
        while(succeed!= null){
            System.out.print("curr "+ curr.val);
            System.out.print("succeed "+ succeed.val);
            curr.next = prev;
            prev = curr;
            curr = succeed;
            succeed = succeed.next;
            System.out.print("curr "+ curr.val);
            System.out.print("succeed "+ succeed.val);
            
            
            
        }
        return curr;
        
    }
}
