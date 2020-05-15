// Time Complexity : O(n);  n is number of nodes in list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Iterative solution
// 1. Maintain and previous and current node
// 2. Traverse through LL and swap next and previous of current node
// 3. Advance current node till last node and return previous as head of reversed list since it'll point to last node

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
	ListNode* reverseList(ListNode* head) {
	    if(!head || !head->next)
	        return head;
	    ListNode* prev=nullptr, *curr=head;
	    while(curr!=nullptr){
	        ListNode* temp=curr->next;
	        curr->next=prev;
	        
	        prev=curr;
	        curr=temp;
	    }
	    return prev;
	}
};