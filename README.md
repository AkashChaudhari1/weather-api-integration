# 🌤️ Weather API Integration

This is a simple **Spring Boot** application that integrates with the **OpenWeatherMap API** to fetch real-time weather information for a given city. The application exposes a RESTful API endpoint to get weather details such as temperature, humidity, and weather description. This project demonstrates **API integration skills** by consuming an external weather API and serving the data through your own backend.

The backend is built using Java and Spring Boot, utilizing Maven as the build tool. It parses JSON responses from OpenWeatherMap using the `org.json` library. The application runs on port 8080 by default.

---

## 🛠️ Tech Stack
- ☕ Java (Spring Boot)
- 📦 Maven
- 🌐 OpenWeatherMap API
- 🔄 `org.json` for JSON parsing
- 🐙 Git for version control

---

## 🚀 Prerequisites
Make sure you have:
- Java 17 or higher installed
- Maven installed
- A free API key from [OpenWeatherMap](https://openweathermap.org/api)

---

## ⚙️ How to Run

1. **Clone this repository:**

   ```bash
   git clone https://github.com/YOUR_USERNAME/REPO_NAME.git
   cd REPO_NAME
   ```
2. **Add your OpenWeatherMap API key:**
   Create or edit the file src/main/resources/application.properties and add:
   ```bash
   weather.api.key=YOUR_API_KEY_HERE
   ```
Replace YOUR_API_KEY_HERE with your actual API key.

3. **Build and start the application:**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
4. **Test the API endpoint:**
   Open in browser or Postman:
   ```bash
   http://localhost:8080/weather?city=London
   ```
   You will get JSON data with weather info for the city requested.
## 🎨 Optional Frontend
You can use the included index.html file to create a simple frontend interface that interacts with this backend API to show weather details dynamically.

**⚠️ Important:**

Do not commit your application.properties file containing the API key to public repositories. Use environment variables or secure configuration management for production deployments.

**👤 Author: Akash Chaudhari**
