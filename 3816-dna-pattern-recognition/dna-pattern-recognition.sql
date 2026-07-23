# Write your MySQL query statement below
select *, 
case when dna_sequence LIKE 'ATG%' THEN 1 ELSE 0 END AS has_start,
case when dna_sequence LIKE '%TAA'or
          dna_sequence LIKE '%TAG' or
          dna_sequence LIKE '%TGA' THEN 1 ELSE 0 END AS has_stop,
case when dna_sequence LIKE '%ATAT%' THEN 1 ELSE 0 END AS has_atat,
case when dna_sequence LIKE '%GGG%' THEN 1 ELSE 0 END AS has_ggg 
from Samples;         