오랜 기간 보호한 동물(1)
select a.name, a.datetime
from animal_ins a
where a.animal_id not in (select animal_id from animal_outs)
order by a.datetime
limit 3