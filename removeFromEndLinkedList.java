//Time Complexity: O(n) 
//Space complexity: O(2n)

public class removeFromEndLinkedList extends reverseLinkedList{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        //Get length of the list
        while(head != null){
            head = head.next;
            count++;
        }
        // System.out.println(count);
        ListNode res = null;
        if(count == 1 && count == n)
            return res;
        //Get position of element to be deleted
        count -= n; 
        // System.out.println(count);

        // if count is greater than 0 then keep n as 1 else delete first element and make n as 0
        if(count > 0){
            res = new ListNode(temp.val);
            n=1;
        }
        else{
            res = new ListNode(temp.next.val);
            n=0;
        }
        ListNode resTmp = res;
        head = temp;

        while (head.next != null){
            head = head.next;
            // if count and n are equal skip the element
            if(n != count){
                resTmp.next = new ListNode(head.val);
                resTmp = resTmp.next;
            }
            n++;
        }
        
        return res;
    }
}