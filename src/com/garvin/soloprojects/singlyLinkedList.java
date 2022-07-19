package com.garvin.soloprojects;

public class singlyLinkedList {
    node head;
    singlyLinkedList(){
        head=null;
    }
    singlyLinkedList(node n){
        head=n;
    }
    node nodeExists(int k){
        node temp= null;
        node ptr=head;
        while(ptr!=null){
            if(ptr.key== k){
                temp = ptr;
            }
            ptr=ptr.next;
        }
        return temp;
    }

    void appendNode(node n){
        if(nodeExists(n.key)!=null){
            System.out.println("Node Exists \n Value: "+n.key+"append another node with different key value");
        }
        else {
            if (head==null){
                head = n;
                System.out.println("appended");
                }
            else{
                node ptr=head;
                while(ptr.next!=null){
                    ptr.next=n;
                    System.out.println("Appended");
                }
            }
        }
    }

    void prependNode(node n){
        if(nodeExists(n.key)!=null){
            System.out.println("Node Exists \n Value: "+n.key+"append another node with different key value");
        }
        else{
            n.next=head;
            head=n;
            System.out.println("Preponed");
        }
    }

    void insertNodeAfter(int k,node n){
        node ptr = nodeExists(k);
        if(ptr==null){
            System.out.println("No node exists with key value k:"+k);
        }
        else {
            if(nodeExists(n.key)!=null){
                System.out.println("already exists, value :" + n.key);
            }
            else
            {
                n.next=ptr.next;
                ptr.next=n;
                System.out.println("inserted");
            }
        }
    }

    void deleteNodeByKey(int k){
        if(head == null){
            System.out.println("Already Empty");
        }
        else{
            if(head.key==k){
                head=head.next;
                System.out.println("node unlinked from keys value");
            }
            else {
                node temp=null;
                node prevptr=head;
                node currentptr=head.next;
                while (currentptr!=null){
                    if(currentptr.key==k){
                        temp=currentptr;
                        currentptr=null;
                    }
                    else{
                        prevptr=prevptr.next;
                        currentptr=currentptr.next;
                    }
                }
                if (temp!=null){
                    prevptr.next=temp.next;
                    System.out.println("Unlinked with keys value");
                }
                else {
                    System.out.println("node doesn't exist with key values");
                }
            }
        }
    }

    void updateNodeByKey(int k,int d){
        node ptr = nodeExists(k);
        if(ptr==null){
            ptr.data = d;
            System.out.println("Updated");
        }
        else {
            System.out.println("Doesn't exist with key value k : ");
        }
    }

    void printList(){
        if(head==null){
            System.out.println("No nodes");
        }
        else {
            System.out.println("Singly Linked List Values : ");
            node temp=head;
            while (temp!=null){
                System.out.println(" ("+temp.key+","+ temp.data+") ->");
                temp=temp.next;
            }
        }
    }

}