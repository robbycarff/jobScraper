# JobScraper
The goal of this project is to help me with look at metrics from various cities and neighborhoods while I look for a job.

## Architecture plan

* use mongodb to create JSON-like objects from data pulled from zillow 
* write a well structure API request to unpack data and store in SQL database
* Use MEAN to create a webspace for analytical graphics
* implement well-known finance equations and models as practice 

![Map one](https://github.com/robbycarff/jobScraper/blob/master/images/map1.png)
![Map two](https://github.com/robbycarff/jobScraper/blob/master/images/map2.png)
images generated with plotly

#### Built with
MongoDB provides a lot more flexibility to store data. Further, Express.js helps to standardize the web building process. AngularJS offers a clean and simple way to add interactive functions, while Node.js affords an improved nexus for running your server.
Stacked together they offer a clean and coherent mechanism to move data back and forth from user to disk farm.

#### Stack
going to change these functions/libraries into javascript
* [Java 8](https://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html)
* [Python](https://www.python.org)

* [MongoDB (data storage)](https://treehouse.github.io/installation-guides/mac/mongo-mac.html)
* [Express.js (server-side application framework)](https://treehouse.github.io/installation-guides/mac/mongo-mac.html)
* [AngularJS (client-side application framework)](https://treehouse.github.io/installation-guides/mac/mongo-mac.html)
* [Node.js (server-side language environment)](https://treehouse.github.io/installation-guides/mac/mongo-mac.html)

#### API
* [Zillow API](https://www.zillow.com/howto/api/APIOverview.htm)
* [Glassdoor API](https://www.glassdoor.com/developer/index.htm)
* [Ploty](https://plot.ly/python/maps/)

## Getting Started
 head on over to the [Zillow API website](https://www.zillow.com/howto/api/APIOverview.html) and request an API key. I store this in a file named apiKeys.txt, and read from it in the zillowAPI.java program. (the zillow key has to be on the first line of the file currently)

### Prerequisites

### Installing MongoDB 
[Documentation here](https://treehouse.github.io/installation-guides/mac/mongo-mac.html)
```
brew update

brew install mongodb
```
Create a directory (this should exist in the repository already)
this is where the datafiles live
```
mkdir -p /data/db
```
Make sure it has the right permissions
```
sudo chown -R 'id -un' /data/db
# enter your password
```

### Deployment

```
git clone https://github.com/robbycarff/jobScraper
```

TODO: write a make bash script to compile all java AND python files
compile
```
javac jobScraper.java
```

TODO: write a make bash script to run the files
Run
```
java jobScraper.java
```

## Contributing

Please read [CONTRIBUTING.md]() for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning
In Development

## Authors

* **Robert Carff** - - [robbycarff](https://github.com/robbycarff)

## License
## Acknowledgments

