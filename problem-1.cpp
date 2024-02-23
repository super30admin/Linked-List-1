// 206. Reverse Linked List
// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
checks if the current node is either NULL or the last node in the list, in which case it returns the node itself. 
Otherwise, recursively calls the function on the next node, effectively moving towards the end of the list. 
Upon returning from the recursive calls, then adjusts the pointers to reverse the list, ensuring the last node becomes the new head.


*/


// recursive approach
ListNode* reverseList(ListNode* head) { 
        if(head == NULL || head->next == NULL)
            return head;
        ListNode* p = reverseList(head->next);
        head->next->next = head;
        head->next = NULL;    
        return p;
}