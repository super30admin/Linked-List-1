// ## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

//Did this code run on leetcode :Yes

// Time complexity: O(n)
// Space complexity: O(1) 
// Idea- to maintain 2 pointers- slow and fast , detect cycle starting pt from Floyd Warshall algo


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
        
        if(head ==NULL){
            return head;
        }
        

        ListNode* fast = head;
        ListNode* slow = head;
        
        bool hasCycle = false ; 
        
        while(fast != NULL && fast->next!= NULL){
            
            slow= slow->next;
            fast= fast->next->next;
            
            if( slow==fast){
                hasCycle = true;
                break;
            }
        }
        
        
        //if no cycle
        if( !hasCycle){
            
            return NULL;
        }
        
        
        //cycle - find start - Floyd Warshall
        
        slow= head;
        
        while ( slow!= fast){
            slow = slow->next;
            fast = fast->next;
            // fast = fast->next->next;
        }
        
        return slow;
    }
};