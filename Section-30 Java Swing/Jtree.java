import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;


class MyJTree extends JFrame {
    MyJTree() {
        
        // Create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add child nodes to root
        root.add(child1);
        root.add(child2);

        // Create grandchild nodes
        DefaultMutableTreeNode grandchild1 = new DefaultMutableTreeNode("Grandchild 1");
        DefaultMutableTreeNode grandchild2 = new DefaultMutableTreeNode("Grandchild 2");

        // Add grandchild nodes to child1
        child1.add(grandchild1);
        child1.add(grandchild2);

        // Create the tree
        JTree tree = new JTree(root);

        // Add the tree to a scroll pane
        JScrollPane treeView = new JScrollPane(tree);

        // Add the scroll pane to the frame
        this.add(treeView);

        setLayout(new BorderLayout());


    }
}

public class Jtree {
    public static void main(String[] args) {
        MyJTree frame = new MyJTree();
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
