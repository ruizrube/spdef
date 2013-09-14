Modificaciones en ficheros .genmodel:

- copyright text
- base package
- model directory 


Enterprise Architect Java API Readme

- Copy the file SSJavaCOM.dll into any location within the Windows PATH. For example, the windows\system32 directory. 


Instalar las siguientes bibliotecas en repositorio maven con el comando mvn install:install-file
			<groupId>org.eclipse.emf</groupId>
			<artifactId>common</artifactId>

			<groupId>org.eclipse.emf</groupId>
			<artifactId>ecore</artifactId>

			<groupId>org.eclipse.emf.ecore</groupId>
			<artifactId>xmi</artifactId>

			<groupId>org.sparx</groupId>
			<artifactId>eaapi</artifactId>
