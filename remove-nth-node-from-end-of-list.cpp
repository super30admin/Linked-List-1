/*This solution uses a two-pointer approach with a time complexity of O(N) and a space complexity of O(1). 
It iterates with two pointers, fast and slow, where fast moves ahead by n nodes. 
Then, both pointers move at the same pace until fast reaches the end. 
Finally, it adjusts the next pointer of the slow node to skip the nth node from the end, effectively removing it from the linked list.*/
#include<bits/stdc++.h>
using namespace std;
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
        ListNode* slow=head,*fast=head;
        for(int i=0;i<n;i++){
            fast=fast->next;
        }
        if(fast==nullptr)return head->next;
        while(fast->next){
            slow=slow->next;
            fast=fast->next;
        }
        slow->next=slow->next->next;
        return head;
    }
};