import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';

import { AthletePageComponent } from './containers';
import { AthleteRoutingModule } from './athlete-routing.module';
import { SharedModule } from '../../shared/shared.module';
import {MatTableModule} from '@angular/material/table';
import {MatPaginatorModule} from '@angular/material/paginator';
import {HttpClient, HttpClientModule} from '@angular/common/http';

@NgModule({
  declarations: [AthletePageComponent],
  imports: [
    CommonModule,
    AthleteRoutingModule,
    MatCardModule,
    MatToolbarModule,
    SharedModule,
    MatTableModule,
    MatPaginatorModule,
    HttpClientModule
  ],
  providers: [
      HttpClient
  ]
})
export class AthleteModule { }
