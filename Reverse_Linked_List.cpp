Recursive solution
Time Complexity-O(n)
Space Complexity-O(1) if recursive stack space is not considered or else it is O(h)
Did the code run on Leetcode? Yes

class Solution {
public:
    ListNode* reverselinkedlist(ListNode* curr,ListNode* prev)
    {
        if(curr==NULL)
        {
            return prev;
        }
        ListNode *a=curr->next;
        curr->next=prev;
        return reverselinkedlist(a,curr);
    }
    
     ListNode* reverseList(ListNode* head) {
        return reverselinkedlist(head,NULL);
    }
};