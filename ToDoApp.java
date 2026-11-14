import javax.swing.*;
import java.awt.*;

public class ToDoApp extends JFrame {
    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> taskList = new JList<>(listModel);
    private JTextField inputField = new JTextField(15);
    private JButton addBtn = new JButton("Add");
    private JButton delBtn = new JButton("Delete");

    public ToDoApp() {
        setTitle("My To-Do List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // --- UI Layout (Referenced from in-class PPT) ---
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Task:"));
        topPanel.add(inputField);
        topPanel.add(addBtn);
        add(topPanel, BorderLayout.NORTH);

        add(new JScrollPane(taskList), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(delBtn);
        add(bottomPanel, BorderLayout.SOUTH);

        // ==========================================================
        // 【Written by myself】添加任务的核心逻辑 (My own logic)
        // 使用 Lambda 表达式监听按钮点击，将输入框内容添加到 ListModel 中
        // ==========================================================
        addBtn.addActionListener(e -> {
            String task = inputField.getText().trim();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                inputField.setText("");
            }
        });

        // ==========================================================
        // 【Written by myself】删除任务的核心逻辑 (My own logic)
        // 获取选中的索引，若不为空，则从 ListModel 中删除该元素
        // ==========================================================
        delBtn.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ToDoApp();
    }
}
