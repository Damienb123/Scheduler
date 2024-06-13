/**
 * The Task class represents a task in the scheduling system.
 * Each task has an ID, arrival time, burst time, remaining time, and priority.
 */
public class Task implements Comparable<Task> {
    private int id; // Unique identifier for the task
    private int arrivalTime; // The time at which the task arrives in the system
    private int burstTime; // The total time required by the task to complete
    private int remainingTime; // The remaining time for the task to complete
    private int priority; // Priority of the task (used in SJF, lower value means higher priority)

    /**
     * Constructor to initialize a Task object.
     *
     * @param id           the unique identifier of the task
     * @param arrivalTime  the arrival time of the task
     * @param burstTime    the total burst time of the task
     * @param priority     the priority of the task
     */
    public Task(int id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.remainingTime = burstTime; // Initially, the remaining time is equal to the burst time
        this.priority = priority;
    }

    /**
     * Gets the unique identifier of the task.
     *
     * @return the task ID
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the arrival time of the task.
     *
     * @return the arrival time
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Gets the total burst time of the task.
     *
     * @return the burst time
     */
    public int getBurstTime() {
        return burstTime;
    }

    /**
     * Gets the remaining time for the task to complete.
     *
     * @return the remaining time
     */
    public int getRemainingTime() {
        return remainingTime;
    }

    /**
     * Sets the remaining time for the task to complete.
     *
     * @param remainingTime the remaining time
     */
    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    /**
     * Gets the priority of the task.
     *
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Compares this task with another task based on priority.
     * This is used in PriorityQueue to order tasks by priority.
     *
     * @param other the other task to compare with
     * @return a negative integer, zero, or a positive integer as this task's priority
     *         is less than, equal to, or greater than the other task's priority
     */
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}
