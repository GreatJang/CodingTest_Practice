-- 코드를 입력하세요
SELECT ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'

-- ROUND함수 = 소수점 반올림 함수
-- https://velog.io/@donghoim/MySQL-SQL-ROUND-FLOOR-CEIL-%ED%95%A8%EC%88%98