import { Component, Input, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { SharedService } from 'src/app/backFrontCom/services/shared-service/shared.service';
import * as myGlobals from '../../global';

@Component({
  selector: 'app-cards',
  templateUrl: './cards.component.html',
  styleUrls: ['./cards.component.scss']
})
export class CardsComponent implements OnInit{
  role: string ="";

  private roleSubscription: Subscription = new Subscription;

  constructor(private sharedService: SharedService) {this.role=this.sharedService.getRole()}

  ngOnInit(): void {
    this.roleSubscription=this.sharedService.role.subscribe(r => {console.log("card subscribe")});
  }

  ngOnDestroy(){
    this.roleSubscription.unsubscribe()
  }




}
