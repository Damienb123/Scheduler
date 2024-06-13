# Scheduler

## Table Contents
1. [Overview](#Overview)
2. [Features](#Features)
3. [Getting Started](#Getting-Started)
   - Prerequisites
   - Installation
6. [Project Structure](#Project-Structure)
7. [Usage](#Usage)
   - FIFO Scheduling
   - SJF Scheduling
   - Round Robin Scheduling
9. [Example Output](#Example-Output)
10. [Contributing](#Contributing)
11. [Acknowledgments](#Acknowledgments)

# Overview
- Simulated Round Robin, FIFO, SJF, and uni-programming operating system scheduling algorithm in Java.
- Utilized priority queue to efficiently translate FIFO algorithm to SJF.
- Used quantum counters to ensure round robin resource usage and prevent starvation.

# Features
- **Round Robin Scheduling**: Implements time-sharing technique using quantum counters to ensure fair CPU allocation.
- **FIFO Scheduling**: Processes tasks in the order they arrive.
- **SJF Scheduling**: Utilizes a priority queue to process the shortest tasks first.
- **Uni-programming**: Handles tasks sequentially without preemption.

## Getting Started

### Prequisites
- Java Development Kit (JDK) installed on your system.

### Installation
1. **Clone the Repository**
    ```bash
    git clone https://github.com/yourusername/scheduler-project.git
    cd scheduler-project
    ```

2. **Compile the Project**
    ```bash
    javac Main.java Scheduler.java Task.java
    ```

3. **Run the Project**
    ```bash
    java Main
    ```

# Project Structure
- **Main.java**: Contains the main method and initializes the tasks and schedulers.
- **Scheduler.java**: Implements the scheduling algorithms.
- **Task.java**: Represents a task with properties such as ID, arrival time, burst time, and priority.

## Usage

### FIFO Scheduling

The FIFO scheduling algorithm processes tasks in the order they arrive. The `fifoScheduling` method is called with a queue of tasks.

### SJF Scheduling

The SJF scheduling algorithm processes the shortest tasks first. The `sjfScheduling` method is called with a priority queue of tasks.

### Round Robin Scheduling

The Round Robin scheduling algorithm uses time-sharing with a specified quantum. The `roundRobinScheduling` method is called with a queue of tasks and a quantum value.

## Example Output
```plaintext
FIFO Scheduling:
Executing Task 1 with burst time 5
Executing Task 2 with burst time 3
Executing Task 3 with burst time 8

SJF Scheduling:
Executing Task 2 with burst time 3
Executing Task 1 with burst time 5
Executing Task 3 with burst time 8

Round Robin Scheduling:
Executing Task 1 for 2 units; remaining time: 3
Executing Task 2 for 2 units; remaining time: 1
Executing Task 3 for 2 units; remaining time: 6
Executing Task 1 for 2 units; remaining time: 1
Executing Task 2 for 1 units; task completed.
Executing Task 3 for 2 units; remaining time: 4
Executing Task 1 for 1 units; task completed.
Executing Task 3 for 2 units; remaining time: 2
Executing Task 3 for 2 units; task completed.
```

## Contributing
Contributions are welcome! Please submit a pull request or open an issue to discuss your ideas or report bugs.

## Acknowledgments
- The scheduling algorithms are inspired by classic operating system textbooks and resources.
- Special thanks to the open-source community for providing valuable tools and libraries.
