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

흉부외과 또는 일반외과 의사 목록 출력하기
select dr_name, dr_id, mcdp_cd, date_format(hire_ymd, '%Y-%m-%d')
from doctor
where mcdp_cd = 'CS' OR mcdp_cd = 'GS'
order by hire_ymd desc, dr_name

경기도에 위치한 식품창고 목록 출력하기
select warehouse_id, warehouse_name, address, coalesce(freezer_yn, 'N') freezer_yn
from food_warehouse
where address like '경기도%'
order by warehouse_id

강원도에 위치한 생산공장 목록 출력하기
select factory_id, factory_name, address
from food_factory
where address like '강원도%'
order by factory_id

가장 비싼 상품 구하기
select max(price) MAX_PRICE
from product

조건에 맞는 회원수 구하기
select count(*) users
from user_info
where date_format(joined, '%Y') = 2021
and age between 20 and 29

과일로 만든 아이스크림 고르기
select a.flavor
from icecream_info a left outer join first_half b
on a.flavor = b.flavor
where a.ingredient_type = 'fruit_based'
and b.total_order > 3000
order by b.total_order desc