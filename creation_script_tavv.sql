CREATE TABLE "usuario" (
"id_login" serial NOT NULL,
"nome" varchar(50) NOT NULL,
"senha" varchar(60) NOT NULL,
"excluido" 
PRIMARY KEY ("id_login"),
CONSTRAINT "username" UNIQUE ("nome")
)
WITHOUT OIDS;
CREATE TABLE "cliente" (
"cliente_id" serial NOT NULL,
"nome" varchar(50) NOT NULL,
"endereco" varchar(45),
"limite_de_credito" double precision NOT NULL,
"nomefantasia" varchar(45),
"cpf" varchar(50),
"cnpj" varchar(50),
"excluido" boolean NOT NULL,
CONSTRAINT "cnpj" UNIQUE ("cnpj"),
CONSTRAINT "cpf" UNIQUE ("cpf"),
PRIMARY KEY ("cliente_id")
)
WITHOUT OIDS;

CREATE TABLE "conta" (
"conta_id" serial NOT NULL,
"total" double precision,
"data_vencimento" date,
"fk_cliente_id" serial NOT NULL,
"excluido" boolean NOT NULL,
PRIMARY KEY ("conta_id") 
)
WITHOUT OIDS;
CREATE TABLE "compra" (
"compra_id" serial NOT NULL,
"data" date NOT NULL,
"fk_conta_id" serial NOT NULL,
"excluido" boolean NOT NULL,
PRIMARY KEY ("compra_id") 
)
WITHOUT OIDS;
CREATE TABLE "produto" (
"produto_id" serial NOT NULL,
"nome" varchar(45) NOT NULL,
"preco" double precision NOT NULL,
"estoque" integer NOT NULL,
"codigo_de_barras" varchar(45) NOT NULL,
"tipo_de_uva" varchar(45) NOT NULL,
"pais_de_origem" varchar(45) NOT NULL,
"tipo_de_vinho" varchar(45) NOT NULL,
"fk_compra_id" serial NOT NULL,
"excluido" boolean NOT NULL,
PRIMARY KEY ("produto_id") 
)
WITHOUT OIDS;
CREATE TABLE "fatura" (
"fatura_id" serial NOT NULL,
"quantidade_parcelas" integer,
"data_quitacao" date,
"juros" double precision,
"conta_id" serial NOT NULL,
"excluido" boolean NOT NULL,
PRIMARY KEY ("fatura_id")
)
WITHOUT OIDS;
CREATE TABLE "endereco" (
"endereco_id" serial NOT NULL,
"logradouro" varchar(50) NOT NULL,
"cep" varchar(15) NOT NULL,
"numero" integer NOT NULL,
"complemento" varchar(20) NOT NULL,
"bairro" varchar(45) NOT NULL,
"municipio" varchar(45) NOT NULL,
"estado" varchar(20) NOT NULL,
"tipo_endereco" integer NOT NULL,
"excluido" boolean NOT NULL,
"fk_cliente_id" serial,
PRIMARY KEY ("endereco_id") 
)
WITHOUT OIDS;
CREATE TABLE "pagamento" (
"pagamento_id" serial NOT NULL,
"valor" double precision,
"tipo" integer,
"juros" double precision,
"fk_fatura_id" serial NOT NULL,
"excluido" boolean NOT NULL,
PRIMARY KEY ("pagamento_id", "fk_fatura_id") 
)
WITHOUT OIDS;

ALTER TABLE "conta" ADD CONSTRAINT "fk_cliente_id" FOREIGN KEY ("fk_cliente_id") REFERENCES "cliente" ("cliente_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "compra" ADD CONSTRAINT "fk_conta_conta_id" FOREIGN KEY ("fk_conta_id") REFERENCES "conta" ("conta_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "produto" ADD CONSTRAINT "fk_compra_id" FOREIGN KEY ("fk_compra_id") REFERENCES "compra" ("compra_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "endereco" ADD CONSTRAINT "fk_cliente_id" FOREIGN KEY ("fk_cliente_id") REFERENCES "cliente" ("cliente_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "fatura" ADD CONSTRAINT "fk_conta_conta_id" FOREIGN KEY ("conta_id") REFERENCES "conta" ("conta_id") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "pagamento" ADD CONSTRAINT "fk_fatura_id" FOREIGN KEY ("fk_fatura_id") REFERENCES "fatura" ("fatura_id") ON DELETE NO ACTION ON UPDATE NO ACTION;

