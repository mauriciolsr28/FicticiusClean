CREATE TABLE IF NOT EXISTS cars (
	id serial PRIMARY KEY,
	name VARCHAR (80) NOT NULL,
	brand VARCHAR (80) NOT NULL,
	model VARCHAR (80) NOT NULL,
    manufacturing_date VARCHAR (4) NOT NULL,
	city_consumption FLOAT NOT NULL,
	highway_consumption FLOAT NOT NULL
);