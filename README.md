# DoctMatise
Insertar registros desde Java sobre una BDOO

Trabajo correspondiente a la asignatura AD (Acceso a Datos) perteneciente a la titulación de Técnico Superior en el Desarrollo de aplicaciones multiplataformas.

La aplicación consistía en hacer una conexión a una Base de Datos Orientada a Objetos e insertar una serie de registros.

Utilizamos el SGBD de Matise: http://www.matisse.com/

Dentro del proyecto se incluye el esquema ODL(doctorado.odl) el cual importaremos una vez creada la BD que llamaremos "doctorado".

Además se incluye el driver necesario para la conexión a la BD, mattise.jar.


Los pasos a realizar para poner en práctica el proyecto son:

1. Descarga e Instalación de Matisse.

2. Creación de la Base de Datos "doctorado" e importar el esquema ODL facilitado.

3. Creación de un nuevo proyecto en Netbeans con una clase principal. Agregaremos el controlador mattise.jar en las Bibliotecas de nuestro proyecto.

4. Creación de las clases Java: Departamento, Profesor y Tesis desde el SGBD Matisse. Asegurarnos que todas las clases pertenecen al mismo paquete.

5. Desarrollar el código necesario en nuestra clase principal del proyecto para conectarnos a Matisse y efectuar la inserción de diferentes registros.

6. Comprobar desde Matisse que los objetos se instanciaron correctamente.
