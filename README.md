# Selenium Web Element Locators in Java

This repository contains code examples demonstrating how to locate web elements using Selenium WebDriver in Java. These code snippets serve as a reference for beginners learning Selenium automation.

## Getting Started

Ensure you have Java and Selenium WebDriver configured in your development environment.

## Prerequisites

- Java Development Kit (JDK)
- Selenium WebDriver (add the Selenium dependency to your project)

## Installation

Clone the repository to your local machine using:

```git bash
git clone https://github.com/your-username/selenium-web-element-locators.git
```

## Usage
Navigate to the `src` directory to find code snippets showcasing different methods of locating web elements using Selenium WebDriver in Java.

Examples

- ### By Tag Name
```java
browser.findElement(By.tagName("h1"));
```
- ### By ID
```java
browser.findElement(By.id("fname"));
```
- ### By Name
```java
browser.findElement(By.name("lname"));
```
- ### By XPath
```java
browser.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
```
- ### By CSS Selector
```java
browser.findElement(By.cssSelector("input[value=\"radio2\"]"));
```
- ### By Link Text
```java
browser.findElement(By.linkText("Open Tab"));
```
- ### By Partial Link Text
```java
browser.findElement(By.partialLinkText("Free Access to InterviewQues"));
```
- ### By Class Name
```java
browser.findElement(By.className("ui-autocomplete-input"));
```

## Contributing
Contributions are welcome! If you have additional examples or improvements, feel free to fork this repository and create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
