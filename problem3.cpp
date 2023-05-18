// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// we use slow fast pointers and if we find a match (slow==fast) that means there is a cycle in the linkedlist.
// we start two points one from begining and one from matched pointer location, we move 1:1 with both pointers and 
// we get a match( pointer1==pointer2) and this match is the point of intersection.

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        if(head == NULL || head->next==NULL) return NULL;
        ListNode* slow = head;
        ListNode* fast = head;
        bool isCyclic = false;
        while(fast!=NULL && fast->next!=NULL)
        {
            fast = fast->next->next;
            slow = slow->next;
            if(slow==fast){
                isCyclic = true;
                break;
            }
        }
        if(!isCyclic){
            return NULL;
        }
        fast = head;
        while(fast!=slow)
        {
            fast = fast->next;
            slow = slow->next;
        }
        return fast;
    }
};