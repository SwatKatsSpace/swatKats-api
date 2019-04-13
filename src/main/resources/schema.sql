-- installing uuid extenstion
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
-- users
CREATE TABLE users (
uuid uuid DEFAULT uuid_generate_v4 (),
name text,
email text,
phone text,
password text,
aadhar_id text NOT NULL,
pan_id text,
CONSTRAINT user_constraint PRIMARY KEY (email, phone)
);

CREATE TABLE user_details (
    uuid uuid,
    address json,
    info json);


CREATE TABLE article (
  uuid uuid DEFAULT uuid_generate_v4 (),
  firstName text,
  lastName text,
  email text,
  phone text,
  aadhar_id text,
  pan_id text,
  image text,
  relation text,
  description text,
  likes text
);

CREATE TABLE article_details (
    uuid uuid,
    photo text ARRAY[10],
    lat text,
    lng text,
    address json,
    info json);

CREATE TYPE category AS ENUM ('Notconfirmed','Coming', 'Notcoming', 'Maycome');

CREATE TABLE article_metadata (
    uuid uuid,
    description text,
    category category,
    tags text ARRAY[10]);

CREATE TABLE article_finance_details (
    uuid uuid,
    bank_account_number text,
    ifsc_code text,
    bank_name text,
    name_on_account text);

CREATE TABLE logged_in_user (
    uuid uuid PRIMARY KEY,
    jw_token text,
);