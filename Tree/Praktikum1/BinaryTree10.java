package Tree.Praktikum1;

public class BinaryTree10 {
    Node10 root;

    public BinaryTree10() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if (isEmpty()) {
            root = new Node10(data);
        } else {
            Node10 current = root;
            while (true) {
                if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node10(data);
                        break;
                    }
                } else if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node10(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    public void addRekursif(int data) {
        root = addRekursif(root, data);
    }
    
    private Node10 addRekursif(Node10 current, int data) {
        if (current == null) {
            return new Node10(data);
        }
    
        if (data < current.data) {
            current.left = addRekursif(current.left, data);
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data);
        }
    
        return current;
    }

    public boolean find(int data) {
        boolean result = false;
        Node10 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public int findMin() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMin(root);
    }
    
    private int findMin(Node10 current) {
        return current.left == null ? current.data : findMin(current.left);
    }
    
    public int findMax() {
        if (isEmpty()) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMax(root);
    }
    
    private int findMax(Node10 current) {
        return current.right == null ? current.data : findMax(current.right);
    }

    public void printLeaves() {
        printLeaves(root);
    }
    
    private void printLeaves(Node10 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeaves(node.left);
            printLeaves(node.right);
        }
    }

    public int countLeaves() {
        return countLeaves(root);
    }
    
    private int countLeaves(Node10 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }
    

    public void traversePreOrder(Node10 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    public void traversePostOrder(Node10 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    public void traverseInOrder(Node10 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public Node10 getSuccessor(Node10 del) {
        Node10 successor = del.right;
        Node10 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left; 
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        Node10 parent = root;
        Node10 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node10 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
