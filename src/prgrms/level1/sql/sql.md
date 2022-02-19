모든 레코드 조회하기
SELECT animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake FROM animal_ins ORDER BY animal_id

최댓값 구하기
SELECT MAX(DATETIME) FROM animal_ins

이름이 없는 동물의 아이디
SELECT animal_id FROM animal_ins WHERE name IS NULL기

역순 정렬하기
SELECT name, datetime FROM animal_ins ORDER BY animal_id DESC

이름이 있는 동물의 아이디
SELECT animal_id FROM animal_ins WHERE name IS NOT NULL

아픈 동물 찾기
SELECT animal_id, name FROM animal_ins WHERE intake_condition = 'Sick'

어린 동물 찾름
SELECT animal_id, name FROM animal_ins WHERE intake_condition != 'Aged' ORDER BY animal_id

동물의 아이디와 이름
SELECT animal_id, name FROM animal_ins ORDER BY animal_id

상위 n개 레코드
SELECT name FROM animal_ins ORDER BY DATETIME LIMIT 1

여러 기준으로 정렬하기
SELECT animal_id, name, datetime FROM animal_ins ORDER BY name, datetime DESC