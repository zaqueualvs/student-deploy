create table student
(
    id           BIGINT NOT NULL AUTO_INCREMENT,
    name         VARCHAR(40),
    age          INT,
    first_note   FLOAT,
    second_note  FLOAT,
    teacher_name VARCHAR(40),
    room_number  INT,

    primary key (id)
)