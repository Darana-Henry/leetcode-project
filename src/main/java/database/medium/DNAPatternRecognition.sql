--https://leetcode.com/problems/dna-pattern-recognition/

select *,
dna_sequence REGEXP '^ATG' as has_start,
dna_sequence REGEXP 'TAA$|TAG$|TGA$' as has_stop,
dna_sequence REGEXP 'ATAT' as has_atat,
dna_sequence REGEXP 'GGG' AS has_ggg
from samples
order by sample_id