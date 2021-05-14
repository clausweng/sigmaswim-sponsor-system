import {Component, OnInit, ViewChild} from '@angular/core';
import {Athlete} from '../../models/Athlete';
import {SelectionModel} from '@angular/cdk/collections';
import {MatPaginator} from '@angular/material/paginator';
import {AthleteService} from '../../services/athlete.service';

@Component({
  selector: 'app-athlete-page',
  templateUrl: './athlete-page.component.html',
  styleUrls: ['./athlete-page.component.scss'],
  providers: [AthleteService]
})
export class AthletePageComponent implements OnInit{
  public dataSource: Athlete[] = [];
  public displayedColumns: string[] = ['firstName', 'lastName', 'team', 'year', 'gender'];


  constructor(private athleteService: AthleteService) {
  }

  ngOnInit(): void {
    this.athleteService.getAthletes().subscribe(athletes => {
      this.dataSource = athletes;
    });
  }



}
