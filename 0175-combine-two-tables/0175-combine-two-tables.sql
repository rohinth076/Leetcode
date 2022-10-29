# Write your MySQL query statement below
SELECT p.FirstName AS "FirstName", p.LastName AS "LastName", 
   a.City AS "City", a.State AS "State" FROM Person p left join Address a on p.PersonId =a.personId;