CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

create table if not exists users (
id uuid NOT NULL DEFAULT uuid_generate_v4() PRIMARY KEY,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
password VARCHAR(250) NOT NULL,
birthday DATE NOT NULL,
user_role VARCHAR(50) NOT NULL,
is_user_free BOOLEAN NOT NULL,
van_number INTEGER NOT NULL,
number_of_transports_done INTEGER NOT NULL, -- Only for transporter role --
created_at timestamp NOT NULL,
transport_id uuid,
company_work_for_id uuid
);

create table if not exists company (
    id uuid NOT NULL DEFAULT uuid_generate_v4() PRIMARY KEY,
    company_name VARCHAR(50) NOT NULL,
    created_at timestamp NOT NULL
    -- user admin -> create company -> update user admin to have company id inside  --
);

create table if not exists address (
id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
country VARCHAR(50) NOT NULL,
city VARCHAR(50) NOT NULL,
county VARCHAR(250) NOT NULL,
zip_code VARCHAR(250) NOT NULL,
street_number VARCHAR(250) NOT NULL,
details TEXT NOT NULL,
user_id uuid,
post_id uuid
);

create table if not exists transport (
id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
start_date timestamp NOT NULL,
end_date timestamp NOT NULL,
price VARCHAR(50) NOT NULL,
transport_documents TEXT,
created_at timestamp NOT NULL,
created_by_id uuid NOT NULL,
transporter_id uuid NOT NULL,
start_company_id uuid NOT NULL,
end_company_id uuid NOT NULL
);

create table if not exists customer (
    id uuid DEFAULT uuid_generate_v4() PRIMARY KEY,
    company_name VARCHAR(50) NOT NULL,
    address_id uuid NOT NULL
);


-- User table relationships --

alter table
users
add
constraint fk_TransportUser FOREIGN KEY (transport_id) REFERENCES transport(id);

alter table
users
add
constraint fk_CompanyUser FOREIGN KEY (company_work_for_id) REFERENCES company(id);


-- Transport table relationships --

alter table
transport
add
constraint fk_TransporterTransport FOREIGN KEY (transporter_id) REFERENCES users(id);

alter table
transport
add
constraint fk_CreatedByTransport FOREIGN KEY (created_by_id) REFERENCES users(id);

alter table
transport
add
constraint fk_StartCompanyTransport FOREIGN KEY (start_company_id) REFERENCES customer(id);

alter table
transport
add
constraint fk_EndCompanyTransport FOREIGN KEY (end_company_id) REFERENCES customer(id);


-- Customer table relationships --

alter table
customer
add
constraint fk_AddressCustomer FOREIGN KEY (address_id) REFERENCES address(id);