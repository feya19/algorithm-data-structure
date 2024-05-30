package Tree.Praktikum2;

public class BinaryTreeMain10 {
    public static void main(String[] args) {
        BinaryTreeArray10 bta = new BinaryTreeArray10(10);

        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);

        System.out.print("PreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");

        System.out.print("InOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");
    }
}
