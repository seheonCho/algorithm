서울에 위치한 식당 목록 출력하기
select a.rest_id, a.rest_name, a.food_type, a.favorites, a.address, b.score
from rest_info a inner join
(select rest_id, round(avg(review_score), 2) as score
from rest_review
group by rest_id) b
on a.rest_id = b.rest_id
where a.address like '서울%'
order by b.score desc, a.favorites desc

오프라인/온라인 판매 데이터 통합하기
select date_format(sales_date, '%Y-%m-%d') as sales_date, product_id, user_id, sales_amount
from (select sales_date, product_id, user_id, sales_amount
from online_sale
union
select sales_date, product_id, null as user_id, sales_amount
from offline_sale) a
where date_format(sales_date, '%m') = '03'
order by sales_date, product_id, user_id

보호소에서 중성화한 동물
select i.animal_id, i.animal_type, i.name
from animal_ins i left outer join animal_outs o
on i.animal_id = o.animal_id
where (i.sex_upon_intake = 'Intact Female' or i.sex_upon_intake = 'Intact male')
and (o.sex_upon_outcome = 'Spayed Female' or o.sex_upon_outcome = 'Neutered Male')
order by i.animal_id