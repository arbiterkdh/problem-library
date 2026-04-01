-- 코드를 입력하세요
SELECT
    ID,
    NAME,
    HOST_ID
FROM (
    SELECT 
        ID, 
        NAME,
        HOST_ID,
        COUNT(*) OVER (PARTITION BY HOST_ID) AS COUNT
    FROM 
        PLACES
)
WHERE
    COUNT >= 2
ORDER BY
    ID