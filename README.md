Log File Analyzer

📚 Overview

Log File Analyzer is a Java-based application that parses and analyzes log files to help developers, system administrators, and IT professionals monitor system activity and identify issues efficiently. The application processes structured log files, extracts relevant information, and generates useful insights such as error counts, warning summaries, and frequently occurring issues.

🚀 Features

Parse structured log files

Filter logs by severity level (INFO, WARN, ERROR)

Search logs by keywords

Generate summary statistics

Identify frequent error messages

Export analysis reports

Unit testing support using JUnit

📌 Clone the Repository

git clone https://github.com/adriraj417/log-file-analyzer.git cd log-file-analyzer

📌 Analyze a Log File

The application reads and analyzes the specified log file:

logs/sample.log

📌 Generate a Report

The analyzer generates a summary report containing:

Total log entries

Number of INFO messages

Number of WARN messages

Number of ERROR messages

Most frequent error messages

🧾 Example Output

2025-12-21 10:10:01 INFO Server started

2025-12-21 10:12:15 WARNING High memory usage

2025-12-21 10:13:45 ERROR Database connection failed

2025-12-21 10:14:20 INFO User logged in

2025-12-21 10:15:10 ERROR Disk not found

2025-12-21 10:16:00 WARNING CPU temperature high

🛠️ Technologies Used

->Java

->File Handling

🚀 Future Enhancements

Real-time log monitoring

Graphical dashboard visualization

Email and SMS alerts

AI-based anomaly detection

Support for multiple log formats

Export reports in CSV and PDF formats


⚙️ Project Structure

log-file-analyzer/  

├── src/

│ ├── LogEntry.java

│ ├── LogParser.java

│ ├── LogAnalyzer.java

│ └── Main.java

├── tests/

│ └── LogAnalyzerTest.java
├── logs/

│ └── sample.log

└── README.md

📄License MIT License © 2026 —Adriraj Bhanja
