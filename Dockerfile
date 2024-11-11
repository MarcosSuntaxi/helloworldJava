# Usamos la imagen base de OpenJDK con un JDK 11 para compilar y ejecutar aplicaciones Java
FROM openjdk:11-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo Java al contenedor
COPY HelloWorldSwing.java /app/

# Compilar el archivo Java
RUN javac HelloWorldSwing.java

# Comando para ejecutar la aplicación
CMD ["java", "HelloWorldSwing"]
