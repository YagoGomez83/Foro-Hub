CREATE TABLE users (
    id_user BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    user_password TEXT NOT NULL,
    active_status BOOLEAN DEFAULT TRUE
);

CREATE TABLE courses (
    id_course BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(100) NOT NULL
);

CREATE TABLE topics (
    id_topic BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    id_course BIGINT NOT NULL,
    id_user BIGINT NOT NULL,
    message TEXT NOT NULL,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    last_edited_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
    active_status BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (id_course) REFERENCES courses(id_course) ON DELETE CASCADE,
    FOREIGN KEY (id_user) REFERENCES users(id_user) ON DELETE CASCADE
);

CREATE TABLE answers (
    id_answer BIGINT AUTO_INCREMENT PRIMARY KEY,
    id_user BIGINT NOT NULL,
    id_topic BIGINT NOT NULL,
    message TEXT NOT NULL,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    last_edited_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL,
    active_status BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (id_user) REFERENCES users(id_user) ON DELETE CASCADE,
    FOREIGN KEY (id_topic) REFERENCES topics(id_topic) ON DELETE CASCADE
);

-- Índices para optimizar las consultas
CREATE INDEX idx_topics_id_course ON topics(id_course);
CREATE INDEX idx_topics_id_user ON topics(id_user);
CREATE INDEX idx_answers_id_topic ON answers(id_topic);
CREATE INDEX idx_answers_id_user ON answers(id_user);
