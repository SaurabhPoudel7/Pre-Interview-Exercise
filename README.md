# 🛒 Checkout System – Java 21 (TDD)

This is a **Java 21** checkout system implemented with **Test-Driven Development (TDD)**.  
The shop sells only **Apples** and **Oranges** with special offers applied.

---

## Problem Statement

- Apples cost **£0.60**  
- Oranges cost **£0.25**  
- Input: List of scanned items (e.g. `[Apple, Apple, Orange, Apple]`)  
- Output: Total cost (e.g. `£2.05`)  

### Offers
- **Buy One Get One Free (BOGOF)** on Apples  
- **3 for the Price of 2** on Oranges  

---

## Steps Completed

### Step 1: Shopping Cart
- Basic total calculation with **no offers**
- Commit tagged as: `step-1`

### Step 2: Simple Offers
- Added **Apple BOGOF** and **Orange 3-for-2** logic
- Commit tagged as: `step-2`

---

## TDD Approach

This project was built using the **Red-Green-Refactor** TDD cycle:
1. Write a failing test (`test:` commits)
2. Write the minimum code to pass (`feat:` commits)
3. Refactor for clarity (`refactor:` commits)
4. Repeat until complete

---

## Tech Stack

- **Java 21** (modern `switch` expressions)
- **Maven** (build tool)
- **JUnit 5** (testing)
- **Git** (version control, tagged commits)

---

## ▶️ How to Run

### Run Tests
```bash
mvn clean test
