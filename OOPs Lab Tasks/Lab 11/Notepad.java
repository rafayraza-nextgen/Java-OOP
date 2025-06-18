import java.awt.*;
import java.awt.event.*;
import java.io.*;

class NotepadApp extends Frame implements ActionListener {
    TextArea textArea;
    MenuItem newItem, openItem, saveItem, exitItem;

    NotepadApp() {
        setTitle("Simple Notepad");
        setSize(500, 400);

        textArea = new TextArea();
        add(textArea);

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");

        newItem = new MenuItem("New");
        openItem = new MenuItem("Open");
        saveItem = new MenuItem("Save");
        exitItem = new MenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);

        setMenuBar(menuBar);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == newItem) {
            textArea.setText("");
        } else if (ae.getSource() == openItem) {
            FileDialog fd = new FileDialog(this, "Open", FileDialog.LOAD);
            fd.setVisible(true);
            try {
                File file = new File(fd.getDirectory(), fd.getFile());
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                textArea.setText("");
                while ((line = br.readLine()) != null) {
                    textArea.append(line + "\n");
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Open error");
            }
        } else if (ae.getSource() == saveItem) {
            FileDialog fd = new FileDialog(this, "Save", FileDialog.SAVE);
            fd.setVisible(true);
            try {
                File file = new File(fd.getDirectory(), fd.getFile());
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write(textArea.getText());
                bw.close();
            } catch (Exception e) {
                System.out.println("Save error");
            }
        } else if (ae.getSource() == exitItem) {
            dispose();
        }
    }
}