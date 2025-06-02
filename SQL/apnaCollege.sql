use sakila;

SELECT actor.first_name, actor.last_name, COUNT(film.film_id) AS film_count
FROM actor
INNER JOIN film_actor ON actor.actor_id = film_actor.actor_id
INNER JOIN film ON film_actor.film_id = film.film_id
GROUP BY actor.actor_id, actor.first_name, actor.last_name;

SELECT actor.actor_id, actor.first_name, actor.last_name
FROM actor
INNER JOIN film_actor ON actor.actor_id = film_actor.actor_id
INNER JOIN film ON film_actor.film_id = film.film_id
GROUP BY actor.actor_id, actor.first_name, actor.last_name
HAVING COUNT(*) > 20;