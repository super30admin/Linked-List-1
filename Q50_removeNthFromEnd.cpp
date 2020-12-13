//  ## Problem 

// ## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

//Did this code run on leetcode :Yes

// Time complexity: O(n)
// Space complexity: O(1) 
// Idea- to maintain 3 pointers - prev, curr ,future



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

//Soln without freeing extra unnecessary pointers
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        if(head==NULL || head->next == NULL)
            return NULL;
        
        //trick of slow and fast pointer
        
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        
        ListNode* start = dummy;
        ListNode* end = dummy;
        
        while(n >=0){
            start = start->next;
            n--;
        }
        
        while( start != NULL){
            start = start->next;
            end = end->next;
        }
        
        
               
        end->next = end->next->next;
        // if(end->next!= NULL)
        //     end->next->next = NULL;
        return dummy->next;
    }
};



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

//freeing up the pointers with extra
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        
        if(head==NULL || head->next == NULL)
            return NULL;
        
        //trick of slow and fast pointer
        
        ListNode* dummy = new ListNode(-1);
        dummy->next = head;
        
        ListNode* start = dummy;
        ListNode* end = dummy;
        
        while(n >=0){
            start = start->next;
            n--;
        }
        
        while( start != NULL){
            start = start->next;
            end = end->next;
        }
        
        
        ListNode* extra = end->next;
        
        end->next = end->next->next;
        
        
        if(extra!= NULL){
            extra->next = NULL;
            
        }
       
        head= dummy->next;
        return head;
        // return dummy->next;
    }
};