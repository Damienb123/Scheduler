import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;

/**
 * The Main class demonstrates the usage of different scheduling algorithms.
 */
public class Main {

    public static void main(String[] args) {
        // Create queues for different scheduling algorithms
        Queue<Task> fifoQueue = new LinkedList<>(); // Queue for FIFO scheduling
        PriorityQueue<Task> sjfQueue = new PriorityQueue<>(); // PriorityQueue for SJF scheduling
        Queue<Task> rrQueue = new LinkedList<>(); // Queue for Round Robin scheduling

        // Add tasks to the FIFO queue
        fifoQueue.add(new Task(1, 0, 5, 1));
        fifoQueue.add(new Task(2, 1, 3, 1));
        fifoQueue.add(new Task(3, 2, 8, 1));

        // Add tasks to the SJF queue
        sjfQueue.add(new Task(1, 0, 5, 5));
        sjfQueue.add(new Task(2, 1, 3, 3));
        sjfQueue.add(new Task(3, 2, 8, 8));

        // Add tasks to the Round Robin queue
        rrQueue.add(new Task(1, 0, 5, 1));
        rrQueue.add(new Task(2, 1, 3, 1));
        rrQueue.add(new Task(3, 2, 8, 1));

        // Create an instance of the Scheduler
        Scheduler scheduler = new Scheduler();

        // Execute FIFO scheduling
        System.out.println("FIFO Scheduling:");
        scheduler.fifoScheduling(fifoQueue);

        // Execute SJF scheduling
        System.out.println("\nSJF Scheduling:");
        scheduler.sjfScheduling(sjfQueue);

        // Execute Round Robin scheduling
        System.out.println("\nRound Robin Scheduling:");
        int quantum = 2; // Define the time quantum for Round Robin scheduling
        scheduler.roundRobinScheduling(rrQueue, quantum);
    }
}