# 🧠 Java Server Architectures: From Single Thread to Thread Pool

This project demonstrates how Java servers scale — starting from a basic single-threaded server, moving to multi-threaded, and finally implementing a thread pool using `ExecutorService`.

All three were tested using **Apache JMeter** to compare performance under concurrent client loads.

---

## 🔧 Server Types

### 1. Single-Threaded Server
- Handles one client at a time.
- Easy to understand but blocks further connections.

### 2. Multi-Threaded Server
- Creates a new thread for every client.
- Supports concurrency but not efficient at scale.

### 3. Thread Pool Server
- Uses a fixed thread pool (`ExecutorService`).
- Scalable and resource-efficient for high-load situations.

---

## 🧪 Load Testing

- Tool: **Apache JMeter**
- Simulated multiple concurrent clients.
- Tracked response time, active threads, and throughput.

Check the attached images for test results.

---

## 📈 Results Summary

| Server Type        | Concurrency | Avg Response Time | Resource Usage |
|--------------------|-------------|-------------------|----------------|
| Single-Threaded    | ❌ Low      | 🔴 High            | 🔻 Low         |
| Multi-Threaded     | ⚠️ Medium   | 🟠 Medium          | ⚠️ High        |
| Thread Pool        | ✅ High     | 🟢 Low             | ✅ Balanced    |

---

## 📚 What I Learned

- Real-world application of OS and Networking concepts.
- Threading trade-offs in server-side development.
- Importance of efficient resource management.
- How to visualize performance using JMeter.

---

## ⚙️ Tech Stack

- Java
- Apache JMeter
- Socket Programming

---
