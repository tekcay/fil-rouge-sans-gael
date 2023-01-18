import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Subscription } from 'rxjs';
import { SharedService } from 'src/app/services/shared-service/shared.service';
import *  as myGlobals from '../../../global'

@Component({
  selector: 'app-buttons',
  templateUrl: './buttons.component.html',
  styleUrls: ['./buttons.component.scss']
})
export class ButtonsComponent implements OnInit{
  private roleSubscription: Subscription = new Subscription;

  constructor(private sharedService: SharedService) {}

  ngOnInit(): void {
    this.roleSubscription=this.sharedService.role.subscribe(r => {console.log("buttons subscribe")})
  }

  ngOnDestroy(){
    this.roleSubscription.unsubscribe()
  }

  onChangeAdmin(){
    this.sharedService.setRole("admin");
    console.log(this.sharedService.getRole())
  }

  onChangeUser(){
    this.sharedService.setRole("user");
    console.log(this.sharedService.getRole())
  }
}
