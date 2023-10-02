/* Переименование таблицы */
alter table course rename to optional_course;

/* Переименование поля таблицы */
alter table lesson rename column count_of_lessons to lessons_count;

/* Смена типа поля */
alter table lesson alter column topic type text;

/* Добавление ограничений NOT NULL */
alter table student alter column name set NOT NULL;

/* Добавление ограничений UNIQUE на поле */
alter table course add constraint unique_name unique (name);