import java.awt.*;
import java.awt.event.*;
import java.util.*;

class StudentAdmission extends Frame implements ActionListener {
    Label lblId, lblName, lblAddress, lblContact;
    TextField txtId, txtName, txtAddress, txtContact;
    Button btnAdd, btnDelete, btnEdit, btnNext, btnBack;
    ArrayList<String[]> students = new ArrayList<>();
    int currentIndex = -1;

    StudentAdmission() {
        setTitle("Student Admission Form");
        setLayout(null);

        lblId = new Label("ID:");
        lblName = new Label("Name:");
        lblAddress = new Label("Address:");
        lblContact = new Label("Contact:");

        txtId = new TextField();
        txtName = new TextField();
        txtAddress = new TextField();
        txtContact = new TextField();

        btnAdd = new Button("Add");
        btnDelete = new Button("Delete");
        btnEdit = new Button("Edit");
        btnNext = new Button("Next");
        btnBack = new Button("Back");

        lblId.setBounds(50, 50, 80, 30);
        txtId.setBounds(150, 50, 150, 30);
        lblName.setBounds(50, 90, 80, 30);
        txtName.setBounds(150, 90, 150, 30);
        lblAddress.setBounds(50, 130, 80, 30);
        txtAddress.setBounds(150, 130, 150, 30);
        lblContact.setBounds(50, 170, 80, 30);
        txtContact.setBounds(150, 170, 150, 30);

        btnAdd.setBounds(30, 220, 60, 30);
        btnDelete.setBounds(100, 220, 60, 30);
        btnEdit.setBounds(170, 220, 60, 30);
        btnNext.setBounds(240, 220, 60, 30);
        btnBack.setBounds(310, 220, 60, 30);

        add(lblId); add(txtId);
        add(lblName); add(txtName);
        add(lblAddress); add(txtAddress);
        add(lblContact); add(txtContact);
        add(btnAdd); add(btnDelete); add(btnEdit); add(btnNext); add(btnBack);

        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnEdit.addActionListener(this);
        btnNext.addActionListener(this);
        btnBack.addActionListener(this);

        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAdd) {
            String[] student = { txtId.getText(), txtName.getText(), txtAddress.getText(), txtContact.getText() };
            students.add(student);
            currentIndex = students.size() - 1;
            System.out.println("Added");
        } else if (ae.getSource() == btnDelete && currentIndex >= 0) {
            students.remove(currentIndex);
            if (students.size() > 0) {
                currentIndex = 0;
                displayStudent(currentIndex);
            } else {
                clear();
                currentIndex = -1;
            }
        } else if (ae.getSource() == btnEdit && currentIndex >= 0) {
            String[] student = { txtId.getText(), txtName.getText(), txtAddress.getText(), txtContact.getText() };
            students.set(currentIndex, student);
        } else if (ae.getSource() == btnNext && currentIndex < students.size() - 1) {
            currentIndex++;
            displayStudent(currentIndex);
        } else if (ae.getSource() == btnBack && currentIndex > 0) {
            currentIndex--;
            displayStudent(currentIndex);
        }
    }

    void displayStudent(int index) {
        String[] student = students.get(index);
        txtId.setText(student[0]);
        txtName.setText(student[1]);
        txtAddress.setText(student[2]);
        txtContact.setText(student[3]);
    }

    void clear() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtContact.setText("");
    }
}
