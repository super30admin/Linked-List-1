TC : O(n)
SC : O(1)

Runtime: 8 ms, faster than 17.19% of C++ online submissions for Remove Nth Node From End of List.
Memory Usage: 8.5 MB, less than 93.42% of C++ online submissions for Remove Nth Node From End of List.


I did this already long back.
This is a two pass solution.

Find the length of LL, get the position by removing n from the size of LL.
In second pass point the pointer to nth node to its next pointer




class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *ptr,*currnode,*prevnode;
        ptr=head;
        int count=0;
        while(ptr!=NULL)
        {   count++;
         ptr=ptr->next;
        }
        if (count ==1){
            head=NULL;
            return head;
        }
        int pos=count-n+1;
        if(pos==1){
            head=head->next;
            return head;
        }
        count=0;
        currnode=head;
        
        
        while(currnode!=NULL)
        {   
            count++;
            if (count == pos){
                prevnode->next=currnode->next;
                
            }
            prevnode=currnode; 
            currnode=currnode->next;

        }


        return head;
    }
};
