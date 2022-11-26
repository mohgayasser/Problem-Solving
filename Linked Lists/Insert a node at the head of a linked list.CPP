SinglyLinkedListNode* insertNodeAtHead(SinglyLinkedListNode* llist, int data) {
SinglyLinkedListNode * newNode;
    if(!llist){
      newNode  =new SinglyLinkedListNode(data);
         
          
    }
    else{
        newNode=new SinglyLinkedListNode(data);
        newNode->next=llist;
     
     }
return newNode;
}
