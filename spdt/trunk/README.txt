-- INSTRUCCIONES DE INSTALACIÓN --

1. Instalar las siguientes dependencias desde la consola (cambiar ruta del workspace por la apropiada)

mvn install:install-file -Dfile=E:\workspace\spdt\lib\common-2.9.0.v20130528-0742.jar -DgroupId=org.eclipse.emf -DartifactId=common -Dversion=2.9.0.v20130528-0742 -Dpackaging=jar

mvn install:install-file -Dfile=E:\workspace\spdt\lib\ecore-2.9.0.v20130528-0742.jar -DgroupId=org.eclipse.emf -DartifactId=ecore -Dversion=2.9.0.v20130528-0742 -Dpackaging=jar

mvn install:install-file -Dfile=E:\workspace\spdt\lib\xmi-2.9.0.v20130528-0742.jar -DgroupId=org.eclipse.emf.ecore -DartifactId=xmi -Dversion=2.9.0.v20130528-0742 -Dpackaging=jar

mvn install:install-file -Dfile=E:\workspace\spdt\lib\eaapi-1.0.jar -DgroupId=org.sparx -DartifactId=eaapi -Dversion=1.0 -Dpackaging=jar

mvn install:install-file -Dfile=E:\workspace\spdt\lib\SSJavaCOM.dll -DgroupId=SSJavaCOM -DartifactId=SSJavaCOM -Dversion=1.0 -Dpackaging=dll -DgeneratePom=true

mvn install:install-file -Dfile=E:\workspace\spdt\lib\org.eclipse.eodm_0.9.1.v200710090302.jar -DgroupId=org.eclipse -DartifactId=eodm -Dversion=0.9.1.v200710090302 -Dpackaging=jar

mvn install:install-file -Dfile=E:\workspace\spdt\lib\org.eclipse.eodm.rdf_0.9.1.v200710090302.jar -DgroupId=org.eclipse.eodm -DartifactId=rdf -Dversion=0.9.1.v200710090302 -Dpackaging=jar







2. Añadir en las propiedades del proyecto, pestaña Libraries, Maven Dependences/Native Library location "spdt/lib"


-- RECOMENDACIONES --

1. En los ficheros .genmodel hay que modificar:

- copyright text
- base package
- model directory 


NOTAS:

Para hacer la transformación hay que previamente registrar metamodelo. Para ello hay que abrir la perspectiva ATL y sobre el ecore: Register Metamodel
En los modelos generados no se escribe el schemaLocation. Problema: si intentas abrir un modelo generado son previamente registrar el metamodelo, Eclipse se queda bloqueado. De todas formas, Eclipse no gestiona bien la relación entre el modelo y el metamodelo.
solución: serializar el schemaLocation.


