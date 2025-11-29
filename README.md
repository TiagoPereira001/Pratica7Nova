# Object-Oriented Banking System

A Java-based simulation of a banking system designed to practice core Object-Oriented Programming (OOP) concepts, specifically **Inheritance**, **Polymorphism**, and **Collection management**.

## 📂 Project Structure

### 1. Base Logic (`Conta`)
The foundation of the system is the `Conta` class, which handles standard bank operations:
* **Encapsulation:** Protects balance (`saldo`) and account details.
* **Base Operations:** Implements standard `depositar` (deposit) and `levantar` (withdraw) methods with basic validation.

### 2. Specialized Accounts (Inheritance)
The system extends the base logic into two specific account types:
* **`ContaCorrente` (Checking Account):** Overrides the `levantar` method to allow withdrawals beyond the current balance up to a defined overdraft limit (`limite`).
* **`ContaPoupanca` (Savings Account):** Introduces an interest rate (`taxaJuros`) and a specific method `adicionarJuros()` to grow the balance.

### 3. Bank Management (`Banco`)
The `Banco` class acts as the central controller using an `ArrayList<Conta>` to manage multiple accounts:
* **Batch Processing:** Iterates through all accounts to perform maintenance.
* **Type Checking:** Uses `instanceof` to distinguish between account types (applying interest to Savings accounts vs. checking overdraft status for Checking accounts).
* **Dividends:** Ability to deposit a specific amount into all accounts simultaneously via `Pagardividendo`.

## 🛠️ How to Run

1.  Open the project in your Java IDE (IntelliJ IDEA recommended).
2.  Navigate to the `src` folder.
3.  Run one of the demonstration files:
    * **`Demo2.java`**: Basic initialization of the Bank and creation of different account types.
    * **`Demo3.java`**: A full workflow simulation including transactions, batch updates, and printing the final state of accounts.

---
*Created by [Tiago Pereira](https://github.com/TiagoPereira001)*
