
# 🚀 QaBrainsAutomationPlaywright

A robust End-to-End Test Automation Framework built using **Playwright + Java + Cucumber BDD + TestNG + Maven** for scalable UI automation testing.

Designed with industry-standard automation architecture to support:

* Cross-browser testing
* BDD feature execution
* Regression & smoke testing
* Reusable Page Object Model (POM)
* CI/CD integration readiness
* Advanced reporting

---

# 📌 Project Overview

This framework automates core web application functionalities using modern QA automation practices.

The project follows:

* ✅ Page Object Model (POM)
* ✅ Behavior Driven Development (BDD)
* ✅ Scalable test architecture
* ✅ Modular reusable components
* ✅ Playwright browser automation
* ✅ Cucumber feature execution
* ✅ TestNG test orchestration

---

# 🛠️ Tech Stack

| Technology                        | Purpose                 |
| --------------------------------- | ----------------------- |
| Java                              | Programming Language    |
| Playwright                        | Browser Automation      |
| Cucumber                          | BDD Framework           |
| TestNG                            | Test Execution          |
| Maven                             | Build Management        |
| Extent Reports / Cucumber Reports | Reporting               |
| Git & GitHub                      | Version Control         |
| Jenkins                           | CI/CD Integration       |
| Eclipse IDE                       | Development Environment |

---

# 📂 Project Structure

```bash
QaBrainsAutomationPlaywright
│
├── src/test/java
│   ├── stepdefinitions
│   ├── runners
│   ├── pages
│   ├── utilities
│   └── hooks
│
├── src/test/resources
│   └── features
│
├── target
│   └── cucumber-reports
│
├── pom.xml
└── README.md
```

---

# ✅ Features Covered

## 🔐 Authentication

* Login
* Logout
* Forgot Password
* Registration

## 🛒 E-Commerce Functionalities

* Add products to cart
* Update product quantity
* Search products
* Invalid product validation
* Checkout flow

## 🧪 Test Suites

* Smoke Test Suite
* Regression Test Suite

---

# 🧩 Framework Design Highlights

## ✔️ Page Object Model (POM)

Separates page locators and test logic for better maintainability.

## ✔️ Reusable Components

Common utility methods are centralized for:

* Browser setup
* Wait handling
* Screenshot capture
* Test data handling

## ✔️ BDD with Cucumber

Readable feature files written in Gherkin syntax:

```gherkin
Feature: Regression Test Suite

Scenario: Add multiple products to cart
Given User launches the application
When User adds products to cart
Then Products should be added successfully
```

---

# ▶️ How to Run the Project

## Prerequisites

Install the following:

* Java JDK 21+
* Maven
* Eclipse / IntelliJ
* Node.js
* Playwright Browsers

---

# 🔧 Installation

## Clone Repository

```bash
git clone https://github.com/yourusername/QaBrainsAutomationPlaywright.git
```

## Navigate to Project

```bash
cd QaBrainsAutomationPlaywright
```

## Install Dependencies

```bash
mvn clean install
```

## Install Playwright Browsers

```bash
mvn exec:java -e -Dexec.mainClass=com.microsoft.playwright.CLI -Dexec.args="install"
```

---

# ▶️ Execute Tests

## Run All Tests

```bash
mvn test
```

## Run Smoke Tests

```bash
mvn test -Dcucumber.filter.tags="@smoke"
```

## Run Regression Tests

```bash
mvn test -Dcucumber.filter.tags="@regression"
```

---

# 📊 Reporting

After execution, reports are generated under:

```bash
target/cucumber-reports/
```

Open:

```bash
cucumber-reports.html
```

---

# 📈 Sample Execution Result

```text
14 PASSED
1 FAILED
93% PASSED
15 EXECUTED
```

---

# ❌ Sample Failure Validation

```text
java.lang.AssertionError:
No products found in cart after adding
expected [true] but found [false]
```

This helps validate negative scenarios and assertion handling.

---

# 🌐 Cross Browser Support

Supported browsers:

* Chromium
* Firefox
* WebKit

---

# 🔄 CI/CD Ready

This framework can be integrated with:

* Jenkins
* GitHub Actions
* Azure DevOps
* AWS Pipeline

Example Jenkins stages:

* Build
* Execute Tests
* Publish Reports
* Email Notifications

---

# 📸 Screenshot & Failure Handling

Framework supports:

* Automatic screenshot capture on failure
* Logging support
* Detailed failure tracking

---

# 📋 Future Enhancements

* Docker Integration
* Parallel Execution
* Allure Reporting
* API Automation
* Database Validation
* Cloud Execution (BrowserStack/Sauce Labs)
* AI-assisted Test Generation

---

# 👨‍💻 Author

**Ranajit Baran Chowdhury**
Senior QA Automation Engineer

---

# ⭐ Why This Framework?

✔ Industry-standard architecture
✔ Easy maintenance
✔ Scalable automation design
✔ BDD readable test cases
✔ Fast Playwright execution
✔ CI/CD compatible
✔ Enterprise-ready structure

---

# 📬 Connect

If you like this framework, feel free to:

* Fork the repository
* Raise issues
* Suggest improvements
* Contribute enhancements

---

# 📄 License

This project is open-source and available under the MIT License.
