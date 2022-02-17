고양이와 개는 몇 마리 있을까
SELECT animal_type, COUNT(animal_type) AS count FROM animal_ins
WHERE animal_type IN ('Cat', 'Dog')
GROUP BY animal_type ORDER BY animal_type

루시와 엘라 찾기
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')

동물 수 구하기
SELECT COUNT(ANIMAL_TYPE) as count FROM ANIMAL_INS

동명 동물 수 찾기
SELECT NAME, COUNT(name) as COUNT FROM animal_ins GROUP BY name having COUNT(name) >= 2 ORDER BY name

최솟값 구하기
SELECT MIN(DATETIME) as 시간 FROM animal_ins