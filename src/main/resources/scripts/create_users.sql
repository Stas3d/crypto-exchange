
CREATE TABLE IF NOT EXISTS users(

      user_id serial NOT NULL,
      user_name VARCHAR(255) NOT NULL,
      user_email VARCHAR(255) NOT NULL UNIQUE,
      user_pwd VARCHAR(255) NOT NULL,
      user_last_pwd_changed TIMESTAMP,
      secondary_email VARCHAR(255),
      created_on TIMESTAMP NOT NULL,
      user_phone VARCHAR(255),
      phone_verified BOOLEAN,
      user_birthday DATE,
      user_authorities VARCHAR(255),
      account_non_expired BOOLEAN,
      user_role VARCHAR(255),
      user_gender VARCHAR(255),
      account_non_locked BOOLEAN,
      credentials_non_expired BOOLEAN,
      user_enabled BOOLEAN,
      PRIMARY KEY (user_id)
    );
