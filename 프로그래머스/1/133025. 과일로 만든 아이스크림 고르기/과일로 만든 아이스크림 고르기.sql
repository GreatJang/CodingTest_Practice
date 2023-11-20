-- 코드를 입력하세요
SELECT a.FLAVOR FROM FIRST_HALF a
    left outer JOIN ICECREAM_INFO b
    ON a.FLAVOR = b.FLAVOR
    where a.TOTAL_ORDER > 3000 and b.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER desc

#     ON b.INGREDIENT_TYPE = 'fruit_based'
#     where a.TOTAL_ORDER > 3000
# ORDER BY TOTAL_ORDER desc