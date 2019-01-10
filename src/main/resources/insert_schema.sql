
INSERT INTO article (firstName, lastName, email, phone, aadhar_id, pan_id, image, relation, description, likes)
VALUES ('Ram', 'Babu', 'ram.babu@gmail.com', '8888877777', '1111222233334444', 'DDDDD44444', 'https://www.ethicsdaily.com/wp-content/uploads/2018/07/church-state-both-should-seek-image-24450.jpg', 'Servant', 'Christians have sometimes claimed that the eighth commandment, You shall not steal, forbids government from ever mandating the redistribution of wealth for the sake of the poor.', '22');

INSERT INTO article (firstName, lastName, email, phone, aadhar_id, pan_id, image, relation, description, likes)
VALUES ('Lata', 'Kumari', 'lata.kumari@gmail.com', '8888877777', '1111222233334444', 'DDDDD44444', 'https://www.ethicsdaily.com/wp-content/uploads/2018/07/church-state-both-should-seek-image-24450.jpg', 'Servant', 'Christians have sometimes claimed that the eighth commandment, You shall not steal, forbids government from ever mandating the redistribution of wealth for the sake of the poor.', '22');

UPDATE article SET image = 'https://www.ethicsdaily.com/wp-content/uploads/2018/07/church-state-both-should-seek-image-24450.jpg' WHERE firstName = 'Ram';

INSERT INTO users ( name, email, phone, password, aadhar_id, pan_id)
VALUES
('Sam Douglas', 'sam.douglas@gmil.com', '4444433333', 'qwerty123', '0000888866664444', 'RRRRR55555')