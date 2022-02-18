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