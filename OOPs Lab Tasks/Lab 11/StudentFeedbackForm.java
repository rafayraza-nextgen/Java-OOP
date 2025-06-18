import java.awt.*;
import java.awt.event.*;

class StudentFeedbackForm extends Frame implements ActionListener {
    Label lblStudentId, lblStudentName, lblCourse, lblFeedback;
    TextField txtStudentId, txtStudentName, txtCourse;
    TextArea txtFeedback;
    Button btnAdd, btnDelete, btnEdit, btnNext, btnBack, btnClear, btnSearch;

    String[][] data = new String[100][4];
    int index = -1, count = 0;

    StudentFeedbackForm() {
        setTitle("Student Feedback Form");
        setLayout(null);

        lblStudentId = new Label("Student ID:");
        lblStudentName = new Label("Student Name:");
        lblCourse = new Label("Course:");
        lblFeedback = new Label("Feedback:");

        txtStudentId = new TextField();
        txtStudentName = new TextField();
        txtCourse = new TextField();
        txtFeedback = new TextArea();

        btnAdd = new Button("Add");
        btnDelete = new Button("Delete");
        btnEdit = new Button("Edit");
        btnNext = new Button("Next");
        btnBack = new Button("Back");
        btnClear = new Button("Clear");
        btnSearch = new Button("Search");

        lblStudentId.setBounds(50, 50, 80, 30);
        txtStudentId.setBounds(150, 50, 200, 30);
        lblStudentName.setBounds(50, 90, 80, 30);
        txtStudentName.setBounds(150, 90, 200, 30);
        lblCourse.setBounds(50, 130, 80, 30);
        txtCourse.setBounds(150, 130, 200, 30);
        lblFeedback.setBounds(50, 170, 80, 30);
        txtFeedback.setBounds(150, 170, 200, 60);

        btnAdd.setBounds(30, 250, 60, 30);
        btnDelete.setBounds(100, 250, 60, 30);
        btnEdit.setBounds(170, 250, 60, 30);
        btnNext.setBounds(240, 250, 60, 30);
        btnBack.setBounds(310, 250, 60, 30);
        btnClear.setBounds(100, 290, 60, 30);
        btnSearch.setBounds(170, 290, 60, 30);

        add(lblStudentId); add(txtStudentId);
        add(lblStudentName); add(txtStudentName);
        add(lblCourse); add(txtCourse);
        add(lblFeedback); add(txtFeedback);
        add(btnAdd); add(btnDelete); add(btnEdit);
        add(btnNext); add(btnBack); add(btnClear); add(btnSearch);

        btnAdd.addActionListener(this);
        btnDelete.addActionListener(this);
        btnEdit.addActionListener(this);
        btnNext.addActionListener(this);
        btnBack.addActionListener(this);
        btnClear.addActionListener(this);
        btnSearch.addActionListener(this);

        setSize(450, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAdd) {
            data[count][0] = txtStudentId.getText();
            data[count][1] = txtStudentName.getText();
            data[count][2] = txtCourse.getText();
            data[count][3] = txtFeedback.getText();
            index = count;
            count++;
        } else if (ae.getSource() == btnDelete) {
            for (int i = 0; i < count; i++) {
                if (data[i][0].equals(txtStudentId.getText())) {
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
                if (data[i][0].equals(txtStudentId.getText())) {
                    data[i][1] = txtStudentName.getText();
                    data[i][2] = txtCourse.getText();
                    data[i][3] = txtFeedback.getText();
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
            String id = txtStudentId.getText();
            for (int i = 0; i < count; i++) {
                if (data[i][0].equals(id)) {
                    txtStudentName.setText(data[i][1]);
                    txtCourse.setText(data[i][2]);
                    txtFeedback.setText(data[i][3]);
                    index = i;
                    return;
                }
            }
            clear();
        }
    }

    void displayCurrent() {
        if (index >= 0 && index < count) {
            txtStudentId.setText(data[index][0]);
            txtStudentName.setText(data[index][1]);
            txtCourse.setText(data[index][2]);
            txtFeedback.setText(data[index][3]);
        }
    }

    void clear() {
        txtStudentId.setText("");
        txtStudentName.setText("");
        txtCourse.setText("");
        txtFeedback.setText("");
    }
}