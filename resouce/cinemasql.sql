-- Créer la base de données
CREATE DATABASE cinema_management;

-- Utiliser la base de données
USE cinema_management;

-- Créer la table utilisateurs
CREATE TABLE utilisateurs (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);

-- Insérer des données de test
INSERT INTO utilisateurs (username, password) VALUES
('admin', 'admin123'),
('user1', 'password1'),
('user2', 'password2');

-- Vérifier les données
SELECT * FROM utilisateurs;
-- Create the database
CREATE DATABASE IF NOT EXISTS cinema_management;
USE cinema_management;

-- Users Table (for authentication)
CREATE TABLE IF NOT EXISTS users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role ENUM('admin', 'staff') NOT NULL
);

-- Movies Table (to store movie details)
CREATE TABLE IF NOT EXISTS movies (
    movie_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    genre VARCHAR(50) NOT NULL,
    duration INT NOT NULL, -- Duration in minutes
    release_date DATE NOT NULL,
    poster_path VARCHAR(255) -- Path to the movie poster image
);

-- Showtimes Table (to store showtime details)
CREATE TABLE IF NOT EXISTS showtimes (
    showtime_id INT AUTO_INCREMENT PRIMARY KEY,
    movie_id INT NOT NULL,
    show_date DATE NOT NULL,
    show_time TIME NOT NULL,
    hall_number INT NOT NULL,
    available_seats INT NOT NULL, -- Number of available seats
    FOREIGN KEY (movie_id) REFERENCES movies(movie_id) ON DELETE CASCADE
);

-- Tickets Table (to store ticket details)
CREATE TABLE IF NOT EXISTS tickets (
    ticket_id INT AUTO_INCREMENT PRIMARY KEY,
    showtime_id INT NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    seat_number INT NOT NULL,
    seat_type ENUM('Standard', 'Premium') NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (showtime_id) REFERENCES showtimes(showtime_id) ON DELETE CASCADE
);


-- Insert sample data for testing

-- Insert users
INSERT INTO users (username, password, role) VALUES
('admin', 'admin123', 'admin'), -- Password should be hashed in a real application
('user', 'user', 'staff');

-- Insert movies
INSERT INTO movies (title, genre, duration, release_date, poster_path) VALUES
('Inception', 'Sci-Fi', 148, '2010-07-16', 'path/to/inception_poster.jpg'),
('The Dark Knight', 'Action', 152, '2008-07-18', 'path/to/dark_knight_poster.jpg'),
('Interstellar', 'Adventure', 169, '2014-11-07', 'path/to/interstellar_poster.jpg');

-- Insert showtimes
INSERT INTO showtimes (movie_id, show_date, show_time, hall_number, available_seats) VALUES
(1, '2023-10-25', '18:00:00', 1, 100),
(2, '2023-10-25', '20:00:00', 2, 120),
(3, '2023-10-26', '15:00:00', 1, 100);

-- Insert tickets
INSERT INTO tickets (showtime_id, customer_name, seat_number, seat_type, price) VALUES
(1, 'John Doe', 5, 'Standard', 10.00),
(1, 'Jane Smith', 6, 'Premium', 15.00),
(2, 'Alice Johnson', 10, 'Standard', 10.00);


