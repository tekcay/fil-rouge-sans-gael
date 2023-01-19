import { Component } from '@angular/core';
import { Formation } from 'src/app/backFrontCom/classes/formation';
import { FormationService } from 'src/app/backFrontCom/services/formation/formation.service';
import { IFormation } from 'src/app/interfaces/formation';

@Component({
  selector: 'app-cards-list',
  templateUrl: './cards-list.component.html',
  styleUrls: ['./cards-list.component.scss']
})
export class CardsListComponent {
  formations : Formation[] =[];
    formation : Formation = undefined!;
    constructor(private formationService:FormationService){}

    ngOnInit():void {
      this.formationService.findAll().subscribe(data=>{this.formations=data});
    }
}
