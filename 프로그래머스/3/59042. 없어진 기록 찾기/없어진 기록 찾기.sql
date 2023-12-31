-- 코드를 입력하세요
# SELECT ANIMAL_ID, NAME FROM ANIMAL_OUTS
# WHERE ANIMAL_ID NOT IN(
# SELECT AO.ANIMAL_ID FROM ANIMAL_OUTS AO INNER JOIN ANIMAL_INS AI
# ON AO.ANIMAL_ID = AI.ANIMAL_ID
# ) ORDER BY ANIMAL_ID;

SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o
LEFT JOIN ANIMAL_INS i
ON o.ANIMAL_ID = i.ANIMAL_ID
WHERE i.ANIMAL_ID is null
