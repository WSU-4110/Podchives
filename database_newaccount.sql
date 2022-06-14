CREATE DATABASE database_newaccount;
USE database_newaccount;
CREATE TABLE user(
username VARCHAR(10),
password VARCHAR(10),                
firstname VARCHAR(50),
lastname VARCHAR(50),
email VARCHAR(50),                               
PRIMARY KEY(username)
);

INSERT INTO user
 VALUES ('jason98', '88listen88', 'Jason', 'Smith','jsmith@gmail.com'), 
       ('pbrown55', 'pod88cast%', 'Peter', 'Brown','brown.peter87@gmail.com');