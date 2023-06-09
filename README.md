# Proyecto Conversor de Unidades en Java y JavaFX 17
Este proyecto es un conversor de unidades desarrollado en Java utilizando el framework JavaFX 17.0.2. El conversor soporta conversiones de temperatura, moneda y distancia, y su estructura basada en OOP permite la fácil implementación de nuevos conversores de unidades.

## Contenido
- Sobre el desafio
- Requisitos
- Configuración
- Como ejecutar la aplicación
- Uso
- Estructura del proyecto
- Contribución
- Licencia


## Sobre el desafio
- Se nos solicitó crear un conversor de divisas utilizando el lenguaje Java. Las características solicitadas por nuestro cliente son las siguientes:

## Parametros del desafio:
1. ### El convertidor de moneda debe:
		- Convertir de la moneda de tu país a Dólar
		- Convertir de la moneda de tu país  a Euros
		- Convertir de la moneda de tu país  a Libras Esterlinas
		- Convertir de la moneda de tu país  a Yen Japonés
		- Convertir de la moneda de tu país  a Won sul-coreano

2. ### Conversor invertido:
		- Convertir de Dólar a la moneda de tu país
		- Convertir de Euros a la moneda de tu país
		- Convertir de Libras Esterlinas a la moneda de tu país
		- Convertir de Yen Japonés a la moneda de tu país
		- Convertir de Won sul-coreano a la moneda de tu país

	### Extras
	Funcionalidades opcionales del desafio:	 Poder reutilizar el código para generar diferentes tipos de conversores de unidades (temperatura, distancia, masa, etc). 

## Requisitos
- JDK 11 o superior
- Maven 3.6.0 o superior
- JavaFX 17.0.2
- Scene Builder (opcional, para editar visualmente la interfaz de usuario)

## Configuración
#### Configuración de Java JDK 17
1. Descarga e instala JDK 17 desde el sitio web oficial de Oracle: JDK 17
2. Descargue e instale JavaFX17 siguiendo las instrucciones de su plataforma.
3. Asegurese de que las variables de entorno estén configuradas correctamente para Java y JavaFX.

## Como ejecutar la aplicación
#### Desde la línea de comandos
1. Clone este repositorio: git clone https://github.com/Ignacioscript/UnitsConverterJFX.git
2. Navegue hasta la carpeta del proyecto: ConversorDeUnidades
3. Compile el proyecto: javac --module-path /src/main/java/module-info.java --add-modules javafx.controls,javafx.fxml src/*.java
4. Ejecute la aplicación: java --module-path /src/main/java/module-info.java --add-modules javafx.controls,javafx.fxml src.Main


#### Desde un IDE
1. Importe el proyecto en su IDE favorito (Eclipse, IntelliJ IDEA, etc.).
2. Configure las dependencias y el módulo de JavaFX.
3. Ejecute la clase Main desde su IDE.

## Uso
1. Ejecute la aplicación siguiendo las instrucciones anteriores.
2. Seleccione la categoría de conversión (longitud, temperatura, moneda).
3. Ingrese el valor que desea convertir en el campo de texto.
4. Seleccione la unidad de origen y la unidad de destino.
5. Haga clic en "Convertir" para obtener el resultado.

![Screenshot from 2023-03-21 10-29-28](https://user-images.githubusercontent.com/107491009/226663897-0a9ee7a7-9576-406a-843c-686c9f9959ea.png)

![Screenshot from 2023-03-21 10-31-01](https://user-images.githubusercontent.com/107491009/226663975-519e7a75-dc55-4b73-9e84-738e42e440b3.png)
![Screenshot from 2023-03-21 10-31-30](https://user-images.githubusercontent.com/107491009/226664038-19b6361f-d81c-4e6d-ad20-c3f306545d90.png)
![Screenshot from 2023-03-21 10-32-02](https://user-images.githubusercontent.com/107491009/226664107-768a4307-4b3a-4c12-83e5-637e8a821b3d.png)

## Estructura del proyecto
![Screenshot from 2023-03-21 10-27-19](https://user-images.githubusercontent.com/107491009/226664562-652ebe16-1153-4603-b81d-16a154678567.png)


## Contribuciones
Las contribuciones son bienvenidas. Por favor, cree una issue o envíe un pull request para proponer mejoras o correcciones de errores.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT - vea el archivo LICENSE.md para más detalles.


