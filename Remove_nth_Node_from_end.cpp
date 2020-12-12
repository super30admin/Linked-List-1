// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yes

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *current = head;
        int count = 0;
        while(current!=NULL){
            count = count+1;
            current = current->next;
        }
        if(count==1){
            return NULL;
        }
        cout<<count;
        count = count-n;
        current = head;
        if(count==0){
            return current->next;    
        }
        while(count>1){
            count = count-1;
            current = current->next;
        }
        current->next = current->next->next;
        return head;
    }
};
