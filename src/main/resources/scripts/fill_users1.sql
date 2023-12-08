

INSERT INTO "users" (user_name, user_email, user_pwd, user_phone, user_role, account_non_expired, account_non_locked, credentials_non_expired, user_enabled)
    values ('Kolya', 'kolya@domain.com', '$2a$12$ajuIIpJsHprUWvZGP2Pqv.z1Kb7ADWIjftgxfV5WrphR4RwA1Ctvq', '068', 'ADMIN', 'true', 'true', 'true', 'true');
INSERT INTO "users" (user_name, user_email, user_pwd, user_phone, user_role, account_non_expired, account_non_locked, credentials_non_expired, user_enabled)
    values ('Bobby', 'bobby@domain.com', '$2a$12$iCPLIIlvE2sH5WgFxhGuT.mOgUK.8teEkAcNLsM6wMXW4XQnHDojq', '067', 'ADMIN', 'true', 'true', 'true', 'true');
INSERT INTO "users" (user_name, user_email, user_pwd, user_phone, user_role, account_non_expired, account_non_locked, credentials_non_expired, user_enabled)
    values ('Lenny', 'lenny@domain.com', '$2a$12$Vho6LPf2iC.0BqaLatmq1.oBvg6UsWOe6i5SZyy85/v.jCbDSF4tC', '069', 'DEFAULT', 'true', 'true', 'true', 'true');
INSERT INTO "users" (user_name, user_email, user_pwd, user_phone, user_role, account_non_expired, account_non_locked, credentials_non_expired, user_enabled)
    values ('thomas', 'thomas@domain.com', '$2a$10$6fJaLKwQ3sHsuv.PT8h6CO/zx9wspxY9cr4yZXFykQq3.9KeeM9cK', '069', 'ADMIN', 'true', 'true', 'true', 'true');

--INSERT INTO "users" (user_name, user_email, user_pwd, created_on, user_phone)
--    values ('Kolya', 'kolya@domain.com', '$2a$12$ajuIIpJsHprUWvZGP2Pqv.z1Kb7ADWIjftgxfV5WrphR4RwA1Ctvq', current_timestamp,'068');
--INSERT INTO "users" (user_name, user_email, user_pwd, created_on, user_phone)
--    values ('Bobby', 'bobby@domain.com', '$2a$12$iCPLIIlvE2sH5WgFxhGuT.mOgUK.8teEkAcNLsM6wMXW4XQnHDojq', current_timestamp,'067');
--INSERT INTO "users" (user_name, user_email, user_pwd, created_on, user_phone)
--    values ('Lenny', 'lenny@domain.com', '$2a$12$Vho6LPf2iC.0BqaLatmq1.oBvg6UsWOe6i5SZyy85/v.jCbDSF4tC', current_timestamp,'069');
--INSERT INTO "users" (user_name, user_email, user_pwd, created_on, user_phone)
--    values ('thomas', 'thomas@domain.com', '$2a$10$6fJaLKwQ3sHsuv.PT8h6CO/zx9wspxY9cr4yZXFykQq3.9KeeM9cK', current_timestamp,'069');
