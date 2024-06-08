package Binarytree;

public class Oskar {
        public static void main(String[] args) {
            BinaryTree<Integer> baum = new BinaryTree<Integer>(5,
            new BinaryTree<>(3),
            new BinaryTree<>(9,
                new BinaryTree<>(6,
                    new BinaryTree<>(),
                    new BinaryTree<>(7)),
                new BinaryTree<>(11,
                    new BinaryTree<>(10),
                    new BinaryTree<>())));
            System.out.println(baum.getRightTree().getRightTree().getLeftTree().getContent());
        }
}
