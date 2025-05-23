INSERT INTO users (id, username)
VALUES (1, 'ash'), (2, 'misty')
ON CONFLICT (id) DO NOTHING;

INSERT INTO teams (id, name, user_id)
VALUES (1, 'Ash Team', 1),
       (2, 'Misty Team', 2)
ON CONFLICT (id) DO NOTHING;