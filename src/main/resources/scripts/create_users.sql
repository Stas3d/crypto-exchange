
CREATE TABLE IF NOT EXISTS users (

      user_id serial PRIMARY KEY,
      user_name VARCHAR(255) UNIQUE NOT NULL,
      user_email VARCHAR(255) UNIQUE NOT NULL,
      user_phone VARCHAR(255),
      user_role VARCHAR(255),
      user_pwd VARCHAR(255) NOT NULL,
      user_authorities VARCHAR(255),
      user_gender VARCHAR(255),
      phone_verified BOOLEAN,
      secondary_email VARCHAR(255) UNIQUE,
      created_on TIMESTAMP default current_timestamp,
      user_last_pwd_changed TIMESTAMP,
      account_non_expired BOOLEAN,
      account_non_locked BOOLEAN,
      credentials_non_expired BOOLEAN,
      user_enabled BOOLEAN
);
