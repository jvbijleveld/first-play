# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table instruction (
  id                            integer autoincrement not null,
  recipe_id                     integer,
  instruction                   varchar(255) not null,
  constraint pk_instruction primary key (id)
);

create table recipe (
  id                            integer autoincrement not null,
  name                          varchar(255) not null,
  description                   varchar(255),
  owner                         varchar(255),
  constraint pk_recipe primary key (id)
);

alter table instruction add constraint fk_instruction_recipe_id foreign key (recipe_id) references recipe (id) on delete restrict on update restrict;
create index ix_instruction_recipe_id on instruction (recipe_id);


# --- !Downs

alter table instruction drop constraint if exists fk_instruction_recipe_id;
drop index if exists ix_instruction_recipe_id;

drop table if exists instruction;

drop table if exists recipe;

