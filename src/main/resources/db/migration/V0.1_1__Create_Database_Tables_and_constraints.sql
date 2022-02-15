CREATE TABLE PERSON (
    id INTEGER PRIMARY KEY,
    name TEXT
);

CREATE TABLE SERVICE (
    name TEXT,
    id INTEGER PRIMARY KEY
);

CREATE TABLE BUILDING (
    id INTEGER PRIMARY KEY,
    zipcode TEXT,
    latitude TEXT,
    longitude TEXT,
    created_date DATE
);

CREATE TABLE SERVICE_PACK (
    id INTEGER PRIMARY KEY,
    name TEXT
);

CREATE TABLE ORDERS (
    id INTEGER PRIMARY KEY,
    customer_info TEXT,
    purchase_date DATE,
    service_pack_id INTEGER,
    FOREIGN KEY (service_pack_id) REFERENCES SERVICE_PACK (id) ON DELETE RESTRICT
);

CREATE TABLE SERVICE_ORDER (
    id INTEGER PRIMARY KEY,
    start_date DATE,
    end_date DATE,
    finished_picture TEXT,
    person_id INTEGER,
    building_id INTEGER,
    service_id INTEGER,
    order_id INTEGER,
    FOREIGN KEY (person_id) REFERENCES PERSON (id) ON DELETE RESTRICT,
    FOREIGN KEY (building_id) REFERENCES BUILDING (id) ON DELETE RESTRICT,
    FOREIGN KEY (service_id) REFERENCES SERVICE (id),
    FOREIGN KEY (order_id) REFERENCES ORDERS (id)
);

CREATE TABLE SERVICES_IN_PACK (
    service_id INTEGER,
    service_pack_id INTEGER,
    FOREIGN KEY (service_id) REFERENCES SERVICE (id) ON DELETE RESTRICT,
    FOREIGN KEY (service_pack_id) REFERENCES SERVICE_PACK (id) ON DELETE RESTRICT
);
