# 🚀 SpringBoot WebMVC REST Service

Welcome to the SpringBoot WebMVC REST service that provides information about families and children. This service offers a set of endpoints to retrieve specific information about fathers, children, and their relationships.

## 📖 Challenge Description
The service offers the following functionalities:

## 🌟 Features:

1. 🔄 **List of All Father Names:**:
    - Endpoint: /all-fathers
    - HTTP Method: GET
    - Description: This endpoint returns a list of all the names of fathers.

2. 🔄 **Fathers with More Than One Child:**:
    - Endpoint: /fathers-with-multiple-children
    - HTTP Method: GET
    - Description: This endpoint returns a list of fathers who have more than one child.

3. 🔄 **Child Information:**:
    - Endpoint: /child-info/{childName}
    - HTTP Method: GET
    - Description: Given the name of a child, this endpoint returns information about their father and mother (if defined).

4. 🔄 **Number of Children for John:**:
    - Endpoint: /johns-children
    - HTTP Method: GET
    - Description: This endpoint returns the number of children that John has.

5. 🔄 **Number of Children for Mary:**:
    - Endpoint: /marys-children
    - HTTP Method: GET
    - Description: This endpoint returns the number of children that Mary has.
      
## 🚀 Getting Started:

🔧 Pre requisites:
Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) installed.
- Maven build tool installed.

## 📖 Building and Running the Service

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/Larissasbueno/Parent-Child-Challenge.git

2. Navigate to the project directory:
   ```bash
   cd springboot-family-service
   
3. Build the project using Maven:
   ```bash
   mvn clean install
   
4. Run the Spring Boot application:
   ```bash
   mvn spring-boot:run

🚀 The service will start locally and be accessible at http://localhost:8080.  

## 🌐 Endpoints:

The following endpoints are available:

1. 🔄 List of All Father Names:
  - Endpoint: /fathers
  - HTTP Method: GET

2. 🔄 Fathers with More Than One Child:
  - Endpoint: /fathers/multiple-children
  - HTTP Method: GET

3. 🔄 Child Information:
  - Endpoint: /children/parents
  - HTTP Method: GET

4. 🔄 Number of Children for John:
  - Endpoint: /john/children-count
  - HTTP Method: GET

5. 🔄 Number of Children for Mary:
 - Endpoint: /mary/children-count
  - HTTP Method: GET

## 🛠 Testing with Postman:
To test the endpoints, you can use tools like Postman:

1. Open Postman.
2. Configure the request based on the desired endpoint (URL, method, headers, and body).
3. Send the request and inspect the response.

    You can also create automated tests in Postman to validate the responses further.


## 🌟 Conclusion
This SpringBoot WebMVC REST service provides valuable information about fathers, children, and their relationships. Feel free to explore and use the provided endpoints in your applications. If you have any questions or need further assistance, please don't hesitate to contact us.

## 🤝 Contributing:
Pull requests are welcome. For significant changes, please open an issue first to discuss what you would like to change.
