import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

/**
 * The Scheduler class implements different scheduling algorithms.
 */
public class Scheduler {
    
    /**
     * First In, First Out (FIFO) Scheduling.
     * This method processes tasks in the order they arrive.
     *
     * @param tasks the queue of tasks to be scheduled
     */
    public void fifoScheduling(Queue<Task> tasks) {
        while (!tasks.isEmpty()) {
            Task task = tasks.poll();
            System.out.println("Executing Task " + task.getId() + " with burst time " + task.getBurstTime());
            // Simulate execution
            // No preemption in FIFO, execute until completion
        }
    }
    
    /**
     * Shortest Job First (SJF) Scheduling.
     * This method processes tasks based on their burst time, starting with the shortest.
     *
     * @param tasks the priority queue of tasks to be scheduled
     */
    public void sjfScheduling(PriorityQueue<Task> tasks) {
        while (!tasks.isEmpty()) {
            Task task = tasks.poll();
            System.out.println("Executing Task " + task.getId() + " with burst time " + task.getBurstTime());
            // Simulate execution
            // No preemption in SJF, execute until completion
        }
    }
    
    /**
     * Round Robin Scheduling.
     * This method processes tasks in a cyclic order, allowing each task to execute for a fixed time slice (quantum).
     *
     * @param tasks   the queue of tasks to be scheduled
     * @param quantum the time slice each task is allowed to execute before moving to the next task
     */
    public void roundRobinScheduling(Queue<Task> tasks, int quantum) {
        while (!tasks.isEmpty()) {
            Task task = tasks.poll();
            int remainingTime = task.getRemainingTime();
            if (remainingTime > quantum) {
                task.setRemainingTime(remainingTime - quantum);
                System.out.println("Executing Task " + task.getId() + " for " + quantum + " units; remaining time: " + task.getRemainingTime());
                tasks.add(task); // Re-add to the queue
            } else {
                System.out.println("Executing Task " + task.getId() + " for " + remainingTime + " units; task completed.");
            }
        }
    }
}
