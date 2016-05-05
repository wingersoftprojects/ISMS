ALTER TABLE bill ADD CONSTRAINT billshift FOREIGN KEY (shiftid) REFERENCES shift (shiftid);
ALTER TABLE bill ADD CONSTRAINT staffbill FOREIGN KEY (staffid) REFERENCES staff (staffid);
