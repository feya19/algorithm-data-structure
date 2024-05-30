package Tree.Praktikum1;

public class BinaryTreeMainTugas10 {
    public static void main(String[] args) {
        BinaryTree10 bt = new BinaryTree10();
        
        bt.addRekursif(6);
        bt.addRekursif(4);
        bt.addRekursif(8);
        bt.addRekursif(3);
        bt.addRekursif(5);
        bt.addRekursif(7);
        bt.addRekursif(9);

        System.out.print("InOrder Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println();

        System.out.print("PreOrder Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println();

        System.out.print("PostOrder Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println();

        System.out.println("Min : " + bt.findMin());
        System.out.println("Max : " + bt.findMax());

        System.out.print("Node leaf : ");
        bt.printLeaves();
        System.out.println();

        System.out.println("Total leaf: " + bt.countLeaves());
    }
}
