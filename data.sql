DROP TABLE IF EXISTS camper CASCADE;

CREATE TABLE camper (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER,
    username TEXT NOT NULL,
    password TEXT NOT NULL
);

DROP TABLE IF EXISTS activity CASCADE;

CREATE TABLE activity (
    id INTEGER PRIMARY KEY,
    name TEXT,
    difficulty INTEGER
);

DROP TABLE IF EXISTS signup;

CREATE TABLE signup (
    id INTEGER PRIMARY KEY,
    camper_id INTEGER,
    activity_id INTEGER,
    time INTEGER,
    CONSTRAINT camper_id FOREIGN KEY (camper_id) REFERENCES camper (id),
    CONSTRAINT activity_id FOREIGN KEY (activity_id) REFERENCES activity (id),
    CONSTRAINT camper_activity UNIQUE (camper_id, activity_id)
);
