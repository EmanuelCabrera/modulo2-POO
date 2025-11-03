# Modulo 2 - POO

Proyecto base con Spring Boot y Java 17 para el curso de Arquitectura.

## 📋 Descripción

Este es un proyecto base configurado con Spring Boot 3.2.0 y Java 17, listo para desarrollo. Incluye configuración para base de datos H2, JPA, validación, y herramientas de desarrollo.

## 🚀 Tecnologías

- **Java**: 17
- **Spring Boot**: 3.2.0
- **Spring Data JPA**: Para acceso a datos
- **H2 Database**: Base de datos en memoria para desarrollo
- **Lombok**: Para reducir código boilerplate
- **Maven**: Gestor de dependencias
- **Spring Boot DevTools**: Herramientas de desarrollo

## 📦 Requisitos Previos

- Java 17 o superior instalado
- Maven 3.6+ instalado
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Verificar instalación

```bash
java -version
mvn -version
```

## 🛠️ Configuración del Proyecto

### Estructura de directorios

```
modulo2-POO/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── mindhub/
│   │   │           └── Modulo2PooApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       └── application-prod.properties
│   └── test/
│       └── java/
│           └── com/
│               └── mindhub/
│                   └── Modulo2PooApplicationTests.java
├── pom.xml
└── README.md
```

## 🏃 Ejecutar el Proyecto

### Desarrollo

```bash
# Compilar y ejecutar
mvn spring-boot:run

# O compilar primero y luego ejecutar
mvn clean install
java -jar target/modulo2-poo-1.0.0.jar
```

### Ejecutar con perfiles

```bash
# Perfil de desarrollo
mvn spring-boot:run -Dspring-boot.run.profiles=dev

# Perfil de producción
mvn spring-boot:run -Dspring-boot.run.profiles=prod
```

## 🔧 Configuración

### Perfiles disponibles

- **default**: Configuración base
- **dev**: Configuración para desarrollo (logging detallado, SQL visible)
- **prod**: Configuración para producción (logging optimizado, SQL oculto)

### Base de datos H2

La aplicación utiliza H2 como base de datos en memoria. Para acceder a la consola:

1. Inicia la aplicación
2. Navega a: `http://localhost:8080/h2-console`
3. Credenciales:
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Usuario: `sa`
   - Contraseña: (vacía)

### Puerto de la aplicación

Por defecto, la aplicación corre en el puerto `8080`. Puedes cambiarlo en `application.properties`:

```properties
server.port=8080
```

## 📝 Comandos Útiles

```bash
# Limpiar y compilar
mvn clean compile

# Ejecutar tests
mvn test

# Empaquetar proyecto
mvn package

# Instalar en repositorio local
mvn install

# Actualizar dependencias
mvn dependency:resolve
```

## 🧪 Testing

Ejecuta los tests con:

```bash
mvn test
```

## 📚 Dependencias Principales

- **spring-boot-starter-web**: Para crear APIs REST
- **spring-boot-starter-data-jpa**: Para persistencia de datos
- **spring-boot-starter-validation**: Para validación de datos
- **h2**: Base de datos en memoria
- **lombok**: Reducción de código boilerplate
- **spring-boot-devtools**: Herramientas de desarrollo (auto-reload)
- **spring-boot-starter-test**: Para testing

## 📖 Próximos Pasos

- [ ] Crear entidades JPA
- [ ] Implementar repositorios
- [ ] Crear controladores REST
- [ ] Agregar DTOs y validaciones
- [ ] Configurar base de datos de producción (PostgreSQL, MySQL, etc.)
- [ ] Implementar manejo de excepciones
- [ ] Agregar documentación API (Swagger/OpenAPI)
- [ ] Configurar seguridad (Spring Security)

## 👤 Autor

- [Tu nombre aquí]

## 📄 Licencia

[Especificar licencia si es necesario]

## 🐛 Troubleshooting

### Problemas comunes

**Error: Java version incompatible**
- Verifica que tengas Java 17 instalado: `java -version`
- Configura `JAVA_HOME` apuntando a Java 17

**Error: Puerto en uso**
- Cambia el puerto en `application.properties`
- O detén el proceso que está usando el puerto 8080

**Error: Dependencias no encontradas**
- Ejecuta: `mvn clean install -U`

## 📞 Soporte

Para problemas o preguntas, contacta a [tu email o contacto aquí].

