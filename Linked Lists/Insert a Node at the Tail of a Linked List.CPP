SinglyLinkedListNode* insertNodeAtTail(SinglyLinkedListNode* head, int data) {
    
    if(!head){
        SinglyLinkedListNode * newNode=new SinglyLinkedListNode(data);
        head=newNode;        
          
    }
    else{
        SinglyLinkedListNode * newNode=new SinglyLinkedListNode(data);
        SinglyLinkedListNode * temp=head;
        while((temp->next)){
            temp=temp->next;
        }
        temp->next=newNode;
        newNode->next=nullptr;
        
     }
return head;
}
