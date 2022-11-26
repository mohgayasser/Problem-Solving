
DoublyLinkedListNode* sortedInsert(DoublyLinkedListNode* llist, int data){   
    DoublyLinkedListNode * newNode=new DoublyLinkedListNode(data);
    DoublyLinkedListNode * temp=llist;
    //if the list is empty
    if(!llist) return newNode;
    //at the first position
    else if(llist->data>newNode->data) {
        temp->prev=newNode;
        newNode->next=temp;
        return newNode;
    }
    while (temp->next) {
        if(temp->data<newNode->data){
            temp=temp->next; 
        }else {
            break;
        }
    }
    //if the position is the last one
    if(!temp->next&&temp->data<newNode->data){
        newNode->prev=temp;
        temp->next=newNode;
        newNode->next=NULL;
    }else {
            temp->prev->next=newNode;
            newNode->prev=temp->prev;
            newNode->next=temp;
            temp=temp->next;
           
    }
    return llist;
}
