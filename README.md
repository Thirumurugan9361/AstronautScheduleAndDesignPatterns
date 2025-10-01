# Astronaut Daily Schedule Organizer Programming Exercise & Design Patterns Project

This repository contains my **Educational Initiative assignment** with two major exercises:

* **Exercise 1:** Java Design Pattern Demos
* **Exercise 2:** Astronaut Daily Schedule Organizer Simulation

The project demonstrates **Object-Oriented Programming (OOP)**, **Design Patterns**, and **real-world problem solving in Java** using a Maven project structure.

---

## Exercises Overview

### Exercise 1 – Design Pattern Demos

**Behavioral Patterns:**

* **Observer** – Occupancy Notification System (notifies devices when room state changes)
* **Strategy** – Payment Methods (Credit Card, PayPal)

**Structural Patterns:**

* **Adapter** – Media Player (mp3, vlc, mp4 support)
* **Decorator** – Shape Feature Enhancement (adds red border to shapes)

**Creational Patterns:**

* **Factory** – Shape Factory (creates Circle, Square, etc.)
* **Singleton** – Logger / Configuration Manager (single instance access)

> Each pattern has its own folder containing:
> `Main` class → Entry point
> `Classes` → Implementation of the pattern
> **README.md**  → Overview, Problem, Solution, Example, Output

---

### Exercise 2 – Astronaut Daily Schedule Organizer

**Overview:**
A simulation program that helps astronauts plan and manage their **daily activities** in a space station.
It demonstrates **OOP concepts**, **scheduling algorithms**, and **user interaction** in Java.

**Features:**

* Add, edit, and remove daily tasks (e.g., experiments, exercise, meals).
* View the daily schedule in a clear, organized format.
* Automatic conflict detection for overlapping tasks.
* Notifications for task reminders (simulated in console).

**Folder Structure Example:**

```
exercise-2-astronaut-schedule
├── MainSchedule.java
├── Task.java
├── ScheduleManager.java
├── NotificationSystem.java
├── Utils.java
```

**Sample Input / Actions:**

```
Add Task: Exercise | 07:00 - 08:00
Add Task: Experiment | 08:30 - 10:30
Add Task: Meal | 12:00 - 12:30
View Schedule
```

**Sample Output:**

```
Astronaut Daily Schedule:
07:00 - 08:00 : Exercise
08:30 - 10:30 : Experiment
12:00 - 12:30 : Meal
No conflicts detected.
```

---

## Key Highlights

* Demonstrates **OOP principles** and **SOLID design**.
* Modular, maintainable, and reusable code structure.
* Practical examples suitable for **placements and interviews**.
