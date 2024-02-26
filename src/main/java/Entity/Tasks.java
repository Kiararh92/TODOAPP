package Entity;

import jakarta.persistence.*;

@Entity
public class Tasks {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "taskNumber")
    private int taskNumber;
    @Basic
    @Column(name = "subject")
    private String subject;

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tasks tasks = (Tasks) o;

        if (taskNumber != tasks.taskNumber) return false;
        if (subject != null ? !subject.equals(tasks.subject) : tasks.subject != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = taskNumber;
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        return result;
    }
}
