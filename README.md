java-spark-example for Yose the game
=====================

A an example to get you started to YoseTheGame using [spark](http://www.sparkjava.com).


## Get ready

[Fork](https://help.github.com/articles/fork-a-repo) me and [clone](https://help.github.com/articles/fork-a-repo#step-2-clone-your-fork) your repository locally.

You will need Java 8 and [Maven](http://maven.apache.org) to run this example.

```sh
mvn compile
```
It will compile the application.

## Run the application

Simply run:

```sh
mvn exec:java -Dexec.mainClass="yose.YoseGame"
```

... open your browser and navigate to:

```sh
http://localhost:4567
```


## Deploy

To play the game, you will have to deploy the game to a server accessible from the game server.

If you want to try out the [Heroku Cloud Plarform](http://www.heroku.com), I have included the ```Procfile``` files required by Heroku. 

You should be able to deploy the application with a simple ```git push``` to Heroku

