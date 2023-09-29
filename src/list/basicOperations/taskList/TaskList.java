package list.basicOperations.taskList;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    // Attribute
    private List<Task> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(String description) {
        taskList.add(new Task(description));
    }

    public void removeTask(String description) {
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task t : taskList) {
            if(t.getDescription().equalsIgnoreCase(description)) {
                tasksToRemove.add(t);
            }
        }
        taskList.removeAll(tasksToRemove);
    }

    public int getTotalNumberOfTasks() {
        return taskList.size();
    }

    public void getDescriptionsOfTasks() {
        System.out.println(taskList);
    }

    public static void main(String[] args) {
        TaskList taskList = new TaskList();

        System.out.println("Número de tarefas: " + taskList.getTotalNumberOfTasks());

        taskList.addTask("Tarefa 01");
        taskList.addTask("Tarefa 68");
        taskList.addTask("Tarefa 02");
        taskList.addTask("Tarefa 03");
        taskList.addTask("Tarefa 04");
        taskList.addTask("Tarefa 05");
        taskList.addTask("Tarefa 06");
        System.out.println("Número de tarefas: " + taskList.getTotalNumberOfTasks());

        taskList.removeTask("Tarefa 06");
        System.out.println("Número de tarefas: " + taskList.getTotalNumberOfTasks());

        taskList.getDescriptionsOfTasks();
    }
}
