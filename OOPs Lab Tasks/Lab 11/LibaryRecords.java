import java.awt.*;
import java.awt.event.*;

class LibraryRecords extends Frame implements ActionListener {
    Label lblBookId, lblTitle, lblAuthor, lblPublisher;
    TextField txtBookId, txtTitle, txtAuthor, txtPublisher;
    Button btnAdd, btnDelete, btnEdit, btnNext, btnBack, btnClear, btnSearch;

    String[][] data = new String[100][4];
    int index = -1, count = 0;

    LibraryRecords() {
        setTitle("Library Records Management");
        setLayout(null);

        lblBookId = new Label("Book ID:");
        lblTitle = new Label("Title:");
        lblAuthor = new Label("Author:");
        lblPublisher = new Label("Publisher:");

        txtBookId = new TextField();
        txtTitle = new TextField();
        txtAuthor = new TextField();
        txtPublisher = new TextField();

        btnAdd = new Button("Add");
        btnDelete = new Button("Delete");
        btnEdit = new Button("Edit");
        btnNext = new Button("Next");
        btnBack = new Button("Back");
        btnClear = new Button("Clear");
        btnSearch = new Button("Search");

        lblBookId.setBounds(50, 50, 80, 30);
        txtBookId.setBounds(150, 50, 150, 30);
        lblTitle.setBounds(50, 90, 80, 30);
        txtTitle.setBounds(150, 90, 150, 30);
        lblAuthor.setBounds(50, 130, 80, 30);
        txtAuthor.setBounds(150, 130, 150, 30);
        lblPublisher.setBounds(50, 170, 80, 30);
        txtPublisher.setBounds(150, 170, 150, 30);

        btnAdd.setBounds(30, 220, 60, 30);
        btnDelete.setBounds(100, 220, 60, 30);
        btnEdit.setBounds(170, 220, 60, 30);
        btnNext.setBounds(240, 220, 60, 30);
        btnBack.setBounds(310, 220, 60, 30);
        btnClear.setBounds(100, 260, 60, 30);
        btnSearch.setBounds(170, 260, 60, 30);

        add(lblBookId); add(txtBookId);
        add(lblTitle); add(txtTitle);
        add(lblAuthor); add(txtAuthor);
        add(lblPublisher); add(txtPublisher);
        add(btnAdd); add(btnDelete); add(btnEdit);
        add(btnNext); add(btnBack); add(btnClear); add(btnSearch);

        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnEdit.addActionListener(this);
        btnNext.addActionListener(this);
        btnBack.addActionListener(this);
        btnClear.addActionListener(this);
        btnSearch.addActionListener(this);

        setSize(450, 350);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAdd) {
            data[count][0] = txtBookId.getText();
            data[count][1] = txtTitle.getText();
            data[count][2] = txtAuthor.getText();
            data[count][3] = txtPublisher.getText();
            index = count;
            count++;
        } else if (ae.getSource() == btnDelete) {
            for (int i = 0; i < count; i++) {
                if (data[i][0].equals(txtBookId.getText())) {
                    for (int j = i; j < count - 1; j++) {
                        data[j] = data[j + 1];
                    }
                    count--;
                    clear();
                    break;
                }
            }
        } else if (ae.getSource() == btnEdit) {
            for (int i = 0; i < count; i++) {
                if (data[i][0].equals(txtBookId.getText())) {
                    data[i][1] = txtTitle.getText();
                    data[i][2] = txtAuthor.getText();
                    data[i][3] = txtPublisher.getText();
                    break;
                }
            }
        } else if (ae.getSource() == btnNext) {
            if (index < count - 1) {
                index++;
                displayCurrent();
            }
        } else if (ae.getSource() == btnBack) {
            if (index > 0) {
                index--;
                displayCurrent();
            }
        } else if (ae.getSource() == btnClear) {
            clear();
        } else if (ae.getSource() == btnSearch) {
            String id = txtBookId.getText();
            for (int i = 0; i < count; i++) {
                if (data[i][0].equals(id)) {
                    txtTitle.setText(data[i][1]);
                    txtAuthor.setText(data[i][2]);
                    txtPublisher.setText(data[i][3]);
                    index = i;
                    return;
                }
            }
            clear();
        }
    }

    void displayCurrent() {
        if (index >= 0 && index < count) {
            txtBookId.setText(data[index][0]);
            txtTitle.setText(data[index][1]);
            txtAuthor.setText(data[index][2]);
            txtPublisher.setText(data[index][3]);
        }
    }

    void clear() {
        txtBookId.setText("");
        txtTitle.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
    }
}
