CREATE TABLE producto (
    id BIGSERIAL PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    precio NUMERIC(15,2) NOT NULL,
    id_empresa INTEGER,
    iva VARCHAR(20) NOT NULL,
    controla_stock BOOLEAN DEFAULT FALSE,
    status boolean DEFAULT TRUE,
    created_at TIMESTAMP DEFAULT NOW()
);