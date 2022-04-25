create table REGIONS
(
    ID         INTEGER           not null,
    NAME       CHARACTER VARYING not null,
    SHORT_NAME CHARACTER VARYING not null,
    constraint REGIONS_PK primary key (ID)
);