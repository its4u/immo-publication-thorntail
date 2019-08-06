# immo-publication-thorntail

## Commandes utiles
 
Pour construire le projet :
```
mvn clean package
```

Pour lancer le projet :
```
java -jar ./target/immo-publication-thorntail.jar 
```
ou
```
mvn thorntail:run 
```

Pour tester les sondes du projet :

http://localhost:8080/health

Pour visualiser la définition de l'API dans l'interface :

http://localhost:8080/swagger-ui/index.html?url=http://localhost:8080/openapi

## Environnement
Testé avec :
* OpenJDK 11.0.4
* Apache Maven 3.6.1 (et 3.5.4))
* Fedora 30 et Windows 10
* Firefox 68

Limitations :
* OpenJDK 12 : ce projet a une dépendance vers le module jboss-classfilewriter qui n'est pas (encore) compatible

