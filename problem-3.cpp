// 142. Linked List Cycle II
// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
using two pointers, slow and fast, initially both set to the head of the list. The fast pointer moves twice as fast as the slow pointer, 
and if they meet at some point within the list, it indicates the presence of a cycle. Then, resets the slow pointer to the head and 
moves both slow and fast pointers at the same pace until they meet again, which identifies the starting node of the cycle.
*/

ListNode *detectCycle(ListNode *head) {
    ListNode* slow = head;
    ListNode* fast = head;
    while(fast != NULL && fast->next != NULL)
    {
        slow = slow->next;
        fast = fast->next->next;
        if(slow == fast)
        {
            slow = head;
            while(slow != fast)
            {
                slow = slow->next;
                fast = fast->next;
            }
            return slow;
        }
    }
    return NULL;
        
}