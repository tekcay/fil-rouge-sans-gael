import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { CardsComponent } from './corpus/cards/cards.component';
import { CreateFormaComponent } from './corpus/create-forma/create-forma.component';
import { ListFormaComponent } from './corpus/list-forma/list-forma.component';
import { SearchFormaComponent } from './corpus/search-forma/search-forma.component';
import { UserProfileComponent } from './corpus/user-profile/user-profile.component';
import { RegisterFormComponent } from './corpus/register-form/register-form.component';
import { PoliciesComponent } from './policies/policies.component';
import { PropsectionComponent } from './propsection/propsection.component';
import { StatsComponent } from './stats/stats.component';

import { CardsAchievementComponent } from './corpus/cards/cards-achievement/cards-achievement.component';
import { CardsCreateComponent } from './corpus/cards/cards-create/cards-create.component';
import { CardsListComponent } from './corpus/cards/cards-list/cards-list.component';
import { CardsParamComponent } from './corpus/cards/cards-param/cards-param.component';
import { CardsSearchComponent } from './corpus/cards/cards-search/cards-search.component';

const routes: Routes = [
    { path: 'home', component: HomeComponent },
    { path: 'cards', component: CardsComponent,
    children: [
      { path: 'cards-list', component: CardsListComponent },
      { path: 'cards-search', component: CardsSearchComponent },
      { path: 'cards-create', component: CardsCreateComponent },
      { path: 'cards-achievement', component: CardsAchievementComponent },
      { path: 'cards-param', component: CardsParamComponent }
    ]},
    { path: 'create', component: CreateFormaComponent },
    { path: 'liste', component: ListFormaComponent },
    { path: 'search', component: SearchFormaComponent },
    { path: 'profile', component: UserProfileComponent },
    { path: 'register', component: RegisterFormComponent },
    { path: 'policies', component: PoliciesComponent },
    { path: 'stats', component: StatsComponent },
    { path: 'prospect', component: PropsectionComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
