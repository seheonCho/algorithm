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

입양 시각 구하기(1)
SELECT HOUR(datetime) AS HOUR, COUNT(datetime) AS COUNT
FROM animal_outs
WHERE HOUR(datetime) >= 9
AND HOUR(datetime) <= 19
GROUP BY HOUR(datetime)
ORDER BY HOUR

중성화 여부 파악하기
SELECT animal_id, name,
CASE WHEN (SEX_UPON_INTAKE LIKE '%NEUTERED%' OR SEX_UPON_INTAKE LIKE '%SPAYED%') THEN 'O' ELSE 'X' END AS '중성화'
FROM animal_ins
ORDER BY animal_id

나이 정보가 없는 회원 수 구하기
select count(*) users from user_info where age is null

재구매가 일어난 상품과 회원 리스트 구하기
select user_id, product_id
from online_sale
group by user_id, product_id
having count(*) >= 2
order by user_id, product_id desc

가격대 별 상품 개수 구하기
select truncate(price, -4) as PRICE_GROUP, count(product_id) as PRODUCTS
from product
group by PRICE_GROUP
order by PRICE_GROUP

성분으로 구분한 아이스크림 총 주문량
select b.ingredient_type, sum(a.total_order) as total_order
from first_half a left outer join icecream_info b
on a.flavor = b.flavor
group by b.ingredient_type
order by total_order

3월에 태어난 여성 회원 목록 출력하기
select member_id, member_name, gender, date_format(date_of_birth, '%Y-%m-%d') as date_of_birth
from member_profile
where date_format(date_of_birth, '%m') = '03'
and gender = 'W'
and tlno != ''
order by member_id

12세 이하인 여자 환자 목록 출력하기
select pt_name, pt_no, gend_cd, age,
case when tlno is null then 'NONE' else tlno end tlno
from patient
where age <= 12
and gend_cd = 'W'
order by age desc, pt_name

카테고리 별 상품 개수 구하기
select substring(product_code, 1, 2) as category, count(product_id) as products
from product
group by category
order by product_code

가격이 제일 비싼 식품의 정보 출력하기
select product_id, product_name, product_cd, category, price
from food_product
order by price desc
limit 1

조건에 맞는 도서와 저자 리스트 출력하기
select b.book_id, a.author_name, date_format(b.published_date, '%Y-%m-%d') published_date
from book b inner join author a
on b.author_id = a.author_id
where b.category = '경제'
order by published_date