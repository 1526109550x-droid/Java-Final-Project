# Simple To-Do List (Java Swing)

## 1. Project Description
This project is a desktop To-Do List application developed using Java Swing. It allows users to easily add new tasks, delete completed tasks, and provides a clean user interface.

## 2. Core Technologies
- **UI Layout**: Implemented using `BorderLayout` and `FlowLayout`.
- **Core Components**: Used `JTextField` for input, `JButton` for actions, and `JList` for displaying the tasks.
- **Event Handling**: Used `ActionListener` to bind button click events.

## 3. Originality Statement
**I independently completed the UI layout and the core event listener logic for adding and deleting tasks.**
*(Note: The basic JFrame creation part refers to the in-class PPT examples).*

## 4. References (参考文献)

During the development of this project, I referred to the following materials:

1. **Course Lecture Slides**: Java Programming (2026-2), Chapter 11 & 12, Prof. Dongmahn Seo. (For basic UI layout and Swing components).
2. **Oracle Java Documentation**: *How to Use Lists* & *javax.swing.JList*. 
   Available at: [https://docs.oracle.com/javase/tutorial/uiswing/components/list.html](https://docs.oracle.com/javase/tutorial/uiswing/components/list.html)
3. **GeeksforGeeks**: *Java Swing | JList with examples* (For understanding the interaction between JList and DefaultListModel).

## 5. 运行结果与讨论 (Execution Results & Discussion)

<img width="978" height="702" alt="image" src="https://github.com/user-attachments/assets/6ebb2263-9637-4627-be68-a95b4ce4a74c" />

### 结果分析 (Analysis)
The application runs smoothly without any exceptions. The layout correctly aligns the input field and buttons at the top and bottom, while the `JList` occupies the central area with a functional scroll bar. The core event listeners (Add/Delete) work perfectly, demonstrating a solid understanding of the Swing event dispatch mechanism.
