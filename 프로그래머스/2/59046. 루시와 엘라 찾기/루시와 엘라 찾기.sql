-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME like 'Lucy' or name like 'Ella' or name like 'Pickle' or name like 'Rogan' or name like 'Sabrina'
or name like 'Mitty'
order by animal_id