# 🚗 Tienda de Vehículos - Sistema de Gestión 🚛

Este proyecto implementa un **sistema de gestión para una tienda de vehículos** utilizando **Programación Orientada a Objetos (POO) en Java**. El sistema permite administrar diferentes tipos de vehículos, realizar operaciones sobre ellos y aplicar principios fundamentales de la POO, como **abstracción, encapsulamiento, herencia y polimorfismo**.

## 📌 Características Principales

- **Gestión de vehículos** (autos y camiones)
- **Encapsulamiento** para proteger los datos
- **Herencia** para reutilización del código
- **Polimorfismo** para manejar diferentes tipos de vehículos de manera uniforme
- **Colecciones dinámicas** para almacenar y gestionar los vehículos

---

## 📂 Estructura del Proyecto

```
/src
│── models
│   ├── Vehiculo.java      # Clase abstracta base
│   ├── Auto.java          # Clase derivada para autos
│   ├── Camion.java        # Clase derivada para camiones
│── services
│   ├── Tienda.java        # Clase que gestiona la colección de vehículos
│── main
│   ├── Main.java          # Punto de entrada del programa
│── README.md              # Documentación del proyecto
│── .gitignore             # Archivos ignorados en Git
```

---

## 🎯 Descripción de Clases

### 1️⃣ **Clase Abstracta `Vehiculo`**
- Atributos comunes: `marca`, `modelo`, `anio`, `precio`
- Métodos abstractos:
  - `mostrarDetalles()`
  - `calcularImpuestos()`

### 2️⃣ **Clase `Auto` (hereda de `Vehiculo`)**
- Atributos adicionales: `numeroDePuertas`
- Implementación de `calcularImpuestos()`: Los autos pagan un 5% de impuestos sobre el precio

### 3️⃣ **Clase `Camion` (hereda de `Vehiculo`)**
- Atributos adicionales: `capacidadCarga`
- Implementación de `calcularImpuestos()`: Los camiones pagan un 10% de impuestos sobre el precio

### 4️⃣ **Clase `Tienda`**
- Almacena los vehículos en una `ArrayList<Vehiculo>`
- Métodos principales:
  - `agregarVehiculo(Vehiculo v)`
  - `removerVehiculo(String modelo)`
  - `buscarPorMarca(String marca)`
  - `listarVehiculos()`

### 5️⃣ **Clase `Main`**
- Crea instancias de `Auto` y `Camion`
- Agrega los vehículos a la tienda
- Demuestra el uso de polimorfismo al recorrer la lista de vehículos

---

## 🚀 Instalación y Uso

### 🔹 Requisitos Previos
- Tener instalado **Java 8+**
- Un IDE como **IntelliJ IDEA, Eclipse o VS Code**

### 🔹 Clonar el Repositorio
```bash
git clone https://github.com/tu-usuario/tienda-vehiculos.git
cd tienda-vehiculos
```

### 🔹 Compilar y Ejecutar
```bash
javac src/main/Main.java
java src/main/Main
```

---

## 📝 Ejemplo de Uso

```java
Tienda tienda = new Tienda();

Vehiculo auto1 = new Auto("Toyota", "Corolla", 2022, 20000, 4);
Vehiculo camion1 = new Camion("Volvo", "FH16", 2021, 80000, 20.5);

tienda.agregarVehiculo(auto1);
tienda.agregarVehiculo(camion1);

tienda.listarVehiculos();
```

Salida esperada:
```
Toyota Corolla - 2022 - $20000 - Impuesto: $1000.0
Volvo FH16 - 2021 - $80000 - Impuesto: $8000.0
```

---

## ✅ Principios de POO Aplicados

| Principio      | Implementación |
|---------------|---------------|
| **Abstracción** | Uso de la clase abstracta `Vehiculo` |
| **Encapsulamiento** | Atributos privados con getters/setters |
| **Herencia** | `Auto` y `Camion` extienden `Vehiculo` |
| **Polimorfismo** | Manejo de `ArrayList<Vehiculo>` para distintos tipos de vehículos |

---

## 🔧 Mejoras Futuras
- Implementación de un **archivo de persistencia** para almacenar los vehículos registrados.
- Interfaz gráfica para facilitar la gestión desde un entorno visual.
- Incorporación de más tipos de vehículos, como **motocicletas y autobuses**.

---

## 📜 Licencia

Este proyecto está bajo la licencia **MIT**.

---

## ✉️ Contacto

Si tienes preguntas o sugerencias, puedes contactarme en:

🐙 **[GitHub]([https://github.com/pinchiguillo])**
     **[Repo](https://github.com/pinchiguillo/GestorTiendaVehiculos))**  
