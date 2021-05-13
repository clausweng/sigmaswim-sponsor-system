update athlete a set team_id = (select id from team t where t.ref = a.team_ref) where team_id is null;
