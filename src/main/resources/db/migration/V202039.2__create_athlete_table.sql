CREATE TYPE gender AS ENUM ('WOMAN', 'MAN');
create table athlete
(
    id         SERIAL PRIMARY KEY,
    ref        varchar(50)  not null,
    team_ref   varchar(50)  not null,
    first_name varchar(255) not null,
    last_name  varchar(255) not null,
    year       int,
    gender     gender,
    team_id    integer,
    CONSTRAINT fk_team FOREIGN KEY (team_id) REFERENCES team(id)
);
