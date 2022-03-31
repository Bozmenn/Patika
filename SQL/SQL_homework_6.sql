SELECT ROUND(AVG(rental_rate),2) FROM film;

SELECT COUNT(*) FROM film
WHERE title LIKE 'C%';

SELECT Max(length) FROM film
WHERE rental_rate = 0.99

SELECT DISTINCT(replacement_cost) FROM film
WHERE length > 150;


