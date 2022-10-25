# Write your MySQL query statement below

DELETE p1 FROM PERSON p1,PERSON p2 
where p1.Email=p2.Email AND p1.Id>p2.Id;