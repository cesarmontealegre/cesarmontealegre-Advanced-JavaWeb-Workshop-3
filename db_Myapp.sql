CREATE DATABASE db_Myapp;

USE db_Myapp;

CREATE TABLE
  users_tbl (
    user_id INT PRIMARY KEY,
    user_firstname VARCHAR(40) NOT NULL,
    user_lastname VARCHAR(40) NOT NULL,
    user_email VARCHAR(60) NOT NULL,
    user_password VARBINARY(256)
  );

INSERT INTO
  users_tbl (
    user_firstname,
    user_lastname,
    user_email,
    user_password
  )
VALUES
  (
    UPPER('Cesar'),
    UPPER('Montealegre'),
    'CesarM@correo.com',
    AES_ENCRYPT (
      'sGmL8JP@4cQjA5S@v6iajpJBR2c',
      '$2a$12$7tQdqij7pBKLCVV486Ny..R4EA5A45EfyFsTHWoSC/AeZBICqqFSi'
    )
  );

SELECT
  *
FROM
  users_tbl;

SELECT
  *,
  CAST(
    AES_DECRYPT (
      user_password,
      '$2a$12$7tQdqij7pBKLCVV486Ny..R4EA5A45EfyFsTHWoSC/AeZBICqqFSi'
    ) AS CHAR(50)
  ) end_data
FROM
  users_tbl
WHERE
  user_id = 0;