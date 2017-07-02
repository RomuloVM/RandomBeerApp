# RandomBeerApp
by Romulo do Vale Martins

Rum instructions:

  Configuring the database

  It was used an official MySql Docker image as the developer database.

  docker terminal command to get the image: 

    docker pull mysql:5.7.18

  docker terminal command used to run the container:

    docker run -d -t --name mysql-romulo -p 3307:3306 -e MYSQL_ROOT_PASSWORD=rootpass mysql:5.7.18

  Using a database management software connect with the container database with:

    Hostname: 0.0.0.0
    Port: 3307
    Username: root
    Password: rootpass

  The tables to import can be found inside the project folder "DB_Dump".
  

JAVA Container

  It was used the openjdk Docker image as the final running environment.

  docker terminal command to get the image: 

    docker pull openjdk
  
  docker terminal command used to run the container:
  
    docker run --rm --name java-romulo --link mysql-romulo:mysql -p 8080:8080 -it -v [change for the path to where this repository was cloned]:/romulo openjdk:8
  
  Inside the container run the commands:
  
    cd romulo
    
    then:
    
    ./gradlew bootRun
    
The App can be accessed with a browser by copying and pasting this URL:
  
  http://localhost:8080/
  
