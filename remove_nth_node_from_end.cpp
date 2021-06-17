// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        if(!head)
            return NULL;
        
        if(head->next == NULL)
            return NULL;
        
        ListNode* curr = head;
        ListNode* prev;
        
        int len = 0;

        // Traverse and Determine Length        
        while(curr)
        {
            len++;
            curr = curr->next;
        }
        
        cout << len << endl;
        
        int len2 = len - n;
        
        cout << len2 << endl;
        
        curr = head;
        
        // Delete only if nth node from end available
        if(len2 > 0)
        {
            // Traverse till the node to be deleted
            for(int i = 0; i < len2; i++)
            {
                prev = curr;
                curr = curr->next;
            }
            
            if(curr)
                prev->next = curr->next;
            
            delete(curr);
        }
        else
        {
            head = head->next;
        }
        
        return head;
    }
};