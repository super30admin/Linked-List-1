  bool flag = false;
        ListNode *slow = head;
        ListNode *fast = head;
        if(head == NULL){
            return NULL;
        }

        while(fast!=NULL && fast->next!=NULL){

                slow = slow->next;
                fast = fast->next->next;

                if(slow==fast){
                    flag = true;
                    break;
                }
        }

        if(!flag){
            return NULL;
        }
        slow = head;

        while(slow!=fast){
                slow = slow->next;
                fast = fast->next;
        }

        return slow;


    }