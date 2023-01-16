import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CorpusComponent } from './corpus/corpus.component';
import { CardsComponent } from './corpus/cards/cards.component';
import { SearchbarComponent } from './header/hamburger-menu/searchbar/searchbar.component';
import { HamburgerMenuComponent } from './header/hamburger-menu/hamburger-menu.component';
import { ButtonsComponent } from './header/hamburger-menu/buttons/buttons.component';
import { FooterComponent } from './footer/footer.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { WebsiteLogoComponent } from './header/website-logo/website-logo.component';
import { LinksComponent } from './footer/links/links.component';
import { ListFormaComponent } from './corpus/list-forma/list-forma.component';
import { SearchFormaComponent } from './corpus/search-forma/search-forma.component';
import { CreateFormaComponent } from './corpus/create-forma/create-forma.component';
import { UserProfileComponent } from './corpus/user-profile/user-profile.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    CorpusComponent,
    CardsComponent,
    SearchbarComponent,
    HamburgerMenuComponent,
    ButtonsComponent,
    WebsiteLogoComponent,
    LinksComponent,
    ListFormaComponent,
    SearchFormaComponent,
    CreateFormaComponent,
    UserProfileComponent
  ],
  imports: [
    BrowserModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
