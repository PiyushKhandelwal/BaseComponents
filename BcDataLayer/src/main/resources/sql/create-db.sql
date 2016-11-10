CREATE TABLE bc_users (
  id         INTEGER PRIMARY KEY,
  name VARCHAR(30),
  password  VARCHAR(50),
  enabled INTEGER DEFAULT 1 NOT NULL
);

CREATE TABLE bc_roles (
  id         INTEGER PRIMARY KEY,
  rolename VARCHAR(30)
);

CREATE TABLE bc_userroles (
  user_id INTEGER,
  role_id INTEGER
);