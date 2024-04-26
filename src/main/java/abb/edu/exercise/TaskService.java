package abb.edu.exercise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task newTask) {
        Task task = taskRepository.findById(id).orElse(null);
        if(task != null) {
            task.setId(newTask.getId());
            task.setDescription(newTask.getDescription());
            task.setTitle(newTask.getTitle());
            task = taskRepository.save(task);
        }
        return task;
    }
    public List<Task> createTasks(List<Task> tasks) {
        return taskRepository.saveAll(tasks);
    }
    public void deleteTasks(Long Id) {
        taskRepository.deleteById(Id);
    }
}
