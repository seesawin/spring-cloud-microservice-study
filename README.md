# spring-cloud-microservice-study

<h3>Module 1 : microservice-discovery-eureka</h3> 

url: <br />
http://discovery:8760/<br />
http://peer1:8761/<br />
http://peer2:8762/<br />
how to shutdown : curl -X POST host:port/shutdown<br /> 

cmd:<br />
java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1<br />
java -jar microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2<br />

<h3>Module 2 : microservice-provider-user</h3> 
url: <br />
http://discovery:8000/12222/<br />
http://localhost:8000/instance-info/<br /><br />

<h3>Module 3 : microservice-consumer-movie-ribbon</h3> 
url: <br />
http://localhost:8010/ribbon/1<br /><br />

<h3>Module 4 : microservice-consumer-movie-ribbon</h3> 
url: <br />
http://localhost:8010/ribbon/1<br /><br />

<h3>Module 5 : microservice-consumer-movie-ribbon-with-hystrix</h3> 
url: <br />
http://localhost:8011/ribbon/1<br /><br />
http://localhost:8011/hystrix.stream<br /><br />

<h3>Module 6 : microservice-hystrix-dashboard</h3> 
url: <br />
http://localhost:8030/hystrix.stream<br />
search url : http://localhost:8011/hystrix.stream<br /><br />

<h3>Module 7 : microservice-hystrix-turbine</h3> 
url: <br />
http://localhost:8030/hystrix.stream<br />
search url : http://localhost:8031/turbine.stream<br /><br /><br />

<h3>Module 8 : microservice-config-server</h3> 
url: <br />
http://localhost:8040/microservice-config-client-dev.properties<br />
http://localhost:8040/microservice-config-client/dev<br /><br />

<h3>Module 9 : microservice-config-client</h3> 
url: <br />
delete old data : curl  -X POST http://localhost:8041/refresh<br />
http://localhost:8041/hello<br /><br />

<h3>Module 10 : microservice-api-gateway</h3> 
url: <br />
http://localhost:8050/microservice-provider-user/1<br /><br />

all references :
1. https://www.gitbook.com/book/eacdy/spring-cloud-book/details
2. http://www.jianshu.com/p/44ef43b282f0
