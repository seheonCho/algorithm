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

이름에 el이 들어가는 동물 찾기
SELECT ANIMAL_ID, NAME FROM animal_ins WHERE animal_type = 'Dog' AND (name like '%el%' OR name like '%EL%') ORDER BY NAME

중복 제거하기
SELECT count(A.name) count FROM (
SELECT name FROM animal_ins WHERE name is not NULL GROUP BY name
) A

DATETIME에서 DATE로 형 변환
SELECT animal_id, name, date_format(datetime, '%Y-%m-%d') FROM animal_ins ORDER BY animal_id

NULL 처리하기
SELECT animal_type, coalesce(name, 'No name') as name, sex_upon_intake
FROM animal_ins
ORDER BY animal_id