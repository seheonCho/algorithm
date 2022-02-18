모든 레코드 조회하기
SELECT animal_id, animal_type, datetime, intake_condition, name, sex_upon_intake FROM animal_ins ORDER BY animal_id

최댓값 구하기
SELECT MAX(DATETIME) FROM animal_ins