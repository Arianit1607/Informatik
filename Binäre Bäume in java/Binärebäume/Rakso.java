package Binarytree;

public class Rakso {
    public static void main(String[] args) {
        BinaryTree<Integer> muab = new BinaryTree<Integer>();
        muab.setContent(5);
        muab.setLeftTree(new BinaryTree<>());
        muab.getLeftTree().setContent(3);
        muab.setRightTree(new BinaryTree<>());
        muab.getRightTree().setContent(9);
        muab.getRightTree().setLeftTree(new BinaryTree<>());
        muab.getRightTree().getLeftTree().setContent(6);
        muab.getRightTree().getLeftTree().setRightTree(new BinaryTree<>());
        muab.getRightTree().getLeftTree().getRightTree().setContent(7);
        muab.getRightTree().setRightTree(new BinaryTree<>(11));
        muab.getRightTree().getRightTree().setLeftTree(new BinaryTree<>());
        muab.getRightTree().getRightTree().getLeftTree().setContent(10);;
        System.out.println(muab.getRightTree().getRightTree().getLeftTree().getContent());
    }
}
