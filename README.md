A Spring Boot Elastic Search Application 


Steps : Go to https://www.elastic.co/downloads/elasticsearch Download Zip
Extract Zip file 
Open Command Prompt
cd ...\elasticsearch-8.10.2\bin 
Run : ...\elasticsearch-8.10.2\bin > elasticsearch -E xpack.security.enabled=false
Access Elastic Search on http://localhost:9200

Optional Kibana
Download https://www.elastic.co/downloads/kibana zip file
Extract
Open command prompt
cd ...\kibana-8.10.2\bin
Run : ...\kibana-8.10.2\bin>kibana
Access Kibana on http://localhost:5601/app/home#/

Start Application

Check application properties file

APIS
http://localhost:8080/api/es/products
POST 
{
"name":"B11 smartwatch",
"price":28000,
"description":"Health Check Smart Watch",
"quantity": 1
}

http://localhost:8080/api/es/products
GET
