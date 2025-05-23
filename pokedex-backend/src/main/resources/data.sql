INSERT INTO users (id, username)
VALUES (1, 'ash_ketchum'),
       (2, 'misty') ON CONFLICT DO NOTHING;

INSERT INTO teams (id, name, user_id)
VALUES (1, 'Pallet Town A-Team', 1),
       (2, 'Cerulean Crew', 2) ON CONFLICT DO NOTHING;

INSERT INTO team_pokemon (id, team_id, pokemon_name, position, nickname)
VALUES (1, 1, 'pikachu', 1, 'Sparky'),
       (2, 1, 'charizard', 2, 'Flame'),
       (3, 1, 'bulbasaur', 3, NULL) ON CONFLICT DO NOTHING;


INSERT INTO team_pokemon (id, team_id, pokemon_name, position, nickname)
VALUES (4, 2, 'psyduck', 1, NULL),
       (5, 2, 'starmie', 2, NULL) ON CONFLICT DO NOTHING;