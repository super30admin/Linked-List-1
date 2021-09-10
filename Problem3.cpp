// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Not really


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

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
        if(head == NULL || head->next == NULL) return NULL;  // null case
        ListNode* fast = head;  // setting fast & slow pointers
        ListNode* slow = head;
        while(fast!=NULL && fast->next !=NULL)  // fast will move 2x slow and if they cross, break
        {
            fast = fast->next->next;  // updating fast
            slow = slow->next;
            if(fast == slow) break;
        }
        if(fast != slow) return NULL;  // not a cycle
        fast = head;
        while(fast!=slow){  // the point at which they meet is where cycle begins
            fast= fast->next;
            slow = slow->next;
        }
            
        return fast;  
    }
};