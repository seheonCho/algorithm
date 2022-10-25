오랜 기간 보호한 동물(1)
select a.name, a.datetime
from animal_ins a
where a.animal_id not in (select animal_id from animal_outs)
order by a.datetime
limit 3

오랜 기간 보호한 동물(2)
select a.animal_id, a.name
from animal_ins a inner join animal_outs b
on a.animal_id = b.animal_id
order by b.datetime - a.datetime desc
limit 2

있었는데요 없었습니다
select a.animal_id, a.name
from animal_ins a inner join animal_outs b
on a.animal_id = b.animal_id
and a.datetime > b.datetime
order by a.datetime