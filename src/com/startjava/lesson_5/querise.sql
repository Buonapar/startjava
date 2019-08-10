SELECT * FROM jaegers;

SELECT * FROM jaegers WHERE status = 'Functioning';

SELECT * FROM jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6';

SELECT * FROM jaegers ORDER BY mark DESC;

SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

SELECT * FROM jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jaegers);

SELECT AVG(weight) FROM jaegers;

UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Functioning';

DELETE FROM jaegers WHERE status = 'Destroyed';