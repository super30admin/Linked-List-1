class Solution {
    // // method 1 we could traverse the list and extract all nodes into array
    // // then, recreate one new list
    // // Time complexity: O(n)
    // // Space complexity:O(n)
    // public ListNode reverseList(ListNode head) {
    //     if(head == null)
    //         return null;
    //     int len = 0;
    //     ListNode cur = head;
    //     // traverse the list to get the length ot list
    //     while(cur != null){
    //         len++;
    //         cur = cur.next;
    //     }
    //     System.out.println(len);
    //     // build the array we need
    //     int[] arr = new int[len];
    //     int i = 0;
    //     while(head != null){
    //         arr[i] = head.val;
    //         head = head.next;
    //         i++;
    //     }
    //     System.out.print(Arrays.toString(arr));
    //     // reverse the list with array
    //     ListNode dummy = new ListNode(0);
    //     ListNode temp = dummy;
    //     for(int j = len - 1; j >= 0; j--){
    //         ListNode node = new ListNode(arr[j]);
    //         temp.next = node;
    //         temp = temp.next;
    //     }
    //     return dummy.next;
    // }
    
    
    // // method 2: we could directly operate on the list without extra space
    // // Time complexity: O(n)
    // // Space complexity: O(1)
    // public ListNode reverseList(ListNode head) {
    //     if(head == null)
    //         return null;
    //     // create prev node
    //     ListNode prev = null;
    //     ListNode cur = head;
    //     while(cur != null){
    //         // here we need use temp to store the cur pointer
    //         ListNode temp = cur.next;
    //         // reverse listnode, here we lost the cur.next, so we store it before
    //         cur.next = prev;
    //         // move prev pointer forward
    //         prev = cur;
    //         // move cur pointer with the temp pointer
    //         cur = temp;
    //     }
    //     return prev;
    // }
    
    // method 3: we could use recursive method to operate the list directly
    // Time complexity: O(n)
    // Space complexity: O(n)
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        // recursively to the end 
        ListNode cur = reverseList(head.next);
        // reverse list
        head.next.next = head;
        // tail node
        head.next = null;
        return cur;
    }


}


















