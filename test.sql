create table phone_numbers
(
    id           bigint auto_increment
        primary key,
    fio          varchar(255)  null,
    snils        varchar(50)   null,
    address      varchar(1000) null,
    phone_number varchar(50)   null
);
create unique index phone_numbers_phone_number_uindex
    on phone_numbers (phone_number);

insert into phone_numbers (fio, snils, phone_number, address)
VALUES ('Дима', '45866655', '+79058547199', 'Kurgan'),
       ('Коля', '45866655', '+79058547555', 'Moscow');