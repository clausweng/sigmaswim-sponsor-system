export class Athlete {
  id: number;
  firstName: string;
  lastName: string;
  team: Team;
  year: number;
  gender: string;
}

export class Team {
  id: number;
  ref: string;
  name: string;
}
