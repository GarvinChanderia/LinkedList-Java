package com.garvin.soloprojects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        singlyLinkedList s = new singlyLinkedList();
        Scanner sc= new Scanner(System.in);
        int option;
        int key1, k1, data1;
        do {
            System.out.println("\nWhat operation do you want to perform? Select Option number. Enter 0 to exit.");
            System.out.println("1. appendNode()");
            System.out.println("2. prependNode()");
            System.out.println("3. insertNodeAfter()");
            System.out.println("4. deleteNodeByKey()");
            System.out.println("5. updateNodeByKey()");
            System.out.println("6. print()");
            System.out.println("7. Clear Screen");

            option=sc.nextInt();
            node n1 = new node();

            switch (option) {
                case 0:
                    break;

                case 1:
                    System.out.println("Append Node Operation \nEnter key & data of the Node to be Appended");
                    key1=sc.nextInt();
                    data1 = sc.nextInt();
                    n1.key = key1;
                    n1.data = data1;
                    s.appendNode(n1);
                    break;

                case 2:
                    System.out.println("Append Node Operation \nEnter key & data of the Node to be Appended");
                    key1=sc.nextInt();
                    data1 = sc.nextInt();
                    n1.key = key1;
                    n1.data = data1;
                    s.prependNode(n1);
                    break;

                case 3:
                    System.out.println("Insert Node After Operation \nEnter key of existing Node after which you want to Insert this New node: ");
                    k1=sc.nextInt();
                    System.out.println("Enter key & data of the New Node first: ");
                    key1=sc.nextInt();
                    data1=sc.nextInt();
                    n1.key = key1;
                    n1.data = data1;
                    s.insertNodeAfter(k1, n1);
                    break;

                case 4:
                    System.out.println("Delete Node By Key Operation - \nEnter key of the Node to be deleted: ");
                    k1=sc.nextInt();
                    s.deleteNodeByKey(k1);
                    break;

                case 5:
                    System.out.println("Update Node By Key Operation - \nEnter key & NEW data to be updated");
                    key1=sc.nextInt();
                    data1=sc.nextInt();
                    s.updateNodeByKey(key1, data1);
                    break;

                case 6:
                    s.printList();

                    break;
                case 7:
                    System.out.print ("\033 [H\033 [2J");
                    System.out.flush ();
                    break;
                default:
                    System.out.println("Enter Proper Option number ");
            }

        } while (option != 0);

    }
}
