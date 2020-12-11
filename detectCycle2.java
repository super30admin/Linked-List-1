public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return head;
        
        ListNode intersect = findIntersect(head);
        if(intersect == null)
            return intersect;
        
        ListNode p1 = head;
        ListNode p2 = intersect;
        
        while(p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return p1;
    }
    
    private ListNode findIntersect(ListNode head){
        ListNode tort = head;
        ListNode hare = head;
        
        while(hare.next != null && hare.next.next != null){
            tort = tort.next;
            hare = hare.next.next;
            
            if(tort == hare)
                return tort;
        }
        return null;
    }
}

Time complexity : O(n)
Space complexity : O(1)