create table course (
    id serial primary key,
    name varchar(25),
    capacity integer check (capacity > 5 and capacity < 30)
    );

create table student (
    course_id integer,
    id   serial primary key,
    name varchar(25),
    age  integer check (age > 18 and age < 100),
    foreign key (course_id) references course (id)
);

create table lesson (
    student_id integer,
    course_id integer,
    foreign key (student_id) references student (id),
    foreign key (course_id) references course (id),
    topic            varchar(25),
    count_of_lessons integer check (count_of_lessons > 0)
);
