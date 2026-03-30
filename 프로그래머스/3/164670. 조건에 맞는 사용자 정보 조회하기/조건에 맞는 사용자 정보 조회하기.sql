-- 코드를 입력하세요
SELECT
    GU.USER_ID,
    GU.NICKNAME,
    GU.CITY || ' ' || GU.STREET_ADDRESS1 || ' ' || GU.STREET_ADDRESS2 AS "전체주소",
    REGEXP_REPLACE(TLNO, '(\d{3})(\d{4})(\d{4})', '\1-\2-\3') AS "전화번호"
FROM
    USED_GOODS_USER GU
JOIN (
    SELECT
        WRITER_ID
    FROM
        USED_GOODS_BOARD
    GROUP BY
        WRITER_ID
    HAVING
        COUNT(*) >= 3
) GB ON GU.USER_ID = GB.WRITER_ID
ORDER BY
    GU.USER_ID DESC