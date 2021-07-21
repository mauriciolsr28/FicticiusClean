CREATE TABLE IF NOT EXISTS cars (
	id serial PRIMARY KEY,
	name VARCHAR ( 200 ) NOT NULL,
	brand VARCHAR ( 80 ) NOT NULL,
	model VARCHAR ( 80 ) NOT NULL,
	manufacturingData DATE NOT NULL,
	cityConsumption VARCHAR ( 6 ) NOT NULL,
	highwayConsumption VARCHAR ( 6 ) NOT NULL
);