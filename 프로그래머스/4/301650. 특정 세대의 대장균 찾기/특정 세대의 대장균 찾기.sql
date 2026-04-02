-- 코드를 작성해주세요
WITH RECURSIVE ECOLI_TREE AS (
    SELECT 
        ID,
        PARENT_ID,
        1 AS LEVEL
    FROM 
        ECOLI_DATA
    WHERE
        PARENT_ID IS NULL
    UNION ALL
    SELECT
        C.ID,
        C.PARENT_ID,
        P.LEVEL + 1 AS LEVEL
    FROM
        ECOLI_DATA C
    JOIN
        ECOLI_TREE P ON P.ID = C.PARENT_ID
)
SELECT 
    ID
FROM
    ECOLI_TREE
WHERE
    LEVEL = 3
ORDER BY
    ID