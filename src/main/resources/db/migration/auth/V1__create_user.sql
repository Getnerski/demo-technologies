CREATE TABLE AUTH_USER (
    ID_USER int8 NOT NULL,
    USER_NAME varchar(255),
    PASSWORD varchar(255),
    FULLNAME varchar(255),
    TOKEN varchar(255),
    REFRESH_TOKEN varchar(255),
    ACTIVE BOOLEAN,
    DAT_CREATED DATE,
    DAT_UPDATED DATE
);

INSERT INTO AUTH_USER (
    ID_USER, USER_NAME, PASSWORD, FULLNAME, TOKEN, REFRESH_TOKEN, ACTIVE, DAT_CREATED, DAT_UPDATED
) values (
    1, 'Getnerski', '123456', 'Thiago Getnerski', '', '', true, now(), now()
);