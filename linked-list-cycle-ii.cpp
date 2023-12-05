/*The code is implementing Floyd's Tortoise and Hare algorithm to detect and find the start of a cycle in a linked list. 
It uses two pointers, slow and fast, moving at different speeds. If there is a cycle, the two pointers will eventually meet. 
After detecting the cycle, it resets one pointer to the head and moves both pointers one step at a time until they meet again, 
determining the start of the cycle. 
Time complexity is O(N), where N is the number of nodes in the linked list
Space complexity is O(1).*/
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
        ListNode *slow=head,*fast=head;
        bool flag=false;
        while(fast&&fast->next){
            slow=slow->next;
            fast=fast->next->next;
            if(slow==fast){
                flag=true;
                break;
            }
        }
        if(!flag)return NULL;
        slow=head;
        while(slow!=fast){
            slow=slow->next;
            fast=fast->next;
        }
        return fast;
    }
};