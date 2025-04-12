
# 🚀 Enterprise UI Automation Framework (Java + Selenium + TestNG + Allure)

A robust, scalable test automation framework designed to execute 1000+ UI test cases in parallel with clean architecture, logging, reporting, and CI/CD readiness.

## ✅ Tech Stack
- Java 17
- Selenium WebDriver
- TestNG
- Allure Reports
- Maven + Surefire
- SLF4J + Logback
- GitHub Actions

## 📁 Folder Structure
```
enterprise-ui-automation/
├── src/
│   ├── main/java/core/...
│   ├── main/java/pages/...
│   ├── test/java/tests/...
├── .github/workflows/ci.yml
├── testng.xml
├── pom.xml
├── README.md
```

## 🚀 Run Locally
```bash
mvn clean test
mvn allure:serve
```

## 🧪 GitHub Actions CI
Automated test runs on push with Allure report integration.

## 🖼 Allure Reporting
Add `@Step`, `@Feature`, `@Severity` annotations in tests for traceability.
