# GabrielaGarciaRetamar---finalProgramacionII---17-7-2025

                                                                   UTN - Facultad Regional Mar del Plata - TUP
                                                                          Examen Final Programación II
Consideraciones Importantes:
-Crear un proyecto con su nombre y apellido.
-Al finalizar, subirlo a GitHub y entregar la URL del repositorio en el campus.
-No se pide ingreso por teclado de ningún tipo.
-En lo posible programar en inglés.

Requerimiento:
Desarrollar un sistema de gestión para una tienda en línea que se especializa en la venta de Productos Electrónicos. Cada Producto debe tener Nombre, Marca, Precio y Stock. Los
Productos se dividen en tres Categorías: Teléfonos, Computadoras y Accesorios.
Además de los datos mencionados, los Teléfonos deben tener información sobre su Sistema Operativo, Capacidad de Almacenamiento y Tamaño de Pantalla. Las
Computadoras deben tener información sobre su Procesador, Memoria RAM y Tamaño de Disco. Los Accesorios deben tener información sobre su Conexión y Compatibilidad.
Los productos deben ser almacenados en una colección genérica adecuada.

El sistema debe ofrecer las siguientes funcionalidades:
-Add.
-Get (byName o byBrand). Si no se encuentra el Producto, se debe lanzar una excepción personalizada llamada ProductNotFoundException.
GetAll o ListAll.
Delete (byName o byBrand).
Buy. Realizar una compra de uno o varios Productos, reduciendo el Stock correspondiente. Si se intenta comprar un Producto que no tiene Stock, se debe
lanzar una excepción personalizada llamada ProductNotAvailableException.

Las funciones Add(), Get(), GetAll() y Delete() deben implementarse en una Clase Genérica.

Finalmente debe generarse un Archivo Serializado en formato TXT o JSON con los datos de los Productos.

Se evaluará la aplicación de los siguientes conceptos:
Abstracción, Herencia, Polimorfismo, Encapsulamiento, Modularidad, Colecciones,
Interfaces y Diagrama UML (opcional).
