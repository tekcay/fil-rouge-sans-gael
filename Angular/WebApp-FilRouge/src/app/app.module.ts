import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { CorpusComponent } from './corpus/corpus.component';
import { CardsComponent } from './corpus/cards/cards.component';
import { SearchbarComponent } from './header/searchbar/searchbar.component';
import { HamburgerMenuComponent } from './header/hamburger-menu/hamburger-menu.component';
import { ButtonsComponent } from './header/buttons/buttons.component';
import { FooterComponent } from './footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    CorpusComponent,
    CardsComponent,
    SearchbarComponent,
    HamburgerMenuComponent,
    ButtonsComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
