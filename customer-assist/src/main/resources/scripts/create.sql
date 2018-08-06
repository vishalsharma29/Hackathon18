drop table adcopy if exists;
create table adcopy (
  id        int generated by default as identity,
  customer_number          BIGINT,
  customer_name VARCHAR(64) NOT NULL,
  ad_copy_line_1 VARCHAR(400) NOT NULL,
  ad_copy_line_2 VARCHAR(400) NOT NULL,
  ad_copy_line_3 VARCHAR(400) NOT NULL,
  status VARCHAR(400) NOT NULL,
  cost Double NOT NULL,
  clicks          INTEGER
);
drop table Social_Media_Trends if exists;
create table Social_Media_Trends (
  id          int generated by default as identity,
  keyword      VARCHAR(64) NOT NULL,
  twitter_feeds          INTEGER,
);

drop table Recommendation if exists;
create table Recommendation (
  id         int generated by default as identity,
  intent      VARCHAR(64) NOT NULL,
  customer_name  VARCHAR(64) NOT NULL,
  social_media_trends INTEGER,
  custom_message VARCHAR(400) NOT NULL,
  success_response BIT
);

insert into adcopy ( customer_number, customer_name, ad_copy_line_1,  ad_copy_line_2, ad_copy_line_3, status, cost, clicks) values
( 400001, 'My Chevy Dealer', 'New Silverado $17,000 Off MSRP','Over 2,400 Vehicles In Stock', 'Largest Chevy Dealer in the Nation with the Lowest Prices! Visit Bomnin Today.', 'Enabled', 34, 28);
insert into adcopy ( customer_number, customer_name, ad_copy_line_1,  ad_copy_line_2, ad_copy_line_3, status, cost, clicks) values
( 400002, 'Champ Chevy Dealer', 'Visit Karl Chevrolet of Ankeny' , 'More Discounts Than Any Chevy' , 'Dealer In the Area.   Stop By Today & Receive Your Next Quote @ Karl Chevy.',  'Enabled', 31, 47);
insert into adcopy ( customer_number, customer_name, ad_copy_line_1,  ad_copy_line_2, ad_copy_line_3, status, cost, clicks) values
( 400003, 'Excel Chevy Dealer', 'New Silverado $17,000 Off MSRP','Over 2,400 Vehicles In Stock', 'Largest Chevy Dealer in the Nation with the Lowest Prices! Visit Bomnin Today.',  'Enabled', 34, 32);
insert into adcopy ( customer_number, customer_name, ad_copy_line_1,  ad_copy_line_2, ad_copy_line_3, status, cost, clicks) values
( 400004, 'Your Chevy Dealer', 'Universal Hyundai', 'See Our Hyundai Lineup', 'Browse our Hyundai inventory. Truly the Better Place to Buy',  'Enabled', 24, 110);
insert into adcopy ( customer_number, customer_name, ad_copy_line_1,  ad_copy_line_2, ad_copy_line_3, status, cost, clicks) values
( 400005, 'Peoples Chevy Dealer', 'Bomnin Manassas Chevrolet', 'Up To $17,000 Off New Chevys.', 'Browse our Chevy inventory. Committed to Excellence',  'Enabled', 16, 135);
insert into adcopy ( customer_number, customer_name, ad_copy_line_1,  ad_copy_line_2, ad_copy_line_3, status, cost, clicks) values
( 400006, 'Customer Chevy Dealer', 'Bomnin Chevrolet Dadeland', 'Up To $17k Off New Chevys.' , 'Largest Chevy Dealer in the Nation with the Lowest Prices! Shop Bomnin Today.',  'Enabled', 14, 18);
insert into adcopy ( customer_number, customer_name, ad_copy_line_1,  ad_copy_line_2, ad_copy_line_3, status, cost, clicks) values
( 400007, 'Largest Chevy Dealer', 'You Can Afford Luxury', 'View Our Lexus Inventory Now', 'Visit Hendrick Lexus KC For Details',  'Enabled', 5, 9);

