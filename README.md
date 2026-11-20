# Trabajo Práctico N° 4 - Programación Orientada a Objetos

Trabajo práctico de la materia **Programación Orientada a Objetos**, resuelto en **Java**.

El foco del TP es el uso de **colecciones** de Java (`array`, `ArrayList`, `HashMap`, `HashSet`) para reutilizar código y manejar conjuntos de objetos: agregar, eliminar y recuperar elementos.

## Objetivos

- Apreciar la ventaja de reutilizar código mediante clases predefinidas de Java.
- Manejar colecciones de objetos:
  - estáticas y dinámicas
  - homogéneas y heterogéneas
  - indexadas (por clave)

## Ejercicios

| N° | Tema | Colección | Clases | Clase ejecutable |
|----|------|-----------|--------|------------------|
| 1 | Array de puntos y distancia entre consecutivos | `Punto[6]` | `Punto` | `ArrayDePuntos` |
| 2 | Toma de pedidos con detalle y totales | `ArrayList` | `Pedido`, `Cliente`, `Producto`, `Laboratorio` | `TomaPedido` |
| 3 | Liquidación de sueldos de un banco | `ArrayList` | `Banco`, `Localidad`, `Empleado` | `AplicacionBanco` |
| 4 | Cuentas bancarias, titulares y resumen del banco | `ArrayList`, `HashSet` | `Banco`, `CuentaBancaria`, `Persona`, `Localidad`, `Empleado` | `AplicacionBanco` |
| 5 | Alumnos inscriptos a un curso (clave: LU) | `HashMap` | `Curso`, `Alumno` | `Carrera` |
| 6 | Registro de empleados de un comercio (clave: CUIL) | `HashMap` | `Comercio`, `Empleado` | `GestionComercio` |

### Resumen de cada ejercicio

1. **ArrayDePuntos**: se carga por teclado un array de 6 puntos, se imprimen sus coordenadas y la distancia entre cada par de puntos consecutivos.
2. **Pedidos**: un `Pedido` mantiene la lista de productos (uno por unidad solicitada). Permite agregar y quitar productos, calcular el total al contado y el total financiado, y mostrar el detalle del pedido.
3. **Sueldos del banco**: el `Banco` (con al menos 1 empleado al crearse) puede contratar y despedir empleados, listar sueldos y calcular el total a pagar.
4. **Cuentas bancarias**: se amplía el banco para administrar cuentas. Lista titulares sin repetir, cuentas con saldo cero, cantidad de cuentas activas y emite un resumen.
5. **Curso**: usa un `HashMap<LU, Alumno>`. Permite inscribir y quitar alumnos, consultar si está inscripto, buscar por LU, mostrar el promedio y listar inscriptos.
6. **Comercio**: usa un `HashMap<CUIL, Empleado>`. Permite alta y baja de empleados, búsqueda por CUIL, consulta de sueldo neto y emisión de la nómina.

## Consignas generales

- Definir dos constructores para las clases con colecciones:
  - uno que recibe la colección (conocimiento `*` o `n`)
  - uno para el caso 0 (crea la colección vacía) o el caso 1 (recibe un elemento y lo agrega)
- Resolver algunos ejercicios con **genéricos** y otros con **cast** al recuperar elementos.
- Reutilizar las clases de trabajos anteriores.
- Al menos un ejercicio con menú de opciones.

## Estructura del repositorio

```
TrabajoPractico4---POO/
└── trabajoPractico4/   # código fuente del TP
```

<!-- Ajustá esta sección si dentro de trabajoPractico4 separaste los ejercicios en paquetes o carpetas. -->

## Requisitos

- JDK 8 o superior.

## Compilar y ejecutar

```bash
git clone https://github.com/qqaston/TrabajoPractico4---POO.git
cd TrabajoPractico4---POO/trabajoPractico4

# compilar
javac *.java

# ejecutar una clase con main, por ejemplo:
java ArrayDePuntos
```

<!-- Si usás paquetes, el comando cambia: javac -d out $(find . -name "*.java") y java -cp out paquete.Clase
     Si usás NetBeans/Eclipse/IntelliJ, podés aclarar que se abre como proyecto. -->

## Autor

[@qqaston](https://github.com/qqaston)
