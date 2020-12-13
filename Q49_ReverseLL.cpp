//  ## Problem 1

// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/

//Did this code run on leetcode :Yes

// Time complexity: O(n)
// Space complexity: O(1) (iterative), O(n) (recursive)
// Idea- iterative and recursive implementation


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

//Iterative solution
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        ListNode *prev = NULL;
        ListNode *curr = head;
        ListNode *future = NULL;
        
        if(curr==  NULL || curr->next==NULL){
            return curr;
        }
        while( curr->next!= NULL){
            future= curr->next;
            curr->next= prev;
            
            prev=curr;
            curr= future;
            
        }
        curr->next=prev;
        return curr;
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

//Recursive soln
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        if(head ==NULL || head->next == NULL)
            return head;
            
        ListNode* reversed = reverseList(head->next);
        head->next->next= head;
        head->next = NULL;
        return reversed; 
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


//Recursion -> own stack
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        if(head ==NULL || head->next == NULL)
            return head;
            
        stack<ListNode*> s1;
        
        while(head->next != NULL){
            s1.push(head);
            head= head->next;
        }
        
        ListNode* reversed = head;
        while(!s1.empty()){
            head = s1.top();
            s1.pop();
            head->next->next = head;
            head->next =NULL;
           
        }
        
        return reversed;
    }
};