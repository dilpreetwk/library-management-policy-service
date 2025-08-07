CREATE TABLE policy
(
    id           INTEGER AUTO_INCREMENT PRIMARY KEY,
    policy_key   VARCHAR(255) NOT NULL UNIQUE,
    policy_value INTEGER      NOT NULL
);