CREATE TABLE users (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30),
  password  VARCHAR(50)
);

CREATE TABLE roles (
  id         INTEGER PRIMARY KEY,
  rolename VARCHAR(30)
);

CREATE TABLE userroles (
  user_id INTEGER,
  role_id INTEGER
);