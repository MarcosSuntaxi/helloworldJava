# HelloWorldServlet

## Overview

The `HelloWorldServlet` is a simple Java Servlet that responds to HTTP GET requests with a "Hello, World!" message displayed in Spanish ("¡Hola, Mundo!"). This servlet serves as a basic example of how to create a web application using Java Servlets.

## Features

- Responds to GET requests at the `/hello` URL.
- Returns a simple HTML page with a greeting message.
- The message is displayed in a centered, large font.

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A servlet container (such as Apache Tomcat) that supports the Servlet API.
- Maven or another build tool (optional for project setup).

## Setup

1. **Install a servlet container**: Ensure that you have a servlet container like Apache Tomcat installed.

2. **Create a servlet project**: Create a new Java project and add the necessary servlet API library (often included in servlet containers).

3. **Add the Servlet Code**: Place the following code in a class file named `HelloWorldServlet.java`.

```java
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1 style='text-align: center; font-size: 30px;'>¡Hola, Mundo!</h1>");
        out.println("</body></html>");
        out.close();
    }
}
