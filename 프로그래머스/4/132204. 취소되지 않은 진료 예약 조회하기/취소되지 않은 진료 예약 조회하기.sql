-- 코드를 입력하세요
SELECT
    A.APNT_NO,
    P.PT_NAME,
    A.PT_NO,
    A.MCDP_CD,
    D.DR_NAME,
    A.APNT_YMD
FROM (
    SELECT
        APNT_YMD,
        APNT_NO,
        PT_NO,
        MCDP_CD,
        MDDR_ID
    FROM
        APPOINTMENT
    WHERE
        TO_CHAR(APNT_YMD, 'YYYYMMDD') = '20220413'
    AND APNT_CNCL_YMD IS NULL
    AND MCDP_CD = 'CS'
) A
JOIN 
    PATIENT P ON A.PT_NO = P.PT_NO
JOIN 
    DOCTOR D ON A.MDDR_ID = D.DR_ID
ORDER BY
    A.APNT_YMD