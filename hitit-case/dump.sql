;             
CREATE USER IF NOT EXISTS "SA" SALT '24cfe135969681f0' HASH 'b9d739066ee6c6d824f956fbbdad5cb71c828a08ce695edadb1fff0dbc1e5845' ADMIN;         
CREATE SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_B4727BF4_349E_4E83_8AA4_672A85D120BD" START WITH 11 BELONGS_TO_TABLE;               
CREATE SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_4D6345C6_4B8B_41DE_9D0C_8598F3C22D3B" START WITH 5 BELONGS_TO_TABLE;
CREATE SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_BD947579_0C0D_4A90_9D57_51E4DED96311" START WITH 2 BELONGS_TO_TABLE;
CREATE CACHED TABLE "PUBLIC"."FLIGHT"(
    "ID" INTEGER DEFAULT (NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_4D6345C6_4B8B_41DE_9D0C_8598F3C22D3B") NOT NULL NULL_TO_DEFAULT SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_4D6345C6_4B8B_41DE_9D0C_8598F3C22D3B",
    "ARRIVAL" VARCHAR(255),
    "DEPARTURE" VARCHAR(255)
);           
ALTER TABLE "PUBLIC"."FLIGHT" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_7" PRIMARY KEY("ID");       
-- 4 +/- SELECT COUNT(*) FROM PUBLIC.FLIGHT;  
INSERT INTO "PUBLIC"."FLIGHT" VALUES
(1, 'Istanbul', 'Ankara'),
(2, 'Istanbul', 'Bangkok'),
(3, 'London', 'Istanbul'),
(4, 'Antalya', 'Ankara');          
CREATE CACHED TABLE "PUBLIC"."PASSENGER"(
    "ID" INTEGER DEFAULT (NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_B4727BF4_349E_4E83_8AA4_672A85D120BD") NOT NULL NULL_TO_DEFAULT SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_B4727BF4_349E_4E83_8AA4_672A85D120BD",
    "AGE" INTEGER CHECK ("AGE" >= 1),
    "EMAIL" VARCHAR(255),
    "FIRST_NAME" VARCHAR(255),
    "LAST_NAME" VARCHAR(255),
    "PHONE" VARCHAR(255)
);        
ALTER TABLE "PUBLIC"."PASSENGER" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_6" PRIMARY KEY("ID");    
-- 4 +/- SELECT COUNT(*) FROM PUBLIC.PASSENGER;               
INSERT INTO "PUBLIC"."PASSENGER" VALUES
(1, 24, 'ugurarabaci0209@gmail.com', STRINGDECODE('U\u011fur'), STRINGDECODE('Arabac\u0131'), '905322641508'),
(2, 9, 'badem@gmail.com', 'Badem', 'Badu', '905325555555'),
(3, 2, 'riko@gmail.com', 'riko', 'abidin', '905324444444'),
(4, 22, 'ugurarabaci0209@gmail.com', 'Kadir', STRINGDECODE('Arabac\u0131'), '905322641501');               
CREATE CACHED TABLE "PUBLIC"."TICKET"(
    "TICKET_ID" INTEGER DEFAULT (NEXT VALUE FOR "PUBLIC"."SYSTEM_SEQUENCE_BD947579_0C0D_4A90_9D57_51E4DED96311") NOT NULL NULL_TO_DEFAULT SEQUENCE "PUBLIC"."SYSTEM_SEQUENCE_BD947579_0C0D_4A90_9D57_51E4DED96311",
    "FLIGHT_ID" INTEGER,
    "PASSENGER_ID" INTEGER
);         
ALTER TABLE "PUBLIC"."TICKET" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_9" PRIMARY KEY("TICKET_ID");
-- 1 +/- SELECT COUNT(*) FROM PUBLIC.TICKET;  
INSERT INTO "PUBLIC"."TICKET" VALUES
(1, 1, 1);              
ALTER TABLE "PUBLIC"."TICKET" ADD CONSTRAINT "PUBLIC"."FK3Y0NR3G8PK6YGC173MJAAUMGH" FOREIGN KEY("PASSENGER_ID") REFERENCES "PUBLIC"."PASSENGER"("ID") NOCHECK;
ALTER TABLE "PUBLIC"."TICKET" ADD CONSTRAINT "PUBLIC"."FKFJU27CBCBL1W16QEORA1R636Q" FOREIGN KEY("FLIGHT_ID") REFERENCES "PUBLIC"."FLIGHT"("ID") NOCHECK;      
