WITH RECURSIVE number_sequence(HOUR) AS (
    SELECT 0
    UNION ALL
    SELECT HOUR + 1 FROM number_sequence WHERE HOUR < 23
    )
select HOUR, 0 as COUNT from number_sequence
-- 1. HOUR, COUNT 테이블 생성해서 HOUR 0-23, COUNT 0으로 값 채워넣는 쿼리

where HOUR not in (select cast(DATE_FORMAT(DATETIME, '%H') as signed) as HOUR FROM ANIMAL_OUTS)
-- 2. 1에서 생성한 테이블에서 ANIMAL_OUTS테이블에서 시간대별 COUNT 값 있는부분 제외(not in)

union
SELECT cast(DATE_FORMAT(DATETIME, '%H')as signed) as HOUR, count(*) as count
FROM ANIMAL_OUTS group by HOUR
ORDER BY HOUR
-- 3. ANIMAL_OUTS 테이블에서 시간대별 COUNT 값 있는 부분과 2에서 생성한 테이블 union