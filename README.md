# Modulo 2 - POO

Proyecto base con Spring Boot y Java 17 para el curso de Programación Orientada a Objetos.

## 📋 Descripción

Este proyecto contiene ejercicios prácticos de Programación Orientada a Objetos en Java, implementando conceptos como herencia, polimorfismo, interfaces y composición. Incluye tres ejercicios principales que demuestran diferentes aspectos de la POO.

## 🎯 Ejercicios

### 1. Exportación de Perfiles (Herencia y Polimorfismo)
- Implementación de exportadores de perfiles a diferentes formatos (JSON, XML)
- Uso de clases abstractas y herencia
- Ubicación: `com.mindhub.excersice1`

### 2. Sistema de Notificaciones (Interfaces)
- Sistema de notificaciones con diferentes canales (Email, SMS, Push, Slack)
- Uso de interfaces para definir comportamientos comunes
- Ubicación: `com.mindhub.excersice2`

### 3. Sistema de Personajes (Patrón Estrategia)
- Implementación de personajes con diferentes comportamientos de ataque y movimiento
- Uso de composición sobre herencia
- Patrón de diseño Estrategia
- Ubicación: `com.mindhub.excersice3`

## 🚀 Tecnologías

- **Java**: 17
- **Spring Boot**: 3.2.0 (solo para el contexto de la aplicación)
- **Lombok**: Para reducir código boilerplate
- **Maven**: Gestor de dependencias

## 📦 Requisitos Previos

- Java 17 o superior instalado
- Maven 3.6+ instalado
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

## 🏃‍♂️ Ejecutando la Aplicación

El método `main` en `Modulo2PooApplication` ejecuta demostraciones de los tres ejercicios:

1. **Ejercicio 1**: Crea un perfil de usuario y lo exporta a JSON y XML.
2. **Ejercicio 2**: Envía notificaciones a través de diferentes canales.
3. **Ejercicio 3**: Crea personajes con diferentes comportamientos de ataque y movimiento, mostrando el patrón Estrategia.

Para ejecutar la aplicación:

```bash
mvn spring-boot:run
```

## 📝 Salida Esperada

Al ejecutar la aplicación, verás:
1. Exportación del perfil a JSON y XML
2. Envío de diferentes tipos de notificaciones
3. Creación de personajes con diferentes comportamientos y demostración de cómo cambiar dinámicamente estos comportamientos
java -version
mvn -version
```
```
## Respuesta a la pregunta del tercer ejercicio: Composition vs. Inheritance - Modeling Game Characters

La herencia en determinados casos puede desencadenar en un problema, por ejemplo, si modelamos un personaje que puede ser un Warrior o un Mage, al agregar una nueva variación por ejemplo volar o nadar, la jerarquía no escala, vas a necesitar un FlyingWarrior, FlyingMage, SwimmingMage, etc. Cada nueva habilidad termina multiplicando las posibles combinaciones lo que provoca una “explosión de clases”. Con esto provocas capacidades ligadas creando así identidades rígidas, dificultando la reutilización y el mantenimiento, por más pequeño que sea el cambio en el comportamiento te obligan a crear o modificar múltiples subclases.
Si además quisiéramos que un Warrior también pueda lanzar hechizos, nos encontraríamos con el problema de la herencia múltiple que Java no permite o con la necesidad de duplicar lógica aplicando parches, lo que termina generando un alto acoplamiento entre clases.
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
│   │   │           ├── Modulo2PooApplication.java
│   │   │           ├── excersice1/
│   │   │           │   ├── domain/
│   │   │           │   │   ├── UserProfile.java
│   │   │           │   │   ├── JsonProfileExporter.java
│   │   │           │   │   └── XmlProfileExporter.java
│   │   │           │   └── service/
│   │   │           ├── excersice2/
│   │   │           │   ├── domain/
│   │   │           │   │   ├── Notification.java
│   │   │           │   │   ├── EmailNotification.java
│   │   │           │   │   ├── SmsNotification.java
│   │   │           │   │   ├── PushNotification.java
│   │   │           │   │   └── SlackNotification.java
│   │   │           │   └── service/
│   │   │           │       └── NotificationService.java
│   │   │           └── excersice3/
│   │   │               ├── domain/
│   │   │               │   ├── Character.java
│   │   │               │   ├── SwordAttack.java
│   │   │               │   ├── MagicAttack.java
│   │   │               │   ├── WalkingMovement.java
│   │   │               │   └── FlyingMovement.java
│   │   │               └── interfaces/
│   │   │                   ├── IAttackBehavior.java
│   │   │                   └── IMovementBehavior.java
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

## 👤 Autor

- Emanuel Lautaro Cabrera Zembrunski

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

