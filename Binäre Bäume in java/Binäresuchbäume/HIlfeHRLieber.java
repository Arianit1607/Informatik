public class HIlfeHRLieber {
    public static void main(String[] args) {
        BinarySearchTree<Ah> gehweg = new BinarySearchTree<Ah>();
        gehweg.insert(new Ah(5));//warum?
        gehweg.insert(new Ah(3));
        gehweg.insert(new Ah(9));
        gehweg.insert(new Ah(6));
        gehweg.insert(new Ah(11));
        gehweg.insert(new Ah(7));
        gehweg.insert(new Ah(10));
        System.out.println(gehweg.search(new Ah(7)).getInt());
        System.out.println(gehweg.getRightTree().getRightTree().getLeftTree().getContent().getInt());
    }

}
