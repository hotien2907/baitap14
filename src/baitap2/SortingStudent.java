package baitap2;

public class SortingStudent {

    public static Student[] insertionSort(Student[] students) {
            int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
        return students;
    }

    public static Student[] selectionSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (students[j].getScore() < students[minIndex].getScore()) {
                    minIndex = j;
                }
            }
            Student temp = students[minIndex];
            students[minIndex] = students[i];
            students[i] = temp;
        }
        return students;
    }

    public static Student[] bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (students[j].getScore() < students[j+1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        return students;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Alice", 85.0),
                new Student(2, "Bob", 70.5),
                new Student(3, "Charlie", 95.5),
                new Student(4, "David", 60.0),
                new Student(5, "Eve", 80.0)
        };

        System.out.println("Danh sách học viên trước khi sắp xếp:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }

        students = insertionSort(students.clone());
        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Insertion Sort:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }

        students = selectionSort(students.clone());
        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Selection Sort:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }

        students = bubbleSort(students.clone());
        System.out.println("\nDanh sách học viên sau khi sắp xếp bằng Bubble Sort:");
        for (Student student : students) {
            System.out.println("ID: " + student.getStudentId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}