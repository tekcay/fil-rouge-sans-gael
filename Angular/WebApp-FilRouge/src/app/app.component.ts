import { Component, EventEmitter, Input, Output, ViewChild } from '@angular/core';
import { ButtonsComponent } from './header/hamburger-menu/buttons/buttons.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'WebApp-FilRouge';
  @ViewChild(ButtonsComponent) buttonSelect: any;
  role:string ="";
  ngAfterViewInit() {
    this.role = this.buttonSelect.role;
    console.log(this.role)
  }

}
