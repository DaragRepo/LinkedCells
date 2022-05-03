package javaapplication1;

/**
 *
 * @author Darag
 */
public class Main {

    public static void main(String[] args) {

        Object arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Object arr2[][] = {
            {"hello", "it's", "me"},
            {"i", "was", "wondering"},
            {"if", "after", "all"}
        };

        LinkedCells l = new LinkedCells(arr);

        Node n[][] = l.getInstance();

        System.out.println(n[0][0].right.bottom.data);


        l.setArray(arr2);

        n = l.getInstance();

        System.out.println(n[0][0].bottom.right.data);

        System.out.println(n[1][0].right.right.data);

    }

}
