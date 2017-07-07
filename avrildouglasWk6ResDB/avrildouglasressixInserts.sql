use avrildouglasressix;
insert into user(email, enabled, first_name, last_name, `password`, username) values("ljones@google.com", 1, "Larry", "Jones", "user1", "ljones");
insert into user(email, enabled, first_name, last_name, `password`, username) values("mmary@yahoo.com", 1, "Mark", "Mary", "user2", "mmary");
insert into user(email, enabled, first_name, last_name, `password`, username) values("nsmith@google.com", 1, "Nancy", "Smith", "recruit1", "nsmith");
insert into user(email, enabled, first_name, last_name, `password`, username) values("ofox@yahoo.com", 1, "Omery", "Fox", "recruit2", "ofox");
insert into user(email, enabled, first_name, last_name, `password`, username) values("pmanning@verizon.net", 1, "Peter", "Manning", "seeker1", "pmanning");
insert into user(email, enabled, first_name, last_name, `password`, username) values("rturner@comcast.net", 1, "Robert", "Turner", "seeker2", "rturner");
insert into user(email, enabled, first_name, last_name, `password`, username) values("vbrad@montgomerycollege.edu", 1, "Veronica", "Brad", "resaccess", "vbrad");


insert into role(role) values("ADMIN");
insert into role(role) values("JOBSEEKER");
insert into role(role) values("RECRUITER");
insert into role(role) values("USER");