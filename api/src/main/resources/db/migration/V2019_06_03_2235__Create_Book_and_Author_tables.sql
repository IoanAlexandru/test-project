CREATE TABLE IF NOT EXISTS authors (
      id int GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
      first_name character varying not null,
      last_name character varying not null
);

CREATE TABLE IF NOT EXISTS books (
      id int GENERATED ALWAYS AS IDENTITY NOT NULL PRIMARY KEY,
      name character varying not null,
      page_count int not null,
      author_id bigint references authors not null
);