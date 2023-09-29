package list.basicOperations.taskList;

public class Task {
    // Attribute
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description ;
    }
}
