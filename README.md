# HotelratingSystem
A scalable Hotel Rating System built using Java, Spring Boot, and Microservices architecture. This project demonstrates real-world backend development concepts including service decomposition, inter-service communication, and RESTful API design.

🚀 Features
🧑 User Service – Manage user data
🏨 Hotel Service – Manage hotel information
⭐ Rating Service – Add and fetch hotel ratings
🔗 Service Communication using REST APIs
📦 Microservices-based architecture
⚡ Scalable and loosely coupled design

🛠️ Tech Stack
Backend: Java, Spring Boot
Architecture: Microservices
Database: MySQL, PostgreSQL, MongoDB
Build Tool: Maven
Communication: REST APIs
Tools: Swagger,Postman, Docker


🧩 Microservices Overview
1. User Service
Create and manage users
Fetch user details
Aggregate user ratings from Rating Service
2. Hotel Service
Manage hotel data
Retrieve hotel details
3. Rating Service
Add ratings for hotels
Fetch ratings by user or hotel


🔄 API Flow (Example)
User requests details
User Service calls Rating Service
Rating Service returns ratings
User Service calls Hotel Service
Final aggregated response returned

📂 Project Structure
hotel-rating-system/
│
├── user-service/
├── hotel-service/
├── rating-service/
└── service-registry/


Microservices design patterns
REST API best practices
Service-to-service communication
Real-world backend architecture


👨‍💻 Author
Prem Kumar
Java Backend Developer (Spring Boot | Microservices)

⭐ Contribute

Feel free to fork, raise issues, or submit PRs!
