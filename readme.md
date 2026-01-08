# Spring Beans, Autowiring & Dependency Injection – Assignment

![Architecture diagram](img.png)
## Overview

This project demonstrates the core concepts of **Spring Beans**, **Autowiring**, and **Dependency Injection (DI)** using a simple vehicle-based domain model.

The goal is to show how Spring enables **loose coupling** by wiring together different implementations at runtime using interfaces, without changing business logic code.

---

## Problem Statement

The application should:

- Play music using **one of multiple Speaker implementations**
- Move a vehicle using **one of multiple Tyres implementations**
- Allow **easy switching between implementations**
- Follow proper **Dependency Injection principles**

---

## Design Approach

The application is structured around **interfaces and implementations**.

High-level components depend only on **interfaces**, not concrete classes.  
Spring decides *which implementation to inject*.

This design follows the **Dependency Inversion Principle**.


