package cat.urv.deim.asm.labs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SkipList list = new SkipList();
        Scanner scan = new Scanner(System.in);
        int elements = scan.nextInt();
        // haceerlo funcion porque es create list
        System.out.println("\nInsert number of elements:\n");
        int i=0;
        while (i < elements) {
            int numeroAleatorio;
            list.insert(numeroAleatorio = (int) (Math.random() * 1000 + 1));
            i = i + 1;
        }

        list.print();

        char ch;
        do {
            System.out.println("\nSkipList List Operations\n");
            System.out.println("1. insert");
            System.out.println("2. search");
            System.out.println("3. clear");
            System.out.println("3. elements");
            System.out.println("Number of elements\n");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    list.insert(scan.nextInt());
                    elements=elements+1;
                    list.print();
                    break;
                case 2:
                    System.out.println("Search ");
                    System.out.println(list.search(scan.nextInt()));
                    break;
                case 3:
                    System.out.println("Insert element to delete\n");
                    elements=elements-1;
                    list.delete(scan.nextInt());
                    list.print();
                    break;
                case 4:
                    System.out.println("Number of elements\n");
                    System.out.println(elements);
                    break;

                default:
                    System.out.println("Wrong Entry \n ");
                    break;
            }


            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        }while (ch == 'Y'|| ch == 'y');
    }
}
