DROP TABLE IF EXISTS testtable;

CREATE TABLE testtable (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              textcolumn VARCHAR(250) NOT NULL,
                              numcolumn INT NOT NULL,
                              boolcolumn BOOL DEFAULT NULL
);

INSERT INTO testtable (textcolumn, numcolumn, boolcolumn) VALUES
                                                             ('test1', 25, TRUE),
                                                             ('test2', 0, FALSE),
                                                             ('test3', -324, FALSE);