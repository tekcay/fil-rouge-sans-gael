import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { CardsComponent } from './corpus/cards/cards.component';
import { CreateFormaComponent } from './corpus/create-forma/create-forma.component';
import { ListFormaComponent } from './corpus/list-forma/list-forma.component';
import { SearchFormaComponent } from './corpus/search-forma/search-forma.component';
import { UserProfileComponent } from './corpus/user-profile/user-profile.component';


const routes: Routes = [
  { path: 'cards', component: CardsComponent },
  { path: 'create', component: CreateFormaComponent },
  { path: 'liste', component: ListFormaComponent },
  { path: 'search', component: SearchFormaComponent },
  { path: 'profile', component: UserProfileComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
