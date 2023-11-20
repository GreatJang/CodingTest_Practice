SELECT a.FLAVOR FROM FIRST_HALF a
    left outer JOIN ICECREAM_INFO b
    ON a.FLAVOR = b.FLAVOR
    where a.TOTAL_ORDER > 3000 and b.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER desc

-- LEFT OUTER Join
-- OUTER Join 블로그
-- https://hongong.hanbit.co.kr/sql-%EA%B8%B0%EB%B3%B8-%EB%AC%B8%EB%B2%95-joininner-outer-cross-self-join/