import java.awt.*;
import java.awt.event.*;

class InventorySystem extends Frame implements ActionListener {
    Label lblItemId, lblItemName, lblQuantity, lblPrice;
    TextField txtItemId, txtItemName, txtQuantity, txtPrice;
    Button btnAdd, btnDelete, btnEdit, btnNext, btnBack, btnClear, btnSearch;

    String[][] data = new String[100][4];
    int index = -1, count = 0;

    InventorySystem() {
        setTitle("Inventory Management System");
        setLayout(null);

        lblItemId = new Label("Item ID:");
        lblItemName = new Label("Item Name:");
        lblQuantity = new Label("Quantity:");
        lblPrice = new Label("Price:");

        txtItemId = new TextField();
        txtItemName = new TextField();
        txtQuantity = new TextField();
        txtPrice = new TextField();

        btnAdd = new Button("Add");
        btnDelete = new Button("Delete");
        btnEdit = new Button("Edit");
        btnNext = new Button("Next");
        btnBack = new Button("Back");
        btnClear = new Button("Clear");
        btnSearch = new Button("Search");

        lblItemId.setBounds(50, 50, 80, 30);
        txtItemId.setBounds(150, 50, 150, 30);
        lblItemName.setBounds(50, 90, 80, 30);
        txtItemName.setBounds(150, 90, 150, 30);
        lblQuantity.setBounds(50, 130, 80, 30);
        txtQuantity.setBounds(150, 130, 150, 30);
        lblPrice.setBounds(50, 170, 80, 30);
        txtPrice.setBounds(150, 170, 150, 30);

        btnAdd.setBounds(30, 220, 60, 30);
        btnDelete.setBounds(100, 220, 60, 30);
        btnEdit.setBounds(170, 220, 60, 30);
        btnNext.setBounds(240, 220, 60, 30);
        btnBack.setBounds(310, 220, 60, 30);
        btnClear.setBounds(100, 260, 60, 30);
        btnSearch.setBounds(170, 260, 60, 30);

        add(lblItemId); add(txtItemId);
        add(lblItemName); add(txtItemName);
        add(lblQuantity); add(txtQuantity);
        add(lblPrice); add(txtPrice);
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
            data[count][0] = txtItemId.getText();
            data[count][1] = txtItemName.getText();
            data[count][2] = txtQuantity.getText();
            data[count][3] = txtPrice.getText();
            index = count;
            count++;
        } else if (ae.getSource() == btnDelete) {
            for (int i = 0; i < count; i++) {
                if (data[i][0].equals(txtItemId.getText())) {
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
                if (data[i][0].equals(txtItemId.getText())) {
                    data[i][1] = txtItemName.getText();
                    data[i][2] = txtQuantity.getText();
                    data[i][3] = txtPrice.getText();
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
            String id = txtItemId.getText();
            for (int i = 0; i < count; i++) {
                if (data[i][0].equals(id)) {
                    txtItemName.setText(data[i][1]);
                    txtQuantity.setText(data[i][2]);
                    txtPrice.setText(data[i][3]);
                    index = i;
                    return;
                }
            }
            clear();
        }
    }

    void displayCurrent() {
        if (index >= 0 && index < count) {
            txtItemId.setText(data[index][0]);
            txtItemName.setText(data[index][1]);
            txtQuantity.setText(data[index][2]);
            txtPrice.setText(data[index][3]);
        }
    }

    void clear() {
        txtItemId.setText("");
        txtItemName.setText("");
        txtQuantity.setText("");
        txtPrice.setText("");
    }
}