# Bank-Simulator-Using-Java-OOPS
A secure, fully encapsulated multi-user Java bank account vault and interactive ATM console system utilizing dynamic ArrayList profile persistence, modular business methods, and strict defensive data constraints.


Banking & ATM Module

A secure, fully encapsulated multi-user banking simulation and automated teller machine (ATM) application built using Java. This project demonstrates intermediate object-oriented architecture, data persistence via dynamic arrays, and defensive programming to protect entity states from runtime exploits.

## 🌟 Software Engineering Milestones Achieved
* **Advanced Encapsulation:** Protected absolute account financial states by declaring internal variables `private`. Direct external modifications are blocked completely.
* **Defensive Input Validation:** Engineered in-method business safeguards that block invalid inputs (such as negative deposits or negative withdrawals) before data mutations can occur.
* **Modular Code Separation:** Streamlined the application flow by decoupling complex logic away from the `main` loop and into structural helper methods (`Register()` and `login()`).
* **Nested Session State Machine:** Managed complex application states by embedding a transactional ATM sub-loop safely inside a parent database collection engine.

---

## 🛠️ System Architecture & Logic

### 1. `BankAccount.java` (The Core Model)
Maintains absolute data integrity for individual client accounts.
* **Protected Fields:** `accountholder` (String) and `balance` (Double).
* **Safe Read Gateways:** Public getters (`getName()` and `getBalance()`) deliver secure, read-only strings and numeric streams to the terminal menu.
* **Security Protocols:**
  * `deposit(double money)`: Validates that the input is positive before running the ledger adder routine (`money > 0`).
  * `withdraw(double money)`: Executes a rigorous three-pronged check (`balance > 0 && money <= balance && money > 0`) to enforce overdraft protection and prevent negative currency extraction fraud.

### 2. `Main.java` (The Application Engine)
Orchestrates multi-user records, login handshakes, and input/output routing streams.
* **Dynamic Persistence Layer:** Utilizes an `ArrayList<BankAccount>` framework acting as a runtime memory database to host an infinite queue of active customer profiles.
* **The Registration Pipeline (`Register`):** Prompts the operator for credentials and enforces a strict **minimum starting deposit boundary of ₹100** before saving the object reference.
* **The Authentication Engine (`login`):** Scans the dynamic database arrays sequentially. If a case-insensitive username match is confirmed, the application safely triggers a unique, persistent transaction sub-session loop for that specific user.

---

## 🎮 Features & Core Business Rules
1. **The Anti-Theft Guard:** Passing negative inputs to transaction parameters halts execution instantly with an invalid input alert.
2. **The Overdraft Blocker:** Attempting to pull funds exceeding the verified balance fires an immediate "Insufficient Funds" notice.
3. **The Multi-Profile Safe Route:** Uses a targeted loop breaker pattern to evaluate user objects independently, allowing flawless logging sequences across variable database sets.

---

## ⚙️ Compilation & Local Deployment

1. Clone or download the source code files: `BankAccount.java` and `Main.java`.
2. Open a command terminal inside your project directory.
3. Compile the Java compilation units:
   ```bash
   javac BankAccount.java Main.java
   ```
4. Fire up the compiled environment:
   ```bash
   java Main
   ```
