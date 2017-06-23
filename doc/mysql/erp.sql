CREATE TABLE `test`.`userinfo` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `username` VARCHAR(45) NULL COMMENT '',
  `password` VARCHAR(45) NULL COMMENT '',
  `usertype` VARCHAR(45) NULL COMMENT '',
  `realname` VARCHAR(45) NULL COMMENT '',
  `consumerId` VARCHAR(100) NULL COMMENT '',
  `privateKey` VARCHAR(10000) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');


CREATE TABLE `test`.`item` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` INT NOT NULL  COMMENT '',
  `mart` VARCHAR(45) NULL COMMENT '',
  `sku` VARCHAR(45) NULL COMMENT '',
  `wpid` VARCHAR(45) NULL COMMENT '',
  `upc` VARCHAR(45) NULL COMMENT '',
  `gtin` VARCHAR(45) NULL COMMENT '',
  `productName` VARCHAR(10000) NULL COMMENT '',
  `productType` VARCHAR(45) NULL COMMENT '',
  `currency` VARCHAR(45) NULL COMMENT '',
  `price_amount` DOUBLE(10,3) NULL COMMENT '',
  `publishedStatus` VARCHAR(45) NULL COMMENT '',
   `unit` VARCHAR(45) NULL COMMENT '',
  `inv_amount` INT NULL COMMENT '',
  `fulfillmentLagTime` INT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');
  

CREATE TABLE `test`.`feed` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` INT NOT NULL  COMMENT '',
  `feedId` VARCHAR(45) NULL COMMENT '',
  `feedType` VARCHAR(45) NULL COMMENT '',
  `itemsReceived` INT NULL COMMENT '',
  `itemsSucceeded` INT NULL COMMENT '',
  `itemsFailed` INT NULL COMMENT '',
  `itemsProcessing` INT NULL COMMENT '',
  `feedStatus` VARCHAR(45) NULL COMMENT '',
  `feedDate` DATETIME NULL COMMENT '',
  `modifiedDtm` DATETIME NULL COMMENT '',
  `itemDataErrorCount` INT NULL COMMENT '',
  `itemSystemErrorCount` INT NULL COMMENT '',
  `itemTimeoutErrorCount` INT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');

CREATE TABLE `test`.`orders` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `userId` INT NOT NULL  COMMENT '',
  `purchaseOrderId` VARCHAR(200) NULL COMMENT '',
  `customerOrderId` VARCHAR(200) NULL COMMENT '',
  `customerEmailId` VARCHAR(200) NULL COMMENT '',
  `orderDate` DATETIME  NULL COMMENT '',
  `orderStatus` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');
  
  CREATE TABLE `test`.`orderitem` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `lineNumber` VARCHAR(45) NULL COMMENT '',
  `sku` VARCHAR(200) NULL COMMENT '',
  `amount` DOUBLE(10,3) NULL COMMENT '',
  `unit` VARCHAR(45) NULL COMMENT '',
  `orderId` INT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');


truncate table test.userinfo;

SELECT * FROM test.userinfo;



















