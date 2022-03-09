CREATE TYPE public.user_role AS ENUM('Owner', 'Viewer', 'Editor');

CREATE TYPE public.form_variant AS ENUM('Kanban', 'Note', 'Table');

CREATE TABLE public.user_info
(
    user_id bigserial PRIMARY KEY,
    user_name varchar(60),
    user_password varchar(255),
    last_activity timestamp with time zone
);

CREATE TABLE public.form
(
    form_id bigserial PRIMARY KEY,
    form_title varchar(60),
    form_type form_variant,
    created timestamp,
    updated timestamp
);

CREATE TABLE public.user_form
(
    user_id bigint REFERENCES user_info(user_id),
    form_id bigint REFERENCES form(form_id),
    user_role_in_form user_role
);

CREATE TABLE public.element_definition
(
    element_id bigserial PRIMARY KEY,
    element_name varchar(60)
);

CREATE TABLE public.element_on_form
(
    element_on_form_id bigserial PRIMARY KEY,
    element_id bigint REFERENCES element_definition(element_id),
    form_id bigint REFERENCES form(form_id)
);

CREATE TABLE public.element_attribute
(
    attribute_id bigserial PRIMARY KEY,
    attribute_name varchar(255)
);

CREATE TABLE public.element_attribute_value
(
    element_on_form_id bigint REFERENCES element_on_form(element_on_form_id),
    attribute_id bigint REFERENCES element_attribute(attribute_id),
    attribute_value varchar(255)
);

CREATE INDEX user_form_user_id_idx ON user_form(user_id);
CREATE INDEX user_form_form_id_idx ON user_form(form_id);
CREATE INDEX element_on_form_form_id_idx ON element_on_form(form_id);
CREATE INDEX element_attribute_value_element_on_form_id_idx ON element_attribute_value(element_on_form_id);
CREATE INDEX element_attribute_value_attribute_id_idx ON element_attribute_value(attribute_id);