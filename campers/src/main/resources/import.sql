insert into camper (age, name, password, username) values (25, 'Raul', crypt('1234', gen_salt('bf')), 'raul');
insert into activity (name, difficulty) values ('activity 1', 2);
insert into signup (camper_id, activity_id, time) values (1, 1, extract(epoch from Now()));