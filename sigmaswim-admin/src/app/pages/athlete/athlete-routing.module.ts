import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';

import { AthletePageComponent } from './containers';

const routes: Routes = [
  {
    path: '',
    component: AthletePageComponent
  }
];

@NgModule({
  imports: [
    RouterModule.forChild(routes)
  ],
  exports: [RouterModule]
})

export class AthleteRoutingModule {
}
