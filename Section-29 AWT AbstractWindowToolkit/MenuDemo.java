import java.awt.*;


class MenuFrame extends Frame {
    MenuBar menuBar;
    Menu fileMenu, editMenu, helpMenu;
    MenuItem newItem, openItem, saveItem, exitItem;
    MenuItem cutItem, copyItem, pasteItem;
    MenuItem aboutItem;

    public MenuFrame() {
        super("Menu Demo");

        menuBar = new MenuBar();

        fileMenu = new Menu("File");
        editMenu = new Menu("Edit");
        helpMenu = new Menu("Help");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");

        cutItem = new MenuItem("Cut");
        copyItem = new MenuItem("Copy");
        pasteItem = new MenuItem("Paste");

        aboutItem = new MenuItem("About");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        setMenuBar(menuBar);

        
        setLayout(null);
        
    }
}


public class MenuDemo {
    public static void main(String[] args) {
        MenuFrame f = new MenuFrame();
        f.setSize(400, 400);
        f.setVisible(true);
    }
}

//Notes:
// This program demonstrates the use of menus in Java AWT.
// It creates a menu bar with File, Edit, and Help menus.
// Each menu contains several menu items.
// The main method creates an instance of MenuFrame and sets its size and visibility.

//Tips:
// You can add action listeners to menu items to handle user interactions.
// You can also create submenus by adding Menu objects to other Menu objects.
// To customize the appearance of menus, you can use methods like setFont() and setBackground() on Menu and MenuItem objects.
// Remember to set the size and visibility of the Frame to see the menu bar.
