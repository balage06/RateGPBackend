INSERT INTO user VALUES(1, true, true, true, true, '$2a$04$sphfJO/4c6RMGuJBdh26HuELv0fMCk.hynMSOIdh6mvM6D.I1vy6u', 'user');
INSERT INTO user VALUES(2, true, true, true, true, '$2a$04$5VpfUJDm/4HCdpuXZ5tGQuE7FfyOm/uRK4.bavriVqzF99t2kNfNe', 'user1');
INSERT INTO user VALUES(3, true, true, true, true, '$2a$04$JbKSHwFNcDcHgxeWSDgMAuqG02iNW2g9zR5VgMJdSR7JFdGL/ShJe', 'user2');

INSERT INTO serie VALUES(1, 'FIA FORMULA 1 WORLD CHAMPIONSHIP');
INSERT INTO serie VALUES(2, 'FIA FORMULA 2 CHAMPIONSHIP');
INSERT INTO serie VALUES(3, 'FIA FORMULA 3 EUROPEAN CHAMPIONSHIP');
INSERT INTO serie VALUES(4, 'GP3 SERIES');

INSERT INTO event VALUES(1, '2018 AUSTRALIAN GRAND PRIX');
INSERT INTO event VALUES(2, '2018 CHINESE GRAND PRIX');
INSERT INTO event VALUES(3, '2018 BAHRAIN GRAND PRIX');
INSERT INTO event VALUES(4, '2018 AZERBAIJAN GRAND PRIX');
INSERT INTO event VALUES(5, '2018 SPANISH GRAND PRIX');

INSERT INTO event VALUES(6, '2018 F2 BAHRAIN FEATURE RACE');
INSERT INTO event VALUES(7, '2018 F2 BAHRAIN SPRINT RACE');
INSERT INTO event VALUES(8, '2018 F2 AZERBAIJAN FEATURE RACE');
INSERT INTO event VALUES(9, '2018 F2 AZERBAIJAN SPRINT RACE');
INSERT INTO event VALUES(10, '2018 F2 SPAIN FEATURE RACE');
INSERT INTO event VALUES(11, '2018 F2 SPAIN SPRINT RACE');

INSERT INTO event VALUES(12, '2018 GP3 SPAIN FEATURE RACE');
INSERT INTO event VALUES(13, '2018 GP3 SPAIN SPRINT RACE');

INSERT INTO event VALUES(14, '2018 F3 PAU GRAND PRIX RACE 1');
INSERT INTO event VALUES(15, '2018 F3 PAU GRAND PRIX RACE 2');
INSERT INTO event VALUES(16, '2018 F3 PAU GRAND PRIX RACE 3');

INSERT INTO serie_events VALUES(1, 1);
INSERT INTO serie_events VALUES(1, 2);
INSERT INTO serie_events VALUES(1, 3);
INSERT INTO serie_events VALUES(1, 4);
INSERT INTO serie_events VALUES(1, 5);

INSERT INTO serie_events VALUES(2, 6);
INSERT INTO serie_events VALUES(2, 7);
INSERT INTO serie_events VALUES(2, 8);
INSERT INTO serie_events VALUES(2, 9);
INSERT INTO serie_events VALUES(2, 10);
INSERT INTO serie_events VALUES(2, 11);

INSERT INTO serie_events VALUES(4, 12);
INSERT INTO serie_events VALUES(4, 13);

INSERT INTO serie_events VALUES(3, 14);
INSERT INTO serie_events VALUES(3, 15);
INSERT INTO serie_events VALUES(3, 16);