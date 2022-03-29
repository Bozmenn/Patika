SELECT country FROM country
WHERE country LIKE 'A%a';

SELECT country FROM country
WHERE (country LIKE '%n') AND (LENGTH(country) >= 6);

SELECT * FROM film
WHERE title ILIKE '%t%t%t%t%';

SELECT * FROM film
WHERE (title LIKE 'C%') AND (LENGTH(title) > 90) AND (rental_rate = 2.99);
