
// Time Complexity : O(n) one pass
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Delete n-th node from the end of the list

#include<iostream>
using namespace std;  
  
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
 };

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        if(head == NULL)
            return head;

        int count = 0;
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
        ListNode *fast = dummy;
        ListNode *slow = dummy;

        while(count <= n){
            fast = fast->next;
            count++;
        }

        while(fast != NULL){
            fast = fast->next;
            slow = slow->next;
        }

        slow->next = slow->next->next;
        return dummy->next;
    }
};
