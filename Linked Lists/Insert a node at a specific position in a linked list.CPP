
SinglyLinkedListNode* insertNodeAtPosition(SinglyLinkedListNode* llist, int data, int position) {
    if(!llist){
        
        SinglyLinkedListNode*node=new SinglyLinkedListNode(data);
        llist=node;
        return node;
        
    }
    SinglyLinkedListNode *node=new SinglyLinkedListNode(data);
    
    SinglyLinkedListNode *temp=llist;
    
    int counter=0;
    
    while (counter<position-1) {
        temp=temp->next;
        counter++;
    }
    node->next=temp->next;
    temp->next=node;
    return llist;
}
